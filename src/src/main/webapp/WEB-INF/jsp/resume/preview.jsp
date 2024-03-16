<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>预览简历</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/resumePreview.css">
</head>
<body>
<jsp:include page="../navigate/navigate.jsp"/>

<div class="column">
    <!--基本信息-->
    <table class="box1" id="tab_basic">
        <tr>

            <td>
                <table cellspacing="0" cellpadding="0" border="0" class="infr">
                    <tr>
                        <td colspan="2" class="name">${requestScope.resumeAllVO.resume.resumeName}</td>
                        <td align="right" class="icard">ID: ${requestScope.resumeAllVO.resume.resumeId}</td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="3">
                            <p style="margin-bottom: 5px">
                                <c:if test="${requestScope.resumeAllVO.resume.resumeGender != null}">
                                    <span>${requestScope.resumeAllVO.resume.resumeGender=="M"?"男":"女"}</span>
                                </c:if>
                                <c:if test="${requestScope.resumeAllVO.resume.resumeGender != null}">
                                    <span class="p5">|</span>
                                </c:if>
                                <c:if test="${requestScope.resumeAllVO.resume.resumeBirth != null}">
                                    <span>生日: <fmt:formatDate value="${requestScope.resumeAllVO.resume.resumeBirth}"
                                                              pattern="yyyy/MM/dd"/></span>
                                </c:if>
                                <c:if test="${requestScope.resumeAllVO.resume.resumeBirth != null}">
                                    <span class="p5">|</span>
                                </c:if>
                                <c:if test="${requestScope.resumeAllVO.resume.resumeLiveCity != null}">
                                    <span class="p5">|</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <c:if test="${requestScope.resumeAllVO.resume.resumeLeavingWorking != null}">
                            <td valign="top">
                                <img alt="" class="vam"
                                     src="${pageContext.request.contextPath}/images/resumePreview/flag.png" width="20"
                                     height="20"/>
                                    ${requestScope.resumeAllVO.resume.resumeLeavingWorking}
                            </td>
                        </c:if>
                        <c:if test="${requestScope.resumeAllVO.resume.resumeTelno != null}">
                            <td valign="top">
                                <img alt="" class="vam"
                                     src="${pageContext.request.contextPath}/images/resumePreview/tel.png" width="20"
                                     height="20"/>
                                    ${requestScope.resumeAllVO.resume.resumeTelno}
                            </td>
                        </c:if>
                        <c:if test="${requestScope.resumeAllVO.resume.resumeEmail != null}">
                            <td valign="top">
                                <img alt="" class="vam"
                                     src="${pageContext.request.contextPath}/images/resumePreview/email.png" width="20"
                                     height="20"/>
                                    ${requestScope.resumeAllVO.resume.resumeEmail}
                            </td>
                        </c:if>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <!--求职意向-->
    <table class="box box1" id="tab_career">
        <tr class="tba">
            <td class="p15">
                <c:if test="${requestScope.resumeAllVO.resume.resumeIncome != null}">
                    <div class="col1">
                        <span class="keys">期望薪资：</span>
                        <span class="txt2">${requestScope.resumeAllVO.resume.resumeIncome} 元</span>
                    </div>
                </c:if>
                <c:if test="${requestScope.resumeAllVO.resume.resumeFullPartTime != null}">
                    <div class="col1">
                        <span class="keys">工作类型：</span>
                        <span class="txt2">${requestScope.resumeAllVO.resume.resumeFullPartTime}</span>
                    </div>
                </c:if>
            </td>
        </tr>
    </table>

    <c:if test="${requestScope.resumeAllVO.projectExperienceList != null}">

        <!-- 项目经验 -->
        <table class="box" id="tab_project">
            <tr>
                <td class="plate1">项目经验</td>
            </tr>
            <c:forEach var="pro_exp" items="${requestScope.resumeAllVO.projectExperienceList}">
                <tr class="tba">
                    <td class="p15">
                        <div class="col2">
                        <span class="time">
                            <fmt:formatDate value="${pro_exp.projectStartTime}" pattern="yyyy/MM/dd"/>
                            -
                            <fmt:formatDate value="${pro_exp.projectEndTime}" pattern="yyyy/MM/dd"/>
                        </span>
                            <strong>${pro_exp.projectName}</strong>
                        </div>
                        <div class="col2">
                            <span class="keys">所属公司：</span>
                            <span class="txt1">${pro_exp.projectCompanyName}</span>
                        </div>
                        <div class="col2">
                            <span class="keys">项目描述：</span>
                            <span class="txt1">${pro_exp.projectContentDesc}</span>
                        </div>
                        <div class="col2">
                            <span class="keys">责任描述：</span>
                            <span class="txt1">${pro_exp.projectDutyDesc}</span>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <c:if test="${requestScope.resumeAllVO.skillList!=null}">
        <!--专业技能-->
        <table class="box" id="tab_skills">
            <tr>
                <td class="plate1">专业技能</td>
            </tr>
            <c:forEach var="skill" items="${requestScope.resumeAllVO.skillList}">
                <tr class="tba">
                    <td class="p15 cell">
                        <div class="col2">
                            <span class="time">${skill.skillName}</span>
                            <span class="skbg">
                            <span class="skco
                            ${skill.skillDesc=="精通"?" skco1":""}
                            ${skill.skillDesc=="熟练"?" skco2":""}
                            ${skill.skillDesc=="良好"?" skco3":""}
                            ${skill.skillDesc=="一般"?" skco4":""}
                            ">
                                    ${skill.skillDesc}
                            </span>
                        </span>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <c:if test="${requestScope.resumeAllVO.honorList != null}">
        <!--校内荣誉-->
        <table class="box" id="tab_schoolHonor">
            <tr>
                <td class="plate1">校内荣誉</td>
            </tr>
            <c:forEach var="honor" items="${requestScope.resumeAllVO.honorList}">
                <tr class="tba">
                    <td class="p15">
                        <div class="col2">
                        <span class="time">
                            <fmt:formatDate value="${honor.honorCreateTime}" pattern="yyyy/MM/dd"/>
                        </span>
                            <strong class="time">${honor.honorName}</strong>
                            <span>${honor.honorGrade}</span>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>

</body>
</html>
