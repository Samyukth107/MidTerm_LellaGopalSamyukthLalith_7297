<!DOCTYPE html>
<html>
<head>
    <title>Employment Application</title>
</head>
<body>

<h2>Employment Application</h2>

<form action="submitEmployment" method="post">

    <!-- 1) FullName: characters only, max 50 -->
    <label>Full Name:</label>
    <input type="text" name="fullname"
           required
           maxlength="50"
           pattern="[A-Za-z ]{1,50}"
           title="Only letters and spaces allowed. Max 50 characters.">
    <br><br>

    <!-- 2) ContactNumber: exactly 10 digits -->
    <label>Contact Number:</label>
    <input type="text" name="contactNumber"
           required
           pattern="[0-9]{10}"
           title="Enter exactly 10 digits (example: 7051234567).">
    <br><br>

    <!-- 3) Email: type email -->
    <label>Email:</label>
    <input type="email" name="email" required>
    <br><br>

    <!-- 4) Date available: date only -->
    <label>Date Available:</label>
    <input type="date" name="dateAvailable" required>
    <br><br>

    <!-- 5) Salary: up to 6 digits + . + 2 decimals (999990.60) -->
    <label>Desired Salary:</label>
    <input type="text" name="salary"
           required
           pattern="[0-9]{1,6}\.[0-9]{2}"
           title="Enter salary like 999990.60 (up to 6 digits then 2 decimals).">
    <br><br>

    <!-- Signature replaced by submit button -->
    <input type="submit" value="Submit Application">

</form>

</body>
</html>
