let
    Urls = {
        toPreview: ROOTSources + "/resume/" + resumeId + "/prev",
    };
let Icons = {
    cssEdit: "url(" + ROOTSources + "/images/createResume/edit_icon.svg)",
    cssDelete: "url(" + ROOTSources + "/images/createResume/delete.svg)",
    cssEdit2: "url(" + ROOTSources + "/images/createResume/edit_icon2.svg)",
    cssDelete2: "url(" + ROOTSources + "/images/createResume/delete2.svg)",
    emailPng: ROOTSources + "/images/createResume/email.png",
    telPng: ROOTSources + "/images/createResume/tel.png"
};
let SkillsLabelName = {
    // s1: "精通", /*精通*/
    // s2: "熟练", /*熟练*/
    // s3: "良好", /*良好*/
    // s4: "一般", /*一般*/
    s1: "\u7cbe\u901a", /*精通*/
    s2: "\u719f\u7ec3", /*熟练*/
    s3: "\u826f\u597d", /*良好*/
    s4: "\u4e00\u822c", /*一般*/
};

const DBTemplate = {//把这些数据库中的数据都拿出来封装成对象，用谁拿谁
    resumeObj: (obj) => {//简历表的对象
        return {
            resumeId: obj.resumeId, // 
            custId: obj.custId, // 
            resumeName: obj.resumeName,
            resumeCreateTime: obj.resumeCreateTime,
            resumeUpdateTime: obj.resumeUpdateTime, // 
            resumeProfile: obj.resumeProfile,
            resumeBirth: obj.resumeBirth,
            resumeTelno: obj.resumeTelno,
            resumeEmail: obj.resumeEmail,
            resumeGender: obj.resumeGender,
            resumeLeavingWorking: obj.resumeLeavingWorking,
            resumeLiveCity: obj.resumeLiveCity,
            resumePersonid: obj.resumePersonid,
            resumeIncome: obj.resumeIncome,
            resumeFullPartTime: obj.resumeFullPartTime,
            status: obj.status, // 
            other1: obj.other1, // 
            other2: obj.other2 // 
        }
    },

    projectExperienceObj: (obj) => {//项目经验
        return {
            projectExperiId: obj.projectExperiId, // 
            resumeId: obj.resumeId, // 
            projectCompanyName: obj.projectCompanyName,
            projectStartTime: obj.projectStartTime,
            projectEndTime: obj.projectEndTime,
            projectName: obj.projectName,
            projectContentDesc: obj.projectContentDesc,
            projectDutyDesc: obj.projectDutyDesc,
            status: obj.status, // 
            other1: obj.other1, // 
            other2: obj.other2 // 
        }
    },
    skillObj: (obj) => {//技能
        return {
            skillId: obj.skillId, // 
            resumeId: obj.resumeId, // 
            skillName: obj.skillName,
            skillDesc: obj.skillDesc,
            status: obj.status, // 
            other1: obj.other1, // 
            other2: obj.other2 // 
        }
    },
    honorObj: (obj) => {//荣誉
        return {
            honorId: obj.honorId, // 
            resumeId: obj.resumeId, // 
            honorCreateTime: obj.honorCreateTime,
            honorName: obj.honorName,
            honorGrade: obj.honorGrade,
            status: obj.status, // 
            other1: obj.other1 // 
        }
    },
};
const EmptyObj = {//初始的都为空
    resumeObj: {
        resumeId: "",
        custId: "",
        resumeName: "",
        resumeCreateTime: "",
        resumeUpdateTime: "",
        resumeProfile: "",
        resumeBirth: "",
        resumeTelno: "",
        resumeEmail: "",
        resumeGender: "",
        resumeLeavingWorking: "",
        resumeLiveCity: "",
        resumePersonid: "",
        resumeIncome: "",
        resumeFullPartTime: "",
        status: "",
        other1: "",
        other2: ""
    },
    workExperienceObj: {
        workExperiId: "", // 
        resumeId: "", // 
        workStartTime: "",
        workEndTime: "",
        workCompanyName: "",
        workPosition: "",
        workDepartment: "",
        workCompanyScaler: "",
        workCompanyProperty: "",
        workDesc: "",
        workType: "",
        status: "", // 
        other1: "", // 
        other2: "" // 
    },
    projectExperienceObj: {
        projectExperiId: "", // 
        resumeId: "", // 
        projectCompanyName: "",
        projectStartTime: "",
        projectEndTime: "",
        projectName: "",
        projectContentDesc: "",
        projectDutyDesc: "",
        status: "", // 
        other1: "", // 
        other2: "" // 
    },
    skillObj: {
        skillId: "", // 
        resumeId: "", // 
        skillName: "",
        skillDesc: "",
        status: "", // 
        other1: "", // 
        other2: "" // 
    },
    honorObj: {
        honorId: "", // 
        resumeId: "", // 
        honorCreateTime: "",
        honorName: "",
        honorGrade: "",
        status: "", // 
        other1: "" // 
    },
};
//编译界面
let EditTemplate = {
    basic: function (obj) {
        let {...temp} = EmptyObj.resumeObj;//散列，复制出一份空模板
        let arr = Object.getOwnPropertyNames(temp);//获取了一个属性名的数组
        console.log(arr);

        for (let i = 0; i < arr.length; i++) {
            temp[arr[i]] = obj[arr[i]] || ""//把拿到的对象中的null和undefined去掉，并且一一赋值
        }
        obj = temp;//重新定义这个对象
        let resume = DBTemplate.resumeObj(obj);//拿到用户表对象
        let output = document.createElement("form");//渲染 新建一个表单
        output.id = "basic_" + resume.resumeId;//表单的id
        output.className = "content";//表单的类名
        let content = `<div class="oh">
                            <div class="float_l oh">
                                <div class="oh">
                                    <div class="float_l item_type1">
                                        <label>简历名称</label>
                                        <input type="text" value="${resume.resumeName}" name="resumeName">
                                    </div>
                                     <div class="float_l item_type1">
                                       <label>出生日期</label>
                                       <input type="date" value="${resume.resumeBirth}" name="resumeBirth">
                                    </div>
                                </div>
                                <div class="oh">
                                    <div class="float_l item_type1">
                                        <label>手机号码</label>
                                        <input type="text" value="${resume.resumeTelno}" name="resumeTelno">
                                    </div>
                                    <div class="float_l item_type1">
                                        <label>邮箱</label>
                                        <input type="text" value="${resume.resumeEmail}" name="resumeEmail">
                                    </div>
                                </div>
                                <div class="oh">
                                    <div class="float_l item_type1">
                                        <label>性别</label>
                                        <input type="hidden">`;
        if (resume.resumeGender === "M")
            content += `<select name="resumeGender" id="">
                                            <option value="">请选择</option>
                                            <option value="M" selected>男</option>
                                            <option value="F">女</option>
                                        </select>`;
        else if (resume.resumeGender === "F")
            content += `<select name="resumeGender" id="">
                             <option value="">请选择</option>
                             <option value="M">男</option>
                             <option value="F" selected>女</option>
                        </select>`;
        else
            content += `<select name="resumeGender" id="">
                            <option value="" selected>男</option>
                            <option value="M">男</option>
                            <option value="F">女</option>
                        </select>`;
        content += `</div><div class="float_l item_type1">
                          <label>求职状态</label>
                          <input type="hidden">`;
        if (resume.resumeLeavingWorking === "目前正在找工作")
            content += `<select name="resumeLeavingWorking" id="">
                            <option value="">请选择</option>
                            <option value="目前正在找工作" selected>目前正在找工作</option>
                            <option value="waiting">有机会会考虑</option>
                            <option value="nochange">目前不想找工作</option>
                        </select>`;
        else if (resume.resumeLeavingWorking === "有机会会考虑")
            content += `<select name="resumeLeavingWorking" id="">
                            <option value="">请选择</option>
                            <option value="目前正在找工作">目前正在找工作</option>
                            <option value="有机会会考虑" selected>有机会会考虑</option>
                            <option value="目前不想找工作">目前不想找工作</option>
                        </select>`;
        else if (resume.resumeLeavingWorking === "目前不想找工作")
            content += `<select name="resumeLeavingWorking" id="">
                            <option value="">请选择</option>
                            <option value="目前正在找工作">目前正在找工作</option>
                            <option value="有机会会考虑">有机会会考虑</option>
                            <option value="目前不想找工作" selected>目前不想找工作</option>
                        </select>`;
        else
            content += `<select name="resumeLeavingWorking" id="">
                            <option value="">请选择</option>
                            <option value="目前正在找工作" selected>目前正在找工作</option>
                            <option value="有机会会考虑">有机会会考虑</option>
                            <option value="目前不想找工作">目前不想找工作</option>
                        </select>`;
        content += `</div></div>
                   
                    <div class="oh">
                        <div class="float_l item_type1">
                            <label>年收入</label>
                            <input type="text" value="${resume.resumeIncome}" name="resumeIncome">
                        </div>
                        <div class="float_l item_type1">
                            <label>工作类型</label>
                            <input type="hidden">`;
        if (resume.resumeFullPartTime === "全职")
            content += `<select name="resumeFullPartTime" id="">
                            <option value="">请选择</option>
                            <option value="全职" selected>全职</option>
                            <option value="兼职">兼职</option>
                        </select>`;
        else if (resume.resumeFullPartTime === "兼职")
            content += `<select name="resumeFullPartTime" id="">
                            <option value="">请选择</option>
                            <option value="全职">全职</option>
                            <option value="兼职" selected>兼职</option>
                        </select>`;
        else
            content += `<select name="resumeFullPartTime" id="">
                            <option value="" selected>全职</option>
                            <option value="全职">全职</option>
                            <option value="兼职">兼职</option>
                        </select>`;
        content += `</div></div></div></div>`;
        output.innerHTML = content;
        return output;
    },

    project: function (obj) {
        let {...temp} = EmptyObj.projectExperienceObj;
        let arr = Object.getOwnPropertyNames(temp);
        for (let i = 0; i < arr.length; i++) {
            temp[arr[i]] = obj[arr[i]] || ""
        }
        obj = temp;
        let proExObj = DBTemplate.projectExperienceObj(obj);
        let output = document.createElement("form");
        output.id = "project_" + proExObj.projectExperiId;
        output.className = "content";
        output.innerHTML = `<div class="oh">
                               <div class="float_l item_type1">
                                   <label>开始时间</label>
                                   <input type="date" value="${dateFormat(proExObj.projectStartTime, "-")}" name="projectStartTime">
                               </div>
                               <div class="float_l item_type1">
                                   <label>结束时间</label>
                                   <input type="date" value="${dateFormat(proExObj.projectEndTime, "-")}" name="projectEndTime">
                               </div>
                           </div>
                       <div class="oh">
                           <div class="float_l item_type1">
                               <label>公司名称</label>
                               <input type="text" value="${proExObj.projectCompanyName}" name="projectCompanyName">
                           </div>
                           <div class="float_l item_type1">
                               <label>项目名称</label>
                               <input type="text" value="${proExObj.projectName}" name="projectName">
                           </div>
                       </div>
                       <div class="oh">
                           <div class="float_l item_type2">
                               <label>项目描述</label>
                               <input type="hidden" value="">
                               <textarea name="projectContentDesc" rows="3">${proExObj.projectContentDesc}</textarea>
                           </div>
                       </div>
                       <div class="oh">
                           <div class="float_l item_type2">
                               <label>责任描述</label>
                               <input type="hidden" value="">
                               <textarea name="projectDutyDesc" rows="3">${proExObj.projectDutyDesc}</textarea>
                           </div>
                       </div>`;
        return output;
    },
    skills: function (obj) {
        let {...temp} = EmptyObj.skillObj;
        let arr = Object.getOwnPropertyNames(temp);
        for (let i = 0; i < arr.length; i++) {
            temp[arr[i]] = obj[arr[i]] || ""
        }
        obj = temp;
        let skillObj = DBTemplate.skillObj(obj);
        let selected1 = "",
            selected2 = "",
            selected3 = "",
            selected4 = "";
        let output = document.createElement("form");
        output.id = "skills_" + skillObj.skillId;
        output.className = "content";
        switch (skillObj.skillDesc) {
            case SkillsLabelName.s1:
                selected1 = "selected";
                break;
            case SkillsLabelName.s2:
                selected2 = "selected";
                break;
            case SkillsLabelName.s3:
                selected3 = "selected";
                break;
            case SkillsLabelName.s4:
                selected4 = "selected";
                break;
        }
        output.innerHTML = `<div class="oh">
                           <div class="float_l item_type1">
                                <label>技能/语言</label>
                                <input type="text" value="${skillObj.skillName}" name="skillName">
                           </div>
                           <div class="float_l item_type1">
                                <label>掌握程度</label>
                                <input type="hidden">
                                <select name="skillDesc" id="">
                                    <option value="">请选择</option>
                                    <option value="${SkillsLabelName.s1}" ${selected1}>${SkillsLabelName.s1}</option>
                                    <option value="${SkillsLabelName.s2}" ${selected2}>${SkillsLabelName.s2}</option>
                                    <option value="${SkillsLabelName.s3}" ${selected3}>${SkillsLabelName.s3}</option>
                                    <option value="${SkillsLabelName.s4}" ${selected4}>${SkillsLabelName.s4}</option>
                                </select>
                           </div>
                       </div>`;
        return output;
    },
    schoolHonor: function (obj) {
        let {...temp} = EmptyObj.honorObj;
        let arr = Object.getOwnPropertyNames(temp);
        for (let i = 0; i < arr.length; i++) {
            temp[arr[i]] = obj[arr[i]] || ""
        }
        obj = temp;
        let honorObj = DBTemplate.honorObj(obj);
        let output = document.createElement("form");
        output.id = "schoolHonor_" + honorObj.honorId;
        output.className = "content";
        output.innerHTML = `<div class="oh">
                           <div class="float_l item_type1">
                               <label>时间</label>
                               <input type="date" value="${dateFormat(honorObj.honorCreateTime, "-")}" name="honorCreateTime">
                           </div>
                           <div class="float_l item_type1">
                               <label>奖项</label>
                               <input type="text" value="${honorObj.honorName}" name="honorName">
                           </div>
                       </div>
                       <div class="oh">
                           <div class="float_l item_type1">
                               <label>级别</label>
                               <input type="text" value="${honorObj.honorGrade}" name="honorGrade">
                           </div>
                       </div>`;
        return output;
    }
};
// 预览界面
let PrevTemplate = {
    basic: function (obj) {
        let {...temp} = EmptyObj.resumeObj;
        let arr = Object.getOwnPropertyNames(temp);
        for (let i = 0; i < arr.length; i++) {
            temp[arr[i]] = obj[arr[i]] || ""
        }
        obj = temp;
        let resume = DBTemplate.resumeObj(obj);
        let output = document.createElement("form");
        output.id = "basic_" + resume.resumeId;
        output.className = "content";
        let age = 0;
        if (resume.resumeBirth !== "")
            age = Math.floor(new Date().getFullYear() - new Date(resume.resumeBirth).getFullYear());
        output.innerHTML = `<div class="oh">
                            
                            <div class="float_l oh">
                                <h2>${resume.resumeName}</h2>
                                <p class="at">
                                    <span>${resume.resumeLiveCity}</span>
                                    <span>${resume.resumeGender === "F" ? "女" : "男"}</span>
                                    <span>${age}岁 (${dateFormat(resume.resumeBirth, "-")})</span>
                                    <span>${resume.resumeLeavingWorking}</span>
                                </p>
                                <p class="tab">
                                    <img src="${Icons.emailPng}" alt="email">
                                    <span>${resume.resumeEmail}</span>
                                    <img src="${Icons.telPng}" alt="tel">
                                    <span>${resume.resumeTelno}</span>
                                </p>
                            </div>
                        </div>
                        <div class="oh">
                            <div class="float_l item_type1">
                                <label>目前年收入</label>
                                <span>${resume.resumeIncome}</span>
                            </div>
                         
                        </div>
                        <div class="oh">
                            <div class="float_l item_type1">
                                <label>工作类型</label>
                                <span>${resume.resumeFullPartTime}</span>
                            </div>
                        </div>`;
        return output;
    },

    project: function (obj) {
        let {...temp} = EmptyObj.projectExperienceObj;
        let arr = Object.getOwnPropertyNames(temp);
        for (let i = 0; i < arr.length; i++) {
            temp[arr[i]] = obj[arr[i]] || ""
        }
        obj = temp;
        let proExObj = DBTemplate.projectExperienceObj(obj);
        let output = document.createElement("form");
        output.id = "project_" + proExObj.projectExperiId;
        output.className = "content";
        output.innerHTML = `<div class="oh">
                            <div class="time_item">
                                <span>${dateFormat(proExObj.projectStartTime, "/")}-${dateFormat(proExObj.projectEndTime, "/")}</span>
                                <strong>${proExObj.projectCompanyName}</strong>
                            </div>
                        </div>
                        <div class="oh">
                            <div class="item_type2">
                                <label>项目名称</label>
                                <span>${proExObj.projectName}</span>
                            </div>
                        </div>
                        <div class="oh">
                            <div class="item_type2">
                                <label>项目描述</label>
                                <span>${proExObj.projectContentDesc}</span>
                            </div>
                        </div>
                        <div class="oh">
                            <div class="item_type2">
                                <label>责任描述</label>
                                <span>${proExObj.projectDutyDesc}</span>
                            </div>
                        </div>`;
        return output;
    },
    skills: function (obj) {
        let {...temp} = EmptyObj.skillObj;
        let arr = Object.getOwnPropertyNames(temp);
        for (let i = 0; i < arr.length; i++) {
            temp[arr[i]] = obj[arr[i]] || ""
        }
        obj = temp;
        let skillObj = DBTemplate.skillObj(obj);
        let output = document.createElement("form");
        output.id = "skills_" + skillObj.skillId;
        output.className = "content";
        let skillLabel = skillObj.skillDesc;
        let skillClass = getSkillClass(skillLabel);
        output.innerHTML = `<div class="oh">
                            <div class="item_type2">
                                <label>
                                    <strong>${skillObj.skillName}</strong>
                                </label>
                                <div class="progressBar ${skillClass}">
                                    <div></div>
                                </div>
                            </div>
                        </div>`;
        return output;
    },
    schoolHonor: function (obj) {
        let {...temp} = EmptyObj.honorObj;
        let arr = Object.getOwnPropertyNames(temp);
        for (let i = 0; i < arr.length; i++) {
            temp[arr[i]] = obj[arr[i]] || ""
        }
        obj = temp;
        let honorObj = DBTemplate.honorObj(obj);
        let output = document.createElement("form");
        output.id = "schoolHonor_" + honorObj.honorId;
        output.className = "content";
        output.innerHTML = `<div class="oh">
                            <div class="time_item">
                                <span>${dateFormat(honorObj.honorCreateTime, "/")}</span>
                                <strong>${honorObj.honorName}</strong>
                                <span>${honorObj.honorGrade}</span>
                            </div>
                        </div>`;
        return output;
    }
};

