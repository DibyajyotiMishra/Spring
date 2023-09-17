<!DOCTYPE html>
<head>
<title>Home</title>
</head>
<body>
<h1>This is Home Page</h1>
<%
    String author = (String) request.getAttribute("name");
%>
<h2>Author: <%= author %></h2>
</body>
</html>