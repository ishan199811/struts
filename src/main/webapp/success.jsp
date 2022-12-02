<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=request.getAttribute("res") %>
<%=request.getAttribute("ress") %>

File uploaded to : <%= request.getAttribute("uploadedFilePath") %>
	
<table>
  <tr> <th>Id</th>
    <th>name</th>
    <th>email</th>
    <th>edit</th>
    <th>delete</th>
    
  </tr>
  <logic:iterate name="listUsers" id="listUserId">
  <tr>
    <td><bean:write name="listUserId" property="id"/></td>
    <td><bean:write name="listUserId" property="name"/></td>
    <td><bean:write name="listUserId" property="address"/></td>
    <td></td>
     <td></td>
  </tr>
  </logic:iterate>
</table>
</body>
</html>