<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户注册</title>
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
                <a href="" class="choose">手机注册</a>
            </div>
            <form id="signup">
                <div>
                    <label for="phoneIpt">手机号码</label>
                    <span id="sp1"></span>
                </div>
                <div>
                    <input type="text" maxlength="11" class="ipt1" id="phoneIpt" name="custTelno"
                           placeholder="请输入手机号">
                </div>
                <div>
                    <label for="passwordIpt">密码</label>
                    <span id="sp3"></span>
                </div>
                <div>
                    <input type="password" class="ipt1" maxlength="16" id="passwordIpt" name="custPassword"
                           placeholder="可以包含数字、字母以及下划线，6-16位">
                </div>
                <div>
                    <label for="rePwdIpt">确认密码</label>
                    <span id="sp4"></span>
                </div>
                <div>
                    <input type="password" class="ipt1" maxlength="16" id="rePwdIpt"
                           placeholder="请确认密码">
                </div>
                <div>
                    <label for="codeIpt">短信验证码</label>
                    <span id="sp2"></span>
                </div>
                <div>
                    <input type="text" class="ipt2" maxlength="6" id="codeIpt"
                           placeholder="请输入验证码">
                    <button type="button" class="btn" id="sendCodeBtn">发送验证码</button>
                </div>
                <div>
                    <span id="registerMsg"></span>
                    <button type="button" class="btn" id="registerBtn" disabled>注册</button>
                </div>
            </form>
        </div>
    </div>
    <img class="lr-bm" src="${pageContext.request.contextPath}/images/jkf_imgs/bm.png" alt="">
</div>


<script src="${pageContext.request.contextPath}/js/javaScript.form.js"></script>
<script src="${pageContext.request.contextPath}/js/register.js"></script>
</body>
