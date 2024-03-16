function deleteResume(ele, resumeId) {//删除简历
    let url = "/resume/" + resumeId + "/del";
    let ajax = new XMLHttpRequest() || new ActiveXObject('Microsoft.XMLHTTP');
    ajax.open("DELETE", ROOTSources + url, true);
    ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    ajax.send(null);
    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4) {
            if (ajax.status >= 200 && ajax.status < 300 || ajax.status === 304)
                ele.parentElement.parentElement.parentElement.removeChild(ele.parentElement.parentElement);
        }
    };
    return false;
}


