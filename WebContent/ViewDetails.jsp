<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	background-image: url(img/vvv.jpg);
}

h1 {
	color: maroon;
}

h2 {
	color: purple;
}
</style>

</head>
<body>
	<center>
		<form action="registraion.do" method="post">
			<table>
				<h1>View Details</h1>
				<tr>
					<td><h2>PERSONAL DEATILS</h2></td>
				</tr>
				<tr>
					<td>Firstname :</td>
					<td><h4>${dto.getFirstname() }</h4></td>
					</tr>
				<tr>
					<td>Lastname:</td>
					<td><h4>${dto.getLastname() }</h4></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><h4>${dto.getGender() }</h4></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><h4>${dto.getEmail() }</h4></td>
				</tr>


				<td><h2>EDUCATIONAL DEATILS</h2></td>

				<tr>
					<td>Degree:</td>
					<td><h4>${dto.getDegree() }</h4></td>
				</tr>
				<tr>
					<td>College name:</td>
					<td><h4>${dto.getCname() }</h4></td>
				</tr>
				<tr>
					<td>Year of Passing:</td>
					<td><h4>${dto.getCyop() }</h4></td>
				</tr>
				<tr>
				<tr>
					<td>PUC/Diploma:</td>
					<td><h4>${dto.getPname() }</h4></td>
				</tr>
				<tr>
					<td>Year of Passing:</td>
					<td><h4>${dto.getPyop() }</h4></td>
				</tr>
				<tr>
				<tr>

					<td>School edu</td>
					<td><h4>${dto.getSname() }</h4></td>
				</tr>
				<tr>
					<td>Year of Passing:</td>
					<td><h4>${dto.getSyop() }</h4></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td></td>
			</table>
			<a href="home.jsp">BACK</a>
		</form>

	</center>

</body>
</html>