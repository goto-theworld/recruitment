<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jobDetail.css">

    <script src="${pageContext.request.contextPath}/dist/jquery/jquery-3.4.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/dist/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../navigate/navigate.jsp"/>

<div id="applySuccess" class="alert alert-success alert-dismissible" role="alert" style="display: none">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    投递成功
</div>
<div id="applyFailed" class="alert alert-danger alert-dismissible" role="alert"  style="display: none">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    投递失败，请重试
</div>


<div class="main">
    <div class="headerInfo">
        <h2>${requestScope.companyJobVO.job.jobName}</h2>
        <p>
            <span>${requestScope.companyJobVO.company.companyName}</span>
        </p>
        <p>
            <span class="labelInfo">
                ${requestScope.companyJobVO.job.jobAddrDetail}
            </span>
            <span class="labelInfo">${requestScope.companyJobVO.job.jobYear}经验</span>
            <span class="labelInfo">${requestScope.companyJobVO.job.jobDegree}</span>
            <span class="labelInfo">招${requestScope.companyJobVO.job.jobNeedNumber}人</span>
            <span class="labelInfo">
                <fmt:formatDate value="${requestScope.companyJobVO.job.jobPublishTime}" pattern="yyyy-MM-dd"/>
                发布
            </span>
            <span class="labelInfo">计算机应用 软件工程</span>
        </p>
        <p>
            <c:forTokens var="code" items="${requestScope.companyJobVO.job.jobWelfare}" delims=",">
                <span class="green">${code}</span>
            </c:forTokens>
        </p>

        <div class="op1">
            <div class="salary"><strong>${requestScope.companyJobVO.job.jobMinSalary}-${requestScope.companyJobVO.job.jobMaxSalary}/月</strong></div>

        </div>
        <div class="op2">
            <button id="submitBtn" type="button" class="btn">

            </button>
        </div>
    </div>
    <div>
        <div class="companyContent">
            <div class="part">
                <h4>职位信息</h4>
                <div class="content">
                    ${requestScope.companyJobVO.job.jobDuty}
                </div>
            </div>
            <div class="part">
                <h4>公司信息</h4>
                <div class="content">
                    ${requestScope.companyJobVO.company.companyDesc}
                </div>
            </div>
        </div>
        <div class="companyInfo">
            <h3>公司信息</h3>
            <a href="${pageContext.request.contextPath}/company/${requestScope.companyJobVO.company.companyId}">
                <img class="companyPic" alt="" src="${requestScope.companyJobVO.company.companyLogo}">
                <br/>
                <span>${requestScope.companyJobVO.company.companyName}</span>
            </a>
            <div class="left">
                <p class="at">
                    <img class="icon" alt="" src="${pageContext.request.contextPath}/images/zw_images/caidan.svg">
                    <span>${requestScope.companyJobVO.company.companyEmpCount}</span>
                </p>
                <p class="at" id="aaa">
                    <img class="icon" alt="" src="${pageContext.request.contextPath}/images/zw_images/qiye.svg">
                    <span>${requestScope.companyJobVO.company.companyIndustury}</span>
                </p>
            </div>
            <a href="${pageContext.request.contextPath}/company/${requestScope.companyJobVO.company.companyId}">
                <img class="icon" alt="" src="${pageContext.request.contextPath}/images/zw_images/gongwenbao.svg">
                <span>查看所有职位</span>
            </a>
        </div>
    </div>
</div>

<%--模态框--%>
<div id="applyJob" class="modal fade">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title" id="myModalLabel1">请选择您需要投递的简历</h4>
            </div>
            <div class="modal-body"></div>
            <div class="modal-footer">
                <a href="#" onclick="resumeDeliveryApplySubmitBtn(${requestScope.companyJobVO.job.jobId})" class="btn btn-primary" data-dismiss="modal">确认</a>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>

<script>
    let jobId = "${requestScope.companyJobVO.job.jobId}"
</script>
<script src="${pageContext.request.contextPath}/js/jobDetail.js"></script>
</body>
</html>
