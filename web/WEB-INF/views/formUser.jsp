<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 8/31/2020
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/form" var="url"></c:url>
<%--@elvariable id="user" type="com.S2kael.Unity.User"--%>
<form:form modelAttribute="user" method="post" action="${url}">
    <div>
        <form:label path="name">User name:</form:label>
        <form:input path="name"/>
    </div>
    <div>
        <form:label path="id">ID:</form:label>
        <form:input path="id"/>
    </div>
    <div>
        <button type="submit">Submit </button>
    </div>
</form:form>
</body>
</html>
