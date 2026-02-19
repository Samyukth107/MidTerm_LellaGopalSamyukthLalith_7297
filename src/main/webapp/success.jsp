<%@ page import="midterm.SamyukthLalithLellaGopal.model.Employment" %>
<!DOCTYPE html>
<html>
<head>
    <title>Submitted</title>
</head>
<body>

<%
    Employment emp = (Employment) request.getAttribute("emp");
%>

<h2>Application Submitted Successfully</h2>

<p><b>Full Name:</b> <%= emp.getFullname() %></p>
<p><b>Contact:</b> <%= emp.getContactNumber() %></p>
<p><b>Email:</b> <%= emp.getEmail() %></p>
<p><b>Date Available:</b> <%= emp.getDateAvailable() %></p>
<p><b>Salary:</b> <%= emp.getSalary() %></p>

</body>
</html>
