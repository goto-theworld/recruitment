//投递简历的模态框
$(document).ready(function () {
    $.ajax({
        url: ROOTSources + "/record/getByJobId?jobId=" + jobId, // 请求的服务器接口
        type: "GET", // 请求方式
        dataType: "json", // 返回数据类型，text,json
        success: function (revert) {
            if (revert.status===1){
                // 成功
                $("#submitBtn")
                    .attr("disabled", true)
                    .html("<img class=\"icon\" alt src=\"" + ROOTSources + "/images/job/s7.svg\">投递成功")
            } else{
                $("#submitBtn")
                    .attr("disabled", false)
                    .html("<img class=\"icon\" alt src=\"" + ROOTSources + "/images/zw_images/shenqingzhiwei.svg\">申请职位")
            }
        }
    })
});


function contentFun(resumeName, id) {
    return `<label>
                <input type="radio" name="resumeId" value="${id}">${resumeName}
            </label><br/>`
}


$("#submitBtn").click(function () {
    $.ajax({
        url: ROOTSources + "/resume/getAll", // 请求的服务器接口
        type: "GET", // 请求方式
        dataType: "json", // 返回数据类型，text,json
        success: function (revert) {
            let content = `<form id="resumeDeliveryApply">`;
            try {
                for (let obj of revert.data) {
                    content += contentFun(obj.resumeName, obj.resumeId);
                }
            } catch (e) {
                content += `<p style="text-align: center">暂无简历，请先添加简历后重试</p>`;
            }
            content += `</form>`;
            $("#applyJob .modal-body").html(content);
            $('#applyJob').modal()
        },
    });
});


function resumeDeliveryApplySubmitBtn(jobId) {
    let formContent = $("#resumeDeliveryApply").serialize() + "&jobId=" + jobId;
    $.ajax({
        url: ROOTSources + "/record/add?" + formContent, // 请求的服务器接口
        type: "GET", // 请求方式
        dataType: "json", // 返回数据类型，text,json
        success: function () {
            $("#applySuccess").slideDown().delay(3000).slideUp();
            $("#submitBtn")
                .attr("disabled", true)
                .html("<img class=\"icon\" alt src=\"" + ROOTSources + "/images/job/s7.svg\">投递成功")
        },
        error: function () {
            $("#applyFailed").slideDown().delay(3000).slideUp();
        }
    });
}