let ResumeOther1Template = {//简历名称部分
    resumeName: null,
    resumeUpdateTime: null,
    edit: function () {
        return `<input type="text" value="${ResumeOther1Template.resumeName}" id="resumeNameInput" autocomplete="off">
                <div class="btn_box">
                    <button type="button" onclick="saveNameClick()">保存</button>
                    <button type="button" onclick="cancelNameClick()">取消</button>    
                </div>`;
    },
    prev: function () {
        return `<h3>${ResumeOther1Template.resumeName}</h3>
                    <div>更新<span>${ResumeOther1Template.resumeUpdateTime}</span></div>
                    <div>公开</div>
                    <div class="stars"></div>
                    <div class="btn_box">
                        <button onclick="refreshBtnClick()">刷新</button>
                        <button onclick="previewBtnClick()">预览</button>
                    </div>
                    <div id="editNameBtn"></div>`
    }
};

let div_basic = document.querySelector("#basic");
let div_work = document.querySelector("#work");
let div_project = document.querySelector("#project");
let div_skills = document.querySelector("#skills");
let div_schoolHonor = document.querySelector("#schoolHonor");
let other1Content = document.querySelector("#other1Content");//简历名称的div 的id

// =============================================================
/**
 * 简历名称编辑点击事件操作
 */
