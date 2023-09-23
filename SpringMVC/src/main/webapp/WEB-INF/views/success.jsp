<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Message Sent</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<div class="container text-center">
  <h2>Hurray! Your message is sent</h2>
  <p>${message}</p>
  <h4>Here's a copy of your sent item:</h4>

  <p>First Name: ${response.firstName}</p>
  <p>Last Name: ${response.lastName}</p>

  <div class="container text-center">
    <a class="btn btn-primary" href="form">Go back</a>
  </div>
</div>

</body>
</html>