<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>公司介绍</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/companyInfo.css">
</head>
<jsp:include page="../navigate/navigate.jsp"/>
<body>
<div id="subjectDiv">
    <div id="companyInfo">
        <h2>${company.companyName}</h2>
        <div id="spanDiv">
            <span>${company.companyStage}</span><span class="spans">|</span><span class="spans">${company.companyIndustury}</span>
        </div>
    </div>

    <div id="companyJobInfo">
        <h3 class="listHead"><span style="display:inline-block;margin-left: 15px">该公司的所有职位</span></h3>
        <div id="jobList">
            <c:forEach items="${companyJobList}" var="job">
                <div class="job">
                    <p class="j1"><a href="${pageContext.request.contextPath}/job/${job.jobId}">${job.jobName}</a></p>
                    <span class="j2">${job.jobDegree}|${job.jobNeedNumber}</span>
                    <span class="j3">${job.jobCity}</span>
                    <span class="j4"></span>
                    <span class="j5">${job.jobPublishTime}</span>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</body>
</html>
