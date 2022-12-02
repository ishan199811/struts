<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
</head>
<body>
<h1>hello form</h1>

<html:form action="hell">
NAME:<html:text property="name"/>
 Email:<html:text property="email"/>
 <br>
 
 <br>
<html:submit value="Save data (without-validation)"/>
</html:form>
 <html:form action="/FileUpload.do" method="post" enctype="multipart/form-data">
<table>
<tr>
<td align="center" colspan="2">
<font size="4">Please Enter the Following Details</font>
</tr>

<tr>
<td align="left" colspan="2">

</tr>



<tr>
<td align="right">
File Name
</td>
<td align="left">
<html:file property="file"/> 
</td>
</tr>


<tr>
<td align="center" colspan="2">
<html:submit>Upload File</html:submit>
</td>
</tr>
</table>
</html:form>
<p>
<a href="demo.do">click here to see user list</a>
</p>
</body>
</html>