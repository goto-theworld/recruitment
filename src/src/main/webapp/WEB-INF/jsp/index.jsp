<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>校园招聘网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>
<jsp:include page="navigate/navigate.jsp"/>
<div id="container">
    <div id="Position_list">
        <!--职位信息-->
        <div id="Specific_info">
            <ul id="jobUL" class="js_content"></ul>
            <a href="${pageContext.request.contextPath}/job/jobInfo" class="btn">查看更多</a>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/dist/jquery/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/index.js"></script>
</body>
</html>