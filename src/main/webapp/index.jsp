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
</body>
</html>