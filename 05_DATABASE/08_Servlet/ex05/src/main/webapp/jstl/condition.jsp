<%--
  Created by IntelliJ IDEA.
  User: LEE
  Date: 2026-06-11
  Time: 오후 2:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${score >= 60}" var="testResult" scope="session">
    <p>합격입니다!</p>
</c:if>
<c:if test="${score < 60}">
    <p>불합격입니다..</p>
</c:if>
</body>
</html>
