<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
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


</head>
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
 <td><button >Edit</button></td>
 
 
  <td>
    <html:form action="delete.do">
   <html:text name="listUserId" property="id" /> 
<html:submit value="Delete"/>
</html:form>
 </td>
  </tr>
  </logic:iterate>
</table>