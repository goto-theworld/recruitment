<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/navigate.css">
<div id="index_head">
    <div id="logoInfo">

        <ul id="home">
            <li><a href="${pageContext.request.contextPath}/">首页</a></li>
            <li><a href="${pageContext.request.contextPath}/job/jobInfo">职位</a></li>
        </ul>
        <c:if test="${sessionScope.loginCustomer==null}">
            <div class="loginPart">
                <ul>
                    <li>
                        <a href="${pageContext.request.contextPath}/login">投递记录</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/login">简历</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/login" class="clickBtn">登录</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/register" class="clickBtn">注册</a>
                    </li>
                </ul>
            </div>
        </c:if>
        <c:if test="${sessionScope.loginCustomer!=null}">
            <div class="loginPart">
                <ul>
                    <li>
                        <a href="${pageContext.request.contextPath}/customer/center/2">投递记录</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/customer/center/1">简历</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/customer/center/0">
                            <span class="label-text">${sessionScope.loginCustomer.custName}</span>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/customer/logout">退出登录</a>
                    </li>
                </ul>
            </div>
        </c:if>
    </div>
</div>
<script type="text/javascript">
</script>
<script>
    let ROOTSources = "${pageContext.request.contextPath}";
</script>

