let jobUL = document.querySelector('#jobUL');
let companyUL = document.querySelector("#companyUL");
/*加载最新的10条招聘记录*/
-function init() {
    ajaxPost("/job/getByPageForIndex",
        null,
        function (objList) {
            for (let jobObject of objList.data)
                jobUL.innerHTML += `<li>
                <div class="Specific_text">
                    <a href="${ROOTSources}/job/${jobObject.job.jobId}" class="user-info">
                        <p class="jobname">
                            ${jobObject.job.jobName}
                            <span class="vline"></span>
                            ${jobObject.job.jobMinSalary}-${jobObject.job.jobMaxSalary}元/月
                        </p>
                        <p class="job_text">
                            ${jobObject.job.jobCity}
                            <span class="vline"></span>
                            ${jobObject.job.jobYear}年
                            <span class="vline"></span>
                            ${jobObject.job.jobDegree}
                        </p>
                    </a>
                    <a href="${ROOTSources}/job/${jobObject.job.jobId}" class="user-info">
                        <p>
                            <span class="user-text">
                                    <span>${jobObject.companyAdmin.companyAdminName}</span>
                                    <span class="vline"></span>
                                    <span>${jobObject.companyAdmin.companyAdminTelno}</span>
                            </span>
                        </p>
                    </a>
                </div>
                </li>`;
        });
    ajaxPost("/company/getByPageForIndex",
        null,
        function (objList) {
            for (let companyObject of objList.data.list)
                companyUL.innerHTML += `<li>
                    <div class="Specific_text">
                        <a href="" class="company-info">
                            <img src="${companyObject.companyLogo}" alt="">
                            <div class="company-text">
                                <h4 >${companyObject.companyName}</h4>
                                <p>
                                    ${companyObject.companyStage}
                                    <span class="vline"></span>
                                    ${companyObject.companyIndustury}
                                </p>
                            </div>
                        </a>
                    </div>
                </li>`;
        });
}();

/**
 * 异步请求函数
 * @param url 请求地址(相对路径)
 * @param sendContent 请求追加信息
 * @param callback 回调函数
 */
function ajaxPost(url, sendContent = null, callback) {
    let ajax = new XMLHttpRequest() || new ActiveXObject('Microsoft.XMLHTTP');
    ajax.open("GET", ROOTSources + url, true);
    ajax.send();
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

/* 点击变色 */
let choiceJobType = document.querySelector("#choiceJobType");
let choiceCompanyType = document.querySelector('#choiceCompanyType');
choiceCompanyType.onclick = function (event) {
    clickChangeColor(choiceCompanyType, event);
};

choiceJobType.onclick = function (event) {
    clickChangeColor(choiceJobType, event);
};

function clickChangeColor(divElement, event) {
    let lis = divElement.firstElementChild.children;
    let element = event.target;
    if (element.nodeName.toLowerCase() === 'li') {
        for (let li of lis)
            li.removeAttribute("class");
        element.setAttribute("class", "choose");//赋予点击标签属性
    }
}

// 搜索按钮点击事件
document.querySelector("#searchBtn").onclick = function () {
    let value = document.querySelector("#searchContent").value.trim();
    window.location.href = ROOTSources + "/job/jobInfo?keywords=" + value;
};