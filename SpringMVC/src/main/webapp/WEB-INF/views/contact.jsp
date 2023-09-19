<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact Us</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<div class="text-center mt-3">
    <h3>Send us a message!</h3>
    <p>${message}</p>
</div>
<div class="row mt-5">
<div class="col-2"></div>
<div class="col-8">
    <form action="submit" method="POST">
        <div class="input-group">
            <span class="input-group-text">First and last name</span>
            <input type="text" id="firstName" name="firstName" aria-label="First name" class="form-control">
            <input type="text" id="lastName" name="lastName" aria-label="Last name" class="form-control">
        </div>
        <div class="mb-3">
            <label for="message" class="form-label">Your Message</label>
            <textarea class="form-control" name="message" id="message" rows="3"></textarea>
        </div>
        <div class="mb-3">
            <button type="submit" class="w-100 btn btn-outline-dark">Send</button>
        </div>
    </form>
</div>
<div class="col-2"></div>
</body>
</html>