<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>搜索职位</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jobInfo.css">
</head>

<body>
<jsp:include page="../navigate/navigate.jsp"/>

<%--搜索框--%>
<div id="search_div">
    <div id="search_input">
        <input type="text" placeholder="搜索职位" id="searchContent">
        <button id="searchBtn" type="button">搜索</button>
    </div>
</div>
<%--条件筛选--%>
<div class="contentElement">
    <ul id="selectRows">
        <li>
            <ul class="selectCols">
                <li>发布日期:</li>
                <li class="choose">所有</li>
                <li>24小时内</li>
                <li>近三天</li>
                <li>近一周</li>
                <li>近一月</li>
                <li>其他</li>
            </ul>
        </li>
        <li>
            <ul class="selectCols">
                <li>月薪范围:</li>
                <li class="choose">所有</li>
                <li>2千以下</li>
                <li>2-3千</li>
                <li>3-4.5千</li>
                <li>4.5-6千</li>
                <li>6-8千</li>
            </ul>
        </li>


        <li>
            <ul class="selectCols" id="showSelectLab">
                <li>已选条件:</li>
            </ul>
        </li>
    </ul>
</div>
<%--搜索内容区--%>
<div class="contentElement">
    <%--表格--%>
    <table>
        <thead>
        <tr>
            <td></td>
            <td>职位名</td>
            <td>公司名</td>
            <td>工作地点</td>
            <td>薪资</td>
            <td>发布时间</td>
        </tr>
        </thead>
        <tbody id="jsContent">

        </tbody>
    </table>
    <%--分页--%>
    <nav aria-label="Page navigation" class="center">
        <ul class="pagination" id="pageInfo">
        </ul>
    </nav>
</div>


<script>
    let keywords = "${requestScope.keywords}";
</script>
<script src="${pageContext.request.contextPath}/js/jobInfo.js"></script>
</body>
</html>