function editNameClick() {
    other1Content.innerHTML = ResumeOther1Template.edit();
    btnNoUse();
}

/**
 * 简历名称修改的取消点击事件操作
 */
function cancelNameClick() {
    other1Content.innerHTML = ResumeOther1Template.prev();
    btnUse();
}

/**
 * 简历名称修改的保存点击事件操作
 */
function saveNameClick() {
    let url = "/resume/" + resumeId + "/modifyName";
    let sendContent = "resumeName=" + document.querySelector("#resumeNameInput").value.trim();
    // 向数据库发送修改条目请求
    ajaxPost(url, sendContent, function (revert) {
        ResumeOther1Template.resumeName = revert.data.resumeName;
        ResumeOther1Template.resumeUpdateTime = revert.data.resumeUpdateTime;
        cancelNameClick();
    })
}


// =============================================================


// ==========================按键点击事件==========================
/**
 * 刷新按钮点击事件
 */
function refreshBtnClick() {
    location.reload(true);
}

/**
 * 预览简历按钮点击事件
 */
function previewBtnClick() {
    window.location.href = Urls.toPreview;
}

// ==========================初始化函数==========================
window.onload = function () {
    prevFunction(undefined);
};

/**
 * 异步请求函数
 * @param url 请求地址(相对路径)
 * @param sendContent 请求追加信息
 * @param callback 回调函数
 */
