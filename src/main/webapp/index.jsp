<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
</head>
<body>
<h1>hello form</h1>
<html:form action="hello">
NAME:<html:text property="name"/>
 Address:<html:text property="address"/>
 <br>
 <html:errors/> 
 <br>
<html:submit value="SayHello"/>
</html:form>

<html:form action="hell">
NAME:<html:text property="name"/>
 Email:<html:text property="email"/>
 <br>
 <html:errors/> 
 <br>
<html:submit value="SayHi"/>
</html:form>
 <html:form action="/FileUpload.do" method="post" enctype="multipart/form-data">
<table>
<tr>
<td align="center" colspan="2">
<font size="4">Please Enter the Following Details</font>
</tr>

<tr>
<td align="left" colspan="2">
<font color="red"><html:errors/></font>
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


</body>
</html>