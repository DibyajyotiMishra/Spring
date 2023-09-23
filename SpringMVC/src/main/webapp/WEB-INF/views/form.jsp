 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Complex Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<div class="container text-center mt-4">
  <h3>Welcome to VeryFast Fibernet.</h3>
  <p>Help us reach out to you by filling up the form below.</p>
</div>

<div class="container text-center">
    <div class="w-50 mx-auto alert alert-danger alert-dismissible fade show" role="alert">
      <form:errors path="user.*" />
      <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>
</div>

    <div class="card bg-dark w-50 text-white container mt-5">
      <div class="mx-auto">
      <form action="handleForm" method="POST">
          <div class="card-body form-group">
            <div class="  input-group">
              <span class="input-group-text">First and last name</span>
              <input type="text" name="firstName" aria-label="First name" placeholder="John" class="form-control">
              <input type="text" name="lastName" aria-label="Last name" placeholder="Doe" class="form-control">
            </div>
            <div class=" mt-2 input-group">
              <span class="input-group-text">User ID</span>
              <input aria-label="userId" class="form-control" name="userId" type="text" placeholder="1264947" />
            </div>
            <div class=" mt-2 input-group">
              <span class="input-group-text">Email</span>
              <input aria-label="email" class="form-control" name="email" type="email" placeholder="john.doe@example.com" />
            </div>
            <div class=" mt-2 input-group">
              <span class="input-group-text">Phone Number</span>
              <input aria-label="phone" class="form-control" name="phone" type="tel" placeholder="+(91) 9999999999" />
            </div>
            <div class=" mt-2 input-group">
              <select class="form-select" name="buildingType" aria-label="Default select example">
                <option selected>Select Building Type</option>
                <option value="apartment">Apartment</option>
                <option value="villa">Villa</option>
                <option value="other">Other</option>
              </select>
            </div>
            <div class=" mt-2 ">
              <label>Select User Type:  &nbsp;</label>
              <div class="form-check form-check-inline">
                <input class="form-check-input" name="userType" type="radio" id="inlineCheckbox1" value="new">
                <label class="form-check-label" for="inlineCheckbox1">New User</label>
              </div>
              <div class="form-check form-check-inline">
                <input class="form-check-input" name="userType" type="radio" id="inlineCheckbox2" value="old">
                <label class="form-check-label" for="inlineCheckbox2">Existing User</label>
              </div>
               <div class=" mt-2  input-group">
                 <span class="input-group-text">Address</span>
                 <input type="text" name="address.addressline1" aria-label="Address Line 1" placeholder="Address Line 1" class="form-control">
                 <input type="text" name="address.addressline2" aria-label="Address Line 2" placeholder="Address Line 2" class="form-control">
               </div>
                 <div class=" mt-2  input-group">
                 <span class="input-group-text">City and Pincode</span>
                 <input type="text" name="address.city" aria-label="City" placeholder="City" class="form-control">
                 <input type="text" name="address.pincode" aria-label="Pincode" placeholder="Pincode" class="form-control">
               </div>
            </div>
            <div class="mt-4 text-center">
              <button class="btn btn-outline-light w-100">Submit</button>
            </div>
          </div>
        </form>
    </div>
    </div>
</body>
</html>