function ajaxPost(url, sendContent, callback) {
    let ajax = new XMLHttpRequest() || new ActiveXObject('Microsoft.XMLHTTP');
    ajax.open("POST", ROOTSources + url, true);
    ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    ajax.send(sendContent);
    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4) {
            if (ajax.status >= 200 && ajax.status < 300 || ajax.status === 304)
                try {
                    callback(JSON.parse(ajax.responseText));
                } catch (e) {
                }
        }
    }
}

/**
 * div.content元素添加按钮
 * @param type 类型(0-删除按钮，1-编辑按钮，2-删除&编辑按钮，3-保存&取消按钮)
 * @param divElement 需要添加按钮的元素节点
 * @returns {HTMLDivElement} div.content元素节点
 */
function contentAddBtnsElement(type, divElement) {
    switch (type) {
        case 0:
            divElement.appendChild(deleteBtn());
            break;
        case 1:
            divElement.appendChild(editBtn());
            break;
        case 2:
            divElement.appendChild(editBtn());
            divElement.appendChild(deleteBtn());
            break;
        case 3:
            divElement.appendChild(saveCancelBtn());
            break;
        case 4:
            divElement.appendChild(saveCancelBtn2());
            break;
    }
    return divElement;
}

/**
 * 获得技能掌握程度的类名 控制长条的长
 * @param skillLabel 技能掌握程度名
 * @returns {string} 类名
 */
