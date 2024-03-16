<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>个人中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/personalCenter.css">
</head>
<body>
<jsp:include page="../navigate/navigate.jsp"/>

<div class="content">
    <!--个人中心-->
    <div class="directory">
        <c:if test="${requestScope.type != 0}">
            <a class="more_1"
               href="${pageContext.request.contextPath}/customer/center/0">个人中心</a>
        </c:if>
        <c:if test="${requestScope.type == 0}">
            <span class="more_1 choose">个人中心</span>
            <div class="absContent">
                <div class="header">
                    <ul class="leftLabel">
                        <li class="">个人中心</li>
                    </ul>
                </div>
                <table border="0" cellspacing="0" cellpadding="0">
                    <tbody>
                    <tr>
                        <td class="labelForMyself">
                            <img src="${pageContext.request.contextPath}/images/job/s1.svg" alt="">
                            用户名
                        </td>
                        <td>${sessionScope.loginCustomer.custName}</td
                    </tr>
                    <tr>
                        <td class="labelForMyself">
                            <img src="${pageContext.request.contextPath}/images/job/s2.svg" alt="">
                            登录密码
                        </td>
                        <td>******</td>
                    </tr>
                    <tr>
                        <td class="labelForMyself">
                            <img src="${pageContext.request.contextPath}/images/job/s3.svg" alt="">
                            手机号码
                        </td>
                        <td>${sessionScope.loginCustomer.custTelno}</td>
                        <td></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </c:if>
    </div>
    <!--简历中心-->
    <div class="directory">
        <c:if test="${requestScope.type != 1}">
            <a class="more_1"
               href="${pageContext.request.contextPath}/customer/center/1">简历中心</a>
        </c:if>
        <c:if test="${requestScope.type == 1}">
            <span class="more_1 choose">简历中心</span>
            <div class="absContent">
                <div class="header">
                    <ul class="leftLabel">
                        <li class="">简历中心</li>
                    </ul>
                    <ul class="rightLabel">
                        <li>
                            <a href="${pageContext.request.contextPath}/resume/add">创建简历</a>
                        </li>
                    </ul>
                </div>
                <table border="0" cellspacing="0" cellpadding="0">
                    <thead>
                    <tr>
                        <td>简历名称</td>
                        <td>简历创建时间</td>
                        <td>简历修改时间</td>
                        <td>操作</td>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="resume" items="${requestScope.resumeList}">
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/resume/${resume.resumeId}/prev">${resume.resumeName}</a>
                            </td>
                            <td>
                                <fmt:formatDate value="${resume.resumeCreateTime}" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>
                                <fmt:formatDate value="${resume.resumeUpdateTime}" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>
                                <a href="${pageContext.request.contextPath}/resume/${resume.resumeId}/edit">编辑</a>
                                |
                                <a href="#" onclick="deleteResume(this,${resume.resumeId})">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class="describe">

                </div>
            </div>
        </c:if>
    </div>
    <!--投递记录-->
    <div class="directory">
        <c:if test="${requestScope.type != 2}">
            <a class="more_1"
               href="${pageContext.request.contextPath}/customer/center/2">投递记录</a>
        </c:if>
        <c:if test="${requestScope.type == 2}">
            <span class="more_1 choose">投递记录</span>
            <div class="absContent">
                <div class="header">
                    <ul class="leftLabel">
                        <li class="">投递记录</li>
                    </ul>
                </div>
                <table border="0" cellspacing="0" cellpadding="0">
                    <thead>
                    <tr>
                        <td>投递的简历</td>
                        <td>投递岗位</td>
                        <td>薪资</td>
                        <td>投递时间</td>
                        <td>企业名称</td>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="rdrList" items="${requestScope.rdrList}">
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/resume/${rdrList.resume.resumeId}/prev">${rdrList.resume.resumeName}</a>
                            </td>
                            <td>${rdrList.job.jobName}</td>
                            <td>${rdrList.job.jobMinSalary}-${rdrList.job.jobMaxSalary}元/月</td>
                            <td>
                                <fmt:formatDate value="${rdrList.resumeDeliveryRecord.deliveryTime}" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>${rdrList.company.companyName}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:if>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/personalCenter.js"></script>
</body>
</html>
