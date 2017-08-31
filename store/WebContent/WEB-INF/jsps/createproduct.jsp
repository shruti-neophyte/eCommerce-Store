<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- add link to css resources -->

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<sf:form method="post"
		action="${pageContext.request.contextPath}/docreateproduct"
		commandName="product">

		<table class="formtable">
			<tr>
				<td class="label">Name:</td>
				<td><sf:input class="control" path="productname"
						name="productname" type="text" /><br /> <sf:errors
						path="productname" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Category:</td>
				<td><sf:input class="control" path="category" name="category"
						type="text" /><br /> <sf:errors path="category" cssClass="error"></sf:errors></td>
			</tr>



			<tr>
				<td class="label">Description:</td>
				<td><sf:textarea class="control" path="description"
						name="description" rows="10" cols="10"></sf:textarea><br /> <sf:errors
						path="description" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Price:</td>
				<td><sf:input class="control" path="price" name="price"
						type="text" /><br /> <sf:errors path="price" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Units:</td>
				<td><sf:input class="control" path="units" name="units"
						type="text" /><br /> <sf:errors path="units" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Manufacturer:</td>
				<td><sf:input class="control" path="manufacturer"
						name="manufacturer" type="text" /><br /> <sf:errors
						path="manufacturer" cssClass="error"></sf:errors></td>
			</tr>






			<tr>
				<td class="label"></td>
				<td><input class="control" value="Create Product" type="submit" /></td>
			</tr>
		</table>

	</sf:form>
</body>
</html>