function getSkillClass(skillLabel) {
    switch (skillLabel) {
        case SkillsLabelName.s4:
            return "progressBar_type4";
        case SkillsLabelName.s3:
            return "progressBar_type3";
        case SkillsLabelName.s2:
            return "progressBar_type2";
        case SkillsLabelName.s1:
            return "progressBar_type1";
    }
}

/**
 * edit 编辑界面
 * 有e(编辑界面)-修改 没有e(新建项)-添加
 * @param e content元素节点
 */
{
    function editBasic(e) {
        let id = e.id.split("_")[1];//去除下划线 拿到ID
        let url = "/resume/" + id;
        ajaxPost(url, null, function (revert) {
            let obj = revert.data;
            let content = EditTemplate.basic(obj);
            let contentEle = contentAddBtnsElement(3, content);
            e.parentElement.replaceChild(contentEle, e);//替换节点
        })
    }

    function editWork(e) {
        if (e === undefined) {
            // 新建
            let newEle = EditTemplate.work(EmptyObj.workExperienceObj);
            let contentEle = contentAddBtnsElement(4, newEle);
            if (div_work.children.length >= 2)
                div_work.insertBefore(contentEle, div_work.children[1]);
            else
                div_work.appendChild(contentEle);
            return;
        }
        let id = e.id.split("_")[1];
        let url = "/resume/" + resumeId + "/work_exp/" + id;
        ajaxPost(url, null, function (revert) {
            let obj = revert.data;
            let content = EditTemplate.work(obj);
            let contentEle = contentAddBtnsElement(3, content);
            e.parentElement.replaceChild(contentEle, e);
        })
    }

    function editProject(e) {
        if (e === undefined) {
            let newEle = EditTemplate.project(EmptyObj.projectExperienceObj);
            let contentEle = contentAddBtnsElement(4, newEle);
            if (div_project.children.length >= 2)
                div_project.insertBefore(contentEle, div_project.children[1]);
            else
                div_project.appendChild(contentEle);
            return;
        }
        let id = e.id.split("_")[1];
        let url = "/resume/" + resumeId + "/project_exp/" + id;
        ajaxPost(url, null, function (revert) {
            let obj = revert.data;
            let content = EditTemplate.project(obj);
            let contentEle = contentAddBtnsElement(3, content);
            e.parentElement.replaceChild(contentEle, e);
        })
    }

    function editSkills(e) {
        if (e === undefined) {
            let newEle = EditTemplate.skills(EmptyObj.skillObj);
            let contentEle = contentAddBtnsElement(4, newEle);
            if (div_skills.children.length >= 2)
                div_skills.insertBefore(contentEle, div_skills.children[1]);
            else
                div_skills.appendChild(contentEle);
            return;
        }
        let id = e.id.split("_")[1];
        let url = "/resume/" + resumeId + "/skill/" + id;
        ajaxPost(url, null, function (revert) {
            let obj = revert.data;
            let content = EditTemplate.skills(obj);
            let contentEle = contentAddBtnsElement(3, content);
            e.parentElement.replaceChild(contentEle, e);
        })
    }

    function editSchoolHonor(e) {
        if (e === undefined) {
            let newEle = EditTemplate.schoolHonor(EmptyObj.honorObj);
            let contentEle = contentAddBtnsElement(4, newEle);
            if (div_schoolHonor.children.length >= 2)
                div_schoolHonor.insertBefore(contentEle, div_schoolHonor.children[1]);
            else
                div_schoolHonor.appendChild(contentEle);
            return;
        }
        let id = e.id.split("_")[1];
        let url = "/resume/" + resumeId + "/honor/" + id;
        ajaxPost(url, null, function (revert) {
            let obj = revert.data;
            let content = EditTemplate.schoolHonor(obj);
            let contentEle = contentAddBtnsElement(3, content);
            e.parentElement.replaceChild(contentEle, e);
        })
    }
}

