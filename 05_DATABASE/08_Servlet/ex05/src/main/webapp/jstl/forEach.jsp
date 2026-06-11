<%--
  Created by IntelliJ IDEA.
  User: LEE
  Date: 2026-06-11
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>조건문 결과</h3>
조건 결과 : ${sessionScope.testResult}

<h3>회원 목록</h3>
<ul>
    <c:forEach var="m" items="${memberList}">
        <li>${m.name} : ${m.userid}</li>
    </c:forEach>
</ul>
</body>
</html>
