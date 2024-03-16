let phoneIpt = document.querySelector("#phoneIpt");// 手机号 input
let codeIpt = document.querySelector("#codeIpt");// 验证码 input
let passwordIpt = document.querySelector("#passwordIpt");// 密码 input
let rePwdIpt = document.querySelector("#rePwdIpt");// 重复密码 input

let sendCodeBtn = document.querySelector("#sendCodeBtn");// 验证码获取 button
let registerBtn = document.querySelector("#registerBtn");// 注册按钮 button

let phoneSpan = document.querySelector("#sp1");// 手机号 span
let codeSpan = document.querySelector("#sp2");// 验证码 span
let passwordSpan = document.querySelector("#sp3");// 密码 span
let rePwdSpan = document.querySelector("#sp4");// 重复密码 span
let registerMsg = document.querySelector("#registerMsg");// 注册失败消息提示框

let phoneType = false, // 手机号 flag
    codeType = false, // 验证码 flag
    pwdType = false, // 密码 flag
    rePwdType = false; // 重复密码 flag

let codeFromServer = ""; // 从服务端接收的验证码
let codeCount = 60; // 验证码的倒计时
let codeTimer; // 验证码的计时器

phoneIpt.onblur = function () {
    if (phoneType === false) {
        phoneSpan.innerText = "手机号格式有误，请重新输入";
        let timer = setTimeout(function () {
            phoneSpan.innerText = "";
            clearTimeout(timer);
        }, 2000);
    }
};
passwordIpt.onblur = function () {
    if (pwdType === false) {
        passwordSpan.innerText = "密码格式有误，请重新输入";
        let timer = setTimeout(function () {
            passwordSpan.innerText = "";
            clearTimeout(timer);
        }, 2000);
    }
};
rePwdIpt.onblur = function () {
    // 重复密码
    if (rePwdType === false) {
        if (passwordIpt.value === "")
            rePwdSpan.innerText = "请先输入密码";
        else
            rePwdSpan.innerText = "两次密码输入不一致，请核对";
        let timer = setTimeout(function () {
            rePwdSpan.innerText = "";
            clearTimeout(timer);
        }, 2000);
    }
};
codeIpt.onblur = function () {
    // 验证码
    if (codeType === false) {
        let text = "验证码输入有误，请重试";
        if (codeFromServer === "")
            text = "请先获取验证码";
        codeSpan.innerText = text;
        let timer = setTimeout(function () {
            codeSpan.innerText = "";
            clearTimeout(timer);
        }, 2000);
    }
};

phoneIpt.oninput = function () {
    phoneType = /^[1][3456789][0-9]{9}$/.test(phoneIpt.value);
    checked();
};
passwordIpt.oninput = function () {
    pwdType = /^[0-9a-zA-Z_]{6,16}$/.test(passwordIpt.value);
    checked();
};
rePwdIpt.oninput = function () {
    rePwdType = passwordIpt.value !== "" || rePwdIpt.value === passwordIpt.value;
    checked();
};
codeIpt.oninput = function () {
    codeType = codeFromServer !== "" && codeIpt.value === codeFromServer;
    checked();
};

function checked() {
    if (phoneType && codeType && pwdType && rePwdType)
        registerBtn.removeAttribute("disabled");
    else
        registerBtn.disabled = "disabled";
}//控制显示与隐藏的方法

// 更改验证码按钮状态以及内容函数
let changeCodeBtn = function () {
    sendCodeBtn.innerText = (codeCount--) + "秒后重试";
    if (codeCount < 0) {
        clearInterval(codeTimer);
        sendCodeBtn.innerText = "发送验证码";
        sendCodeBtn.removeAttribute("disabled");
        codeCount = 60;
        codeFromServer = "";
    }
    return changeCodeBtn;
};

// 验证码按钮点击事件
sendCodeBtn.onclick = function () {
    // 手机号不符合规则
    if (phoneType !== true) {
        codeSpan.innerText = "请先输入手机号码";
        let timer = setTimeout(function () {
            codeSpan.innerText = "";
            clearTimeout(timer);
        }, 2000);
        return;
    }//不符合规定 提示两秒后消失
    sendCodeBtn.disabled = "disabled";//发送按钮禁用
    codeTimer = setInterval(changeCodeBtn(), 1000);//60秒倒计时
    let sendContent = "custTelno=" + phoneIpt.value.trim();//去空格，把用户的手机号或者/邮箱传过去
    let url = ROOTSources + "/customer/getCode?" + sendContent;
    let ajax = new XMLHttpRequest() || new ActiveXObject('Microsoft.XMLHTTP');
    ajax.open("GET", url, true);
    ajax.send();
    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4) {
            if (ajax.status >= 200 && ajax.status < 300 || ajax.status === 304) {
                try {
                    let result = JSON.parse(ajax.responseText);
                    if (result.status === 0)
                        codeSpan.innerText = result.data; // 状态为 用户已经存在
                    else
                        codeFromServer = result.data + ""; // 可以注册
                } catch (e) {
                    codeSpan.innerText = "验证码获取失败，请重试";
                } finally {
                    let timer = setTimeout(function () {
                        codeSpan.innerText = "";
                        clearTimeout(timer);
                    }, 2000);
                }
            }
        }
    }
};

// 注册点击事件
registerBtn.onclick = function () {
    let inputContent = document.querySelector("#signup").serialize();//序列化获取表单数据
    let url = ROOTSources + "/customer/add";
    let ajax = new XMLHttpRequest() || new ActiveXObject('Microsoft.XMLHTTP');
    ajax.open("POST", url, true);
    ajax.setRequestHeader("content-type","application/x-www-form-urlencoded");
    ajax.send(inputContent);
    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4) {
            if (ajax.status >= 200 && ajax.status < 300 || ajax.status === 304)
                window.location.href = ROOTSources + "/login";
            else {
                registerMsg.innerText = "注册失败，请重试";
                let timer = setTimeout(function () {
                    registerMsg.innerText = "";
                    clearTimeout(timer);
                }, 2000);
            }
        }
    }
};