/**
 * prev 预览界面
 * 有e(将编辑界面替换) 没有e(打开页面初始化)
 * @param e content元素节点
 */
{
    function prevBasic(e) {
        let url = "/resume/" + resumeId;
        ajaxPost(url, null, function (revert) {
            if (revert.data !== undefined) {
                let content = PrevTemplate.basic(revert.data);
                ResumeOther1Template.resumeName = revert.data.resumeName;
                ResumeOther1Template.resumeUpdateTime = revert.data.resumeUpdateTime;
                let contentEle = contentAddBtnsElement(1, content);
                if (e !== undefined)
                    e.parentElement.replaceChild(contentEle, e);
                else {
                    div_basic.appendChild(contentEle);
                    cancelNameClick();
                }
            }
        })
    }

    function prevWork(e) {
        let url = "/resume/" + resumeId + "/work_exp";
        if (e !== undefined && e.id.split("_")[1] !== "") {
            let workId = e.id.split("_")[1];
            url += "/" + workId;
        }
        ajaxPost(url, null, function (revert) {
            if (e !== undefined) {
                try {
                    if (revert.data.length !== undefined && revert.data.length !== 0)
                        div_work.innerHTML = `  <h4 class="tag_title">
                        <img alt="" src="${ROOTSources}/images/createResume/work.svg" class="icon">
                        <strong>工作经验</strong>
                        <span class="add_content" onclick="addClick(this)">+添加</span>
                    </h4>`;
                    for (let obj of revert.data) {
                        let content = PrevTemplate.work(obj);
                        let contentEle = contentAddBtnsElement(2, content);
                        div_work.appendChild(contentEle);
                    }
                } catch (exception) {
                    let content = PrevTemplate.work(revert.data);
                    let contentEle = contentAddBtnsElement(2, content);
                    e.parentElement.replaceChild(contentEle, e);
                }
            } else if (revert.data !== undefined) {
                for (let obj of revert.data) {
                    let content = PrevTemplate.work(obj);
                    let contentEle = contentAddBtnsElement(2, content);
                    div_work.appendChild(contentEle);
                }
            }
        })
    }

    function prevProject(e) {
        let url = "/resume/" + resumeId + "/project_exp";
        if (e !== undefined && e.id.split("_")[1] !== "") {
            let projectId = e.id.split("_")[1];
            url += "/" + projectId;
        }
        ajaxPost(url, null, function (revert) {
            if (e !== undefined) {
                try {
                    if (revert.data.length !== undefined && revert.data.length !== 0)
                        div_project.innerHTML = ` <h4 class="tag_title">
                        <img alt="" src="${ROOTSources}/images/createResume/project.svg"
                             class="icon">
                        <strong>项目经验</strong>
                        <span class="add_content" onclick="addClick(this)">+添加</span>
                    </h4>`;
                    for (let obj of revert.data) {
                        let content = PrevTemplate.project(obj);
                        let contentEle = contentAddBtnsElement(2, content);
                        div_project.appendChild(contentEle);
                    }
                } catch (exception) {
                    let content = PrevTemplate.project(revert.data);
                    let contentEle = contentAddBtnsElement(2, content);
                    e.parentElement.replaceChild(contentEle, e);
                }
            } else if (revert.data !== undefined) {
                for (let obj of revert.data) {
                    let content = PrevTemplate.project(obj);
                    let contentEle = contentAddBtnsElement(2, content);
                    div_project.appendChild(contentEle);
                }
            }
        });
    }

    function prevSkills(e) {
        let url = "/resume/" + resumeId + "/skill";
        if (e !== undefined && e.id.split("_")[1] !== "") {
            let skillId = e.id.split("_")[1];
            url += "/" + skillId;
        }
        ajaxPost(url, null, function (revert) {
            if (e !== undefined) {
                try {
                    if (revert.data.length !== undefined && revert.data.length !== 0)
                        div_skills.innerHTML = `<h4 class="tag_title">
                        <img alt="" src="${ROOTSources}/images/createResume/skills.svg"
                             class="icon">
                        <strong>专业技能</strong>
                        <span class="add_content" onclick="addClick(this)">+添加</span>
                    </h4>`;
                    for (let obj of revert.data) {
                        let content = PrevTemplate.skills(obj);
                        let contentEle = contentAddBtnsElement(2, content);
                        div_skills.appendChild(contentEle);
                    }
                } catch (exception) {
                    let content = PrevTemplate.skills(revert.data);
                    let contentEle = contentAddBtnsElement(2, content);
                    e.parentElement.replaceChild(contentEle, e);
                }
            } else if (revert.data !== undefined) {
                for (let obj of revert.data) {
                    let content = PrevTemplate.skills(obj);
                    let contentEle = contentAddBtnsElement(2, content);
                    div_skills.appendChild(contentEle);
                }
            }
        })
    }

    function prevSchoolHonor(e) {
        let url = "/resume/" + resumeId + "/honor";
        if (e !== undefined && e.id.split("_")[1] !== "") {
            let honorId = e.id.split("_")[1];
            url += "/" + honorId;
        }
        ajaxPost(url, null, function (revert) {
            if (e !== undefined) {
                try {
                    if (revert.data.length !== undefined && revert.data.length !== 0)
                        div_schoolHonor.innerHTML = `<h4 class="tag_title">
                        <img alt="" src="${ROOTSources}/images/createResume/schoolHonor.svg"
                             class="icon">
                        <strong>在校荣誉</strong>
                        <span class="add_content" onclick="addClick(this)">+添加</span>
                    </h4>`;
                    for (let obj of revert.data) {
                        let content = PrevTemplate.schoolHonor(obj);
                        let contentEle = contentAddBtnsElement(2, content);
                        div_schoolHonor.appendChild(contentEle);
                    }
                } catch (exception) {
                    let content = PrevTemplate.schoolHonor(revert.data);
                    let contentEle = contentAddBtnsElement(2, content);
                    e.parentElement.replaceChild(contentEle, e);
                }
            } else if (revert.data !== undefined) {
                for (let obj of revert.data) {
                    let content = PrevTemplate.schoolHonor(obj);
                    let contentEle = contentAddBtnsElement(2, content);
                    div_schoolHonor.appendChild(contentEle);
                }
            }
        })
    }
}

