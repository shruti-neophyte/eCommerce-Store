<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/confirmp/jquery.js"></script>

<script type="text/javascript">
	function onLoad() {

		$("#password").keyup(checkPasswordsMatch);
		$("#confirmpass").keyup(checkPasswordsMatch);

		$("#details").submit(canSubmit);
	}
	
	function canSubmit() {
		var password = $("#password").val();
		var confirmpass = $("#confirmpass").val();
		
		if(password != confirmpass) {
			alert("Passwords do not match!")
			return false;
		}
		else {
			return true;
		}
	}

	function checkPasswordsMatch() {
		var password = $("#password").val();
		var confirmpass = $("#confirmpass").val();

		if (password.length > 3 || confirmpass.length > 3) {

			if (password == confirmpass) {
				$("#matchpass").text("Passwords match.");
				$("#matchpass").addClass("valid");
				$("#matchpass").removeClass("error");
			} else {
				$("#matchpass").text("Passwords do not match.");
				$("#matchpass").addClass("error");
				$("#matchpass").removeClass("valid");
			}
		}
	}

	$(document).ready(onLoad);
</script>


</head>
<body>
	Register Customer
	<br /> Please fill in your information below.
	<br /> Basic Info
	<br />
	<br>

	<sf:form method="post"
		action="${pageContext.request.contextPath}/docreatecustomer"
		commandName="customer" id="details">
		<table class="formtable">

			<tr>
				<td class="label">Name:</td>
				<td><sf:input class="control" path="name" name="name"
						type="text" /><br /> <sf:errors path="name" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Username:</td>
				<td><sf:input class="control" path="username" name="username"
						type="text" /><br /> <sf:errors path="username" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Email:</td>
				<td><sf:input class="control" path="email" name="email"
						type="text" /><br /> <sf:errors path="email" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Password:</td>
				<td><sf:input class="control" id="password" path="password" name="password"
						type="text" /><br /> <sf:errors path="password" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Confirm Password:</td>
				<td><sf:input id="confirmpass" class="control" path="password" name="password"
						type="text" /><br /> <sf:errors path="password" cssClass="error"></sf:errors><div id="matchpass"></div></td>
			</tr>
			<tr>
				<td class="label">Phone:</td>
				<td><sf:input class="control" path="phone" name="phone"
						type="text" /><br /> <sf:errors path="phone" cssClass="error"></sf:errors></td>
			</tr>

			<tr>
				<td class="label">Streetname:</td>
				<td><sf:input class="control" path="streetname"
						name="streetname" type="text" /><br /> <sf:errors
						path="streetname" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Aptno:</td>
				<td><sf:input class="control" path="aptno" name="aptno"
						type="text" /><br /> <sf:errors path="aptno" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">City:</td>
				<td><sf:input class="control" path="city" name="city"
						type="text" /><br /> <sf:errors path="city" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Country:</td>
				<td><sf:input class="control" path="country" name="country"
						type="text" /><br /> <sf:errors path="country" cssClass="error"></sf:errors></td>
			</tr>

			<tr>
				<td class="label"></td>
				<td><input class="control" value="Register Customer"
					type="submit" /></td>
			</tr>

		</table>

	</sf:form>
</body>
</html>