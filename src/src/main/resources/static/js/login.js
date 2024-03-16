let signup = document.querySelector("#signup"); // form表单

let loginByPassword = document.querySelector("#loginByPassword"); // 密码登录选项卡
let loginByCode = document.querySelector("#loginByCode"); // 验证码登录选项卡

let usernameType = -1; // 手机号/邮箱类型标记 - 0手机号；1邮箱
let valueType = false; // 密码格式


loginByPassword.onclick = loginByPasswordFunction;

function loginByPasswordFunction() {
    if (this.className !== "choose") {
        loginByCode.className = "";
        this.className = "choose";
        signup.innerHTML = `<div></div><div></div>
                        <div>
                            <label for="username">手机号、邮箱</label>
                            <span id="usernameSpan"></span>
                        </div>
                        <div>
                        <input type="hidden" name="type" value="1">
                            <input type="text" maxlength="20" class="ipt1" id="username" name="username"
                                   placeholder="手机号、邮箱">
                        </div>
                        <div></div>
                        <div>
                            <label for="password">密码</label>
                            <span id="passwordSpan"></span>
                        </div>
                        <div>
                            <input type="password" class="ipt1" maxlength="16" id="password" name="password"
                                   placeholder="请输入密码">
                        </div>
                        <div>
                            <span id="loginMsg"></span>
                        </div>
                        <div>
                            <p class="toRe">
                                还没有账号？
                                <a href="${ROOTSources}/register">免费注册</a>
                            </p>
                        </div>
                        <div>
                            <button type="button" class="btn" id="loginBtn" disabled>登录</button>
                        </div>`;
        bindingEventsFunction();
    }
}

loginByCode.onclick = function () {
    if (this.className !== "choose") {
        loginByPassword.className = "";
        this.className = "choose";
        signup.innerHTML = `<div></div><div></div>
                        <div>
                            <label for="username">手机号码</label>
                            <span id="usernameSpan"></span>
                        </div>
                        <div>
                            <input type="hidden" name="type" value="2">
                            <input type="text" maxlength="11" class="ipt1" id="username" name="username"
                                   placeholder="请输入手机号">
                        </div>
                        <div></div>
                        <div>
                            <label for="msgCode">短信验证码</label>
                            <span id="msgCodeSpan"></span>
                        </div>
                        <div>
                            <input type="text" class="ipt2" maxlength="4" id="msgCode" name="msgCode"
                                   placeholder="请输入验证码">
                            <button type="button" class="btn" id="sendCodeBtn">发送验证码</button>
                        </div>
                        <div>
                            <span id="loginMsg"></span>
                        </div>
                        <div>
                            <p class="toRe">
                                还没有账号？
                                <a href="${ROOTSources}/register">免费注册</a>
                            </p>
                        </div>
                        <div>
                            <button type="button" class="btn" id="loginBtn" disabled>登录</button>
                        </div>`;
        bindingEventsFunction();
    }
};

function bindingEventsFunction() {
    usernameType = -1; // 手机号/邮箱类型标记 - 0手机号；1邮箱
    valueType = false; // 密码格式
    let usernameIpt = document.querySelector("#username"); // 手机号/邮箱 input
    let usernameSpan = document.querySelector("#usernameSpan"); // 手机号/邮箱 span
    let passwordIpt = document.querySelector("#password"); // 密码 input
    let passwordSpan = document.querySelector("#passwordSpan"); // 密码 span

    let loginBtn = document.querySelector("#loginBtn"); // 登录按钮

    let msgCodeIpt = document.querySelector("#msgCode"); // 验证码 input
    let msgCodeSpan = document.querySelector("#msgCodeSpan"); // 验证码 span
    let loginMsg = document.querySelector("#loginMsg"); // 登录信息提示框

    usernameIpt.onblur = function () {
        if (usernameType === -1) {
            // 不符合格式
            usernameSpan.innerText = "格式错误，请重新输入";
            let timer = setTimeout(function () {
                usernameSpan.innerText = "";
                clearTimeout(timer);
            }, 2000);
        }
    };

    try {
        passwordIpt.onblur = function () {
            if (valueType === false) {
                passwordSpan.innerText = "密码格式有误，请重新输入";
                let timer = setTimeout(function () {
                    passwordSpan.innerText = "";
                    clearTimeout(timer);
                }, 2000);
            }
        };
        passwordIpt.oninput = function () {
            valueType = /^[0-9a-zA-Z_]{6,16}$/.test(passwordIpt.value);
            checked(loginBtn);
        };
        usernameIpt.oninput = function () {
            if (/^[1][3456789][0-9]{9}$/.test(usernameIpt.value))
                usernameType = 0; // 手机号
            else if (/^[a-zA-Z0-9_]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_]+)+$/.test(usernameIpt.value))
                usernameType = 1; // 邮箱
            else
                usernameType = -1; // 不符合格式
            checked(loginBtn);
        };
    } catch (e) {
        usernameIpt.oninput = function () {
            if (/^[1][3456789][0-9]{9}$/.test(usernameIpt.value))
                usernameType = 0; // 手机号
            else
                usernameType = -1; // 不符合格式
            checked(loginBtn);
        };
        msgCodeIpt.onblur = function () {
            if (valueType === false) {
                msgCodeSpan.innerText = "验证码有误，请重新输入";
                let timer = setTimeout(function () {
                    passwordSpan.innerText = "";
                    clearTimeout(timer);
                }, 2000);
            }
        };
        msgCodeIpt.oninput = function () {
            valueType = passwordIpt.value.length === 6;
            checked(loginBtn);
        };
    }

    loginBtn.onclick = function () {
        let inputContent = document.querySelector("#signup").serialize();
        let sendContent = inputContent + "&userType=" + usernameType;
        let url = ROOTSources + "/customer/login?" + sendContent;
        let ajax = new XMLHttpRequest() || new ActiveXObject('Microsoft.XMLHTTP');
        ajax.open("GET", url, true);
        ajax.send();
        console.log(usernameType);
        ajax.onreadystatechange = function () {
            if (ajax.readyState === 4) {
                if (ajax.status >= 200 && ajax.status < 300 || ajax.status === 304) {
                    try {
                        if (typeof JSON.parse(ajax.responseText).data === "object") {
                            window.location.href = ROOTSources + "/";
                            return;
                        }
                        loginMsg.innerText = JSON.parse(ajax.responseText).data;
                    } catch (e) {
                        loginMsg.innerText = "登录失败，请重试";
                    }
                }
                let timer = setTimeout(function () {
                    loginMsg.innerText = "";
                    clearTimeout(timer);
                }, 2000);
            }
        }
    };
}

function checked(loginBtnEle) {
    if (usernameType !== -1 && valueType) {
        loginBtnEle.removeAttribute("disabled");
    } else
        loginBtnEle.disabled = "disabled";
}


loginByPasswordFunction();