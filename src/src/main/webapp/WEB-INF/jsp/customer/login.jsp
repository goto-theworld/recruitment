<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
    <style>
        .lrcon .lrbox {
            background: url("${pageContext.request.contextPath}/images/jkf_imgs/loginbeijing.png");
        }
        .lrcon {
            background: url("${pageContext.request.contextPath}/images/jkf_imgs/1.png") no-repeat;
        }
    </style>
</head>
<body>
<jsp:include page="../navigate/navigate.jsp"/>

<div class="lrcon">
    <div class="lrbox">
        <!--左边栏-->
        <div class="describes">
            <div class="des-c" id="des-c-1">
                <div class="des-cn">
                    <p class="des-cn-p">不要被生活所捆绑，勇于迈出你的第一步!敢于挑战!敢于奋斗!</p>
                </div>
            </div>
            <div class="des-c">
                <div class="des-cn">
                    <p class="des-cn-p">只要你想要，没有什么做不到!</p>
                </div>
            </div>
            <div class="des-c">
                <div class="des-cn">
                    <p class="des-cn-p">即刻起，点赞你的生活，从这一份工作开始!</p>
                </div>
            </div>
        </div>
        <!--右边栏-->
        <div class="listInfo">
            <div class="lr-h">
                <a class="choose" id="loginByPassword">密码登录</a>
                <a class="" id="loginByCode">  </a>
            </div>
            <form id="signup"></form>
        </div>
    </div>
    <img class="lr-bm" src="${pageContext.request.contextPath}/images/jkf_imgs/bm.png" alt="">
</div>


<script src="${pageContext.request.contextPath}/js/javaScript.form.js"></script>
<script src="${pageContext.request.contextPath}/js/login.js"></script>
</body>
