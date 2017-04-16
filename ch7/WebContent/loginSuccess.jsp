<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@ page import="dto.User" %>
<html>
<head>
<title>loginSuccess.jsp</title>
</head>
<body>
<jsp:useBean id="user" type="dto.User" scope="request"/>
¹§Ï²<jsp:getProperty property="name" name="user"/>µÇÂ¼³É¹¦£¡
</body>
</html>
