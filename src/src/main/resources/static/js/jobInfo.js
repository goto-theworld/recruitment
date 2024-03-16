let pageSize = "", // 总页数
    pageNum = 1, // 当前页码
    publishDay = "",
    minSalary = "",
    maxSalary = "",
    workYear = "",
    eduRequest = "",
    total = ""; // 总记录数
let selectCols = document.querySelectorAll(".selectCols");
let searchBtn = document.querySelector("#searchBtn");
let pageInfo = document.querySelector("#pageInfo");
let jsContent = document.querySelector("#jsContent");
let totalDiv = document.querySelector("#total");
let searchContent = document.querySelector("#searchContent");

searchContent.value = keywords;

window.onload = function () {
    ajaxPostFunction();
};

/**
 * 搜索按钮点击事件
 */
searchBtn.onclick = function () {
    keywords = searchContent.value.trim().toLowerCase();
    ajaxPostFunction();
};


function saveLabelForSearch(index, content) {
    if (index === 0) {
        // 发布日期
        switch (content) {
            case "24小时内":
                publishDay = 1;
                break;
            case "近三天":
                publishDay = 3;
                break;
            case "近一周":
                publishDay = 7;
                break;
            case "近一月":
                publishDay = 30;
                break;
            case "其他":
                publishDay = 0;
                break;
            default:
                publishDay = "";
                break;
        }
    } else if (index === 1) {
        // 月薪范围
        switch (content) {
            case "2千以下":
                minSalary = 0;
                maxSalary = 2000;
                break;
            case "2-3千":
                minSalary = 2000;
                maxSalary = 3000;
                break;
            case "3-4.5千":
                minSalary = 3000;
                maxSalary = 4500;
                break;
            case "4.5-6千":
                minSalary = 4500;
                maxSalary = 6000;
                break;
            case "6-8千":
                minSalary = 6000;
                maxSalary = 8000;
                break;
            default:
                minSalary = "";
                maxSalary = "";
                break;
        }
    } else if (index === 2) {
        // 公司性质
        switch (content) {
            // 无用选项
        }
    } else if (index === 3) {
        // 工作年限
        switch (content) {
            case "无经验":
                workYear = "0-";
                break;
            case "1-3年":
                workYear = "1-3";
                break;
            case "3-5年":
                workYear = "3-5";
                break;
            case "5-10年":
                workYear = "5-10";
                break;
            case "10年以上":
                workYear = "10-";
                break;
            default:
                workYear = "";
                break;
        }
    } else if (index === 4) {
        // 学历要求
        eduRequest =
            content === "所有"
                ? ""
                : content;
    }
    return content;
}

/**
 * 搜索条件点谁谁变色
 */
for (let i = 0; i < selectCols.length - 1; i++) {
    selectCols[i].onclick = function () {
        let ele = event.target;
        if (ele.nodeName.toLowerCase() === "li" && ele !== ele.parentElement.children[0]) {
            let lis = ele.parentElement.children;
            for (let j = 1; j < lis.length; j++)
                lis[j].removeAttribute("class");
            ele.setAttribute("class", "choose");
            let chooseLis = document.querySelectorAll(".choose");
            let showSelectLab = document.querySelector("#showSelectLab");
            showSelectLab.innerHTML = `<li>${showSelectLab.children[0].innerText}</li>`;
            for (let m = 0; m < chooseLis.length; m++) {
                let text = saveLabelForSearch(m, chooseLis[m].innerText.trim());
                if (text !== "\u6240\u6709") // 所有
                    showSelectLab.innerHTML += `<li>${text}</li>`;
            }
            pageNum = 1;
            ajaxPostFunction();
        }
    }
}

/**
 * 分页点谁谁变色
 */
pageInfo.onclick = function () {
    let ele = event.target;
    if (ele.nodeName.toLowerCase() === "a"
        && ele.parentElement.className !== "disabled"
        && ele.parentElement.className !== "green") {
        if (ele.parentElement.id === "previousPageId")
            pageNum--;
        else if (ele.parentElement.id === "nextPageId")
            pageNum++;
        else
            pageNum = parseInt(ele.innerText.trim());
        pageClick(event.target);
        ajaxPostFunction();
    }
};

function pageClick() {
    let previousPageEle = `<li id="previousPageId"><a href="javascript:void 0">&laquo;</a></li>`;
    let nextPageEle = `<li id="nextPageId"><a href="javascript:void 0">&raquo;</a></li>`;
    let content = ``;
    if (pageNum === 1)
        previousPageEle = `<li class="disabled"><a href="javascript:void 0">&laquo;</a></li>`;
    if (pageNum === pageSize)
        nextPageEle = `<li class="disabled"><a href="javascript:void 0">&raquo;</a></li>`;
    for (let i = 0; i < pageSize; i++) {
        if (pageNum === i + 1)
            content += `<li class="green"><a href="javascript:void 0">${i + 1}</a></li>`;
        else
            content += `<li><a href="javascript:void 0">${i + 1}</a></li>`;
    }
    // totalDiv.innerHTML = "共 " + total + " 条数据";
    pageInfo.innerHTML = previousPageEle + content + nextPageEle;
}


function ajaxPostFunction() {
    let url = "/job/getSearchJob";
    let sendContent = "publishDay=" + publishDay
        + "&minSalary=" + minSalary
        + "&maxSalary=" + maxSalary
        + "&workYear=" + workYear
        + "&keywords=" + keywords
        + "&eduRequest=" + eduRequest
        + "&pageNum=" + pageNum;
    let ajax = new XMLHttpRequest() || new ActiveXObject('Microsoft.XMLHTTP');
    ajax.open("POST", ROOTSources + url, true);
    ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    ajax.send(sendContent);
    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4) {
            if (ajax.status >= 200 && ajax.status < 300 || ajax.status === 304) {
                try {
                    jsContent.innerHTML = "";
                    total = 0;
                    let data = JSON.parse(ajax.responseText).data;
                    // console.log(data);
                    pageSize = data.pages; // 总页数
                    pageNum = data.pageNum; // 当前页码
                    total = data.total; // 总记录数
                    // 渲染页面
                    for (let obj of data.list) {
                        jsContent.innerHTML += `<tr>
                                                <td>
                                                    <label>
                                                        <input type="checkbox" class="select">
                                                    </label>
                                                </td>
                                                <td><a href="${ROOTSources}/job/${obj.job.jobId}">${obj.job.jobName}</a></td>
                                                <td>${obj.company.companyName}</td>
                                                <td>${obj.job.jobCity}</td>
                                                <td>${obj.job.jobMinSalary}-${obj.job.jobMaxSalary}/月</td>
                                                <td>${dateFormat(obj.job.jobPublishTime, "-")}</td>
                                              </tr>`;
                    }
                } catch (e) {
                }
                pageClick();
            }
        }
    }
}


/**
 * 时间格式化函数
 * @param milliseconds 毫秒数
 * @param separator 分隔符
 * @returns {*} 字符串
 */
function dateFormat(milliseconds, separator) {
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

// //全选按钮
// var selectAllEle = document.querySelector(".select-all");
// /*console.log(selectAllEle);*/
//
// selectAllEle.onclick = function () {
//     var ckboxes = document.querySelectorAll(".yl input[type=checkbox]");
// //    console.log(ckboxes);
//     /*  console.log(selectAllEle.checked);*/
//     for (var i = 0; i < ckboxes.length; i++) {
//         ckboxes[i].checked = selectAllEle.checked
//     }
// };
