<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=request.getAttribute("res") %>
<%=request.getAttribute("ress") %>

File uploaded to : <%= request.getAttribute("uploadedFilePath") %>
	

</body>
</html>