/**
 * 按键元素节点
 * 编辑 删除 保存 取消
 */
{
    /**
     * 删除按钮元素节点
     * @returns {HTMLDivElement} 编辑按钮元素节点
     */
    function deleteBtn() {
        let element = document.createElement("div");
        element.className = "delete_btn";
        element.style.backgroundImage = Icons.cssDelete;
        element.setAttribute("onclick", "deleteClick(this)");
        return element;
    }

    /**
     * 编辑按钮元素节点
     * @returns {HTMLDivElement} 编辑按钮元素节点
     */
    function editBtn() {
        let element = document.createElement("div");
        element.className = "edit_btn";
        element.style.backgroundImage = Icons.cssEdit;
        element.setAttribute("onclick", "editClick(this)");
        return element;
    }

    /**
     * 保存&取消按钮元素节点
     * @returns {HTMLDivElement} 编辑按钮元素节点
     */
    function saveCancelBtn() {
        let element = document.createElement("div");
        element.className = "btn_box";
        element.innerHTML = `<button type="button" onclick="saveClick(this)">保存</button>
                            <button type="button" onclick="cancelClick(this)">取消</button>`;
        return element;
    }

    function saveCancelBtn2() {
        let element = document.createElement("div");
        element.className = "btn_box";
        element.innerHTML = `<button type="button" onclick="saveClick2(this)">保存</button>
                            <button type="button" onclick="cancelClick2(this.parentElement)">取消</button>`;
        return element;
    }
}

function dateFormat(milliseconds, separator) {
    if (milliseconds === "")
        return "";
    let date = new Date(milliseconds);
    let year = date.getFullYear(),
        month = date.getMonth() + 1,
        day = date.getDate();
    if (month < 10)
        month = "0" + month;
    if (day < 10)
        day = "0" + day;
    return year + separator + month + separator + day;
}

/**
 * @param element content元素节点
 */
function editFunction(element) {
    let idName = element.parentElement.id;
    if (element.id === "")
        element = undefined; // 添加元素
    switch (idName) {
        case "basic":
            editBasic(element);
            break;
        case "work":
            editWork(element);
            break;
        case "project":
            editProject(element);
            break;
        case "skills":
            editSkills(element);
            break;
        case "schoolHonor":
            editSchoolHonor(element);
            break;
    }
}

function prevFunction(element) {
    if (element === undefined) {
        // 初始化
        prevBasic();
        prevWork();
        prevProject();
        prevSkills();
        prevSchoolHonor();
        return;
    }
    let idName = element.parentElement.id;
    if (element.id === "")
        element = undefined; // 新增项确定的点击事件
    switch (idName) {
        case "basic":
            prevBasic(element);
            break;
        case "work":
            prevWork(element);
            break;
        case "project":
            prevProject(element);
            break;
        case "skills":
            prevSkills(element);
            break;
        case "schoolHonor":
            prevSchoolHonor(element);
            break;
    }

}

/**
 * 按钮状态变更方法
 */
{
    function btnUse() {
        // 简历名称编辑按钮可用
        let editNameBtn = document.querySelector("#editNameBtn");
        editNameBtn.style.backgroundImage = Icons.cssEdit;
        editNameBtn.setAttribute("onclick", "editNameClick()");
        // 其他编辑按钮可用
        let prevEditBtns = document.querySelectorAll(".edit_btn");
        for (let eb of prevEditBtns) {
            eb.style.backgroundImage = Icons.cssEdit;
            eb.setAttribute("onclick", "editClick(this)");
        }
        // 其他删除按钮可用
        let prevDelBtns = document.querySelectorAll(".delete_btn");
        for (let db of prevDelBtns) {
            db.style.backgroundImage = Icons.cssDelete;
            db.setAttribute("onclick", "deleteClick(this)");
        }
    }

    function btnNoUse() {
        // 其他编辑按钮不可用
        let prevEditBtns = document.querySelectorAll(".edit_btn");
        for (let eb of prevEditBtns) {
            eb.style.backgroundImage = Icons.cssEdit2;
            eb.removeAttribute("onclick");
        }
        // 其他删除按钮不可用
        let prevDelBtns = document.querySelectorAll(".delete_btn");
        for (let db of prevDelBtns) {
            db.style.backgroundImage = Icons.cssDelete2;
            db.removeAttribute("onclick");
        }
        // 简历名称编辑按钮不可用
        try {
            let editNameBtn = document.querySelector("#editNameBtn");
            editNameBtn.style.backgroundImage = Icons.cssEdit2;
            editNameBtn.removeAttribute("onclick");
        } catch (e) {
        }
    }
}

/**
 * @param e content的二级子元素节点
 */
{
    /**
     * 编辑点击事件操作
     */
    function editClick(e) {
        editFunction(e.parentElement);
        btnNoUse();
    }

    /**
     * 添加点击事件操作
     */
    function addClick(e) {
        editFunction(e.parentElement);
        btnNoUse();
    }

    /**
     * 删除点击事件操作
     */
    function deleteClick(e) {
        let id = e.parentElement.parentElement.id;
        let url = "/resume/" + resumeId;
        if (id === "work")
            url += "/work_exp";
        else if (id === "project")
            url += "/project_exp";
        else if (id === "skills")
            url += "/skill";
        else /*if (id === "schoolHonor")*/
            url += "/honor";
        // 向数据库发送删除条目请求
        let keys = e.parentElement.id.split("_")[1];
        url += "/del/" + keys;
        ajaxPost(url, null, function () {
            e.parentElement.parentElement.removeChild(e.parentElement);
        })
    }
}

/**
 * @param e content的子元素节点
 */
{
    /**
     * 修改的保存点击事件操作
     */
    function saveClick(e) {
        let id = e.parentElement.parentElement.parentElement.id;
        let url = "/resume/" + resumeId;
        if (id === "work")
            url += "/work_exp";
        else if (id === "project")
            url += "/project_exp";
        else if (id === "skills")
            url += "/skill";
        else if (id === "schoolHonor")
            url += "/honor";
        // 向数据库发送删除条目请求
        let sendContent = e.parentElement.parentElement.serialize();
        url += "/modify";
        if (id !== "basic")
            url += "/" + e.parentElement.parentElement.id.split("_")[1];
        console.log(url);
        // 向数据库发送修改条目请求
        ajaxPost(url, sendContent, function () {
            prevFunction(e.parentElement.parentElement);
            btnUse();
        })
    }

    /**
     * 添加的保存点击事件操作
     */
    function saveClick2(e) {
        let id = e.parentElement.parentElement.id.split("_")[0];
        let url = "/resume/" + resumeId;
        if (id === "work")
            url += "/work_exp";
        else if (id === "project")
            url += "/project_exp";
        else if (id === "skills")
            url += "/skill";
        else if (id === "schoolHonor")
            url += "/honor";
        // 向数据库发送删除条目请求
        let sendContent = e.parentElement.parentElement.serialize();
        url += "/add";
        // 向数据库发送修改条目请求
        ajaxPost(url, sendContent, function () {
            prevFunction(e.parentElement.parentElement);
            btnUse();
        })
    }

    /**
     * 修改的取消点击事件操作
     */
    function cancelClick(e) {
        prevFunction(e.parentElement.parentElement);
        btnUse();
    }

    /**
     * 添加的取消点击事件操作
     */
    function cancelClick2(e) {
        e.parentElement.parentElement.removeChild(e.parentElement);
        btnUse();
    }
}




