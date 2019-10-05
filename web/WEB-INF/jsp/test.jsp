<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试二进制</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body>
    <h1>十进制转二进制---springmvc</h1>
	<form action="/edu201909/player/test/turn2Binary" method="post">
		<input type="text" name="data" value="${ten_number}"> <input type="submit"
			value="轉換">
			<input type="text" value="${binary_result}">
	</form>
<!-- <form:form action="/demo/ten2Binary" method="POST">
    <form:input path="ten_number"/>
    <form:button value="change"></form:button>
    </form:form> -->
   
</body>
</html>