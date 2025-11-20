<%@ page import="java.io.*" %>

<html>
<head>
    <title>Greeting</title>
</head>
<body>

<%
    String name = request.getParameter("name");
    String age = request.getParameter("age");
%>

<h2>Hello, <%= name %>!</h2>
<p>You are <%= age %> years old.</p>

</body>
</html>
