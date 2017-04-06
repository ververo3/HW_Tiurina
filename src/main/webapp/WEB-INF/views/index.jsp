<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Hello World</title>
</head>

<body>
<h2><c:out value="${message}"></c:out></h2>
<c:out value="hello, employee with ID:" />
<h3><c:out value="${EmpId}"></c:out></h3>
<p><c:out value="First name: " /><c:out value="${FirstName}" /> </p>
<p><c:out value="Last name:" /><c:out value="${LastName}" /></p>
<p><c:out value="Salary: " /><c:out value="${Salary}" /></p>
</body>
</html>