<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Help</title>
</head>
<body>
    <h1>This is Help Page</h1>
    <%-- <%
      String phone = (String) request.getAttribute("phone");
    %> --%>
    <h3>
    Contact us at: ${phone}
    <%-- <%= phone %> --%>
    </h3>
</body>
</html>