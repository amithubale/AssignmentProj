<%@page import="com.sun.prism.paint.Color"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
body {
	background-image: url(img/tt.jpg);
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
				<h1>REGISTRATION PAGE</h1>
				<tr>
					<td><h2>PERSONAL DEATILS</h2></td>
				</tr>
				<tr>
					<td>Firstname :</td>
					<td><input type="text" name="firstname"
						pattern="[A-Z a-z]{4,}"
						title="name should be start with uppper remain lower" required></td>

				</tr>
				<tr>
					<td>Lastname:</td>
					<td><input type="text" name="lastname" pattern="[A-Za-z]{1,}"
						title="should not empty" required></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td>male:<input type="radio" value="Male" name="gender"
						required> female:<input type="radio" value="Female"
						name="gender" required title="gender not selected"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"
						title="email formate ****@.com " required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"
						title="six or more charecters" id="user_password" required /></td>
				</tr>
				<tr>
					<td>Conform password</td>
					<td><input type="password" name="changepawd"
						id="user_password_confirm" onchange="javascript:validatepww()"
						title="password and conform password must same" required /></td>
				</tr>


				<td><h2>EDUCATIONAL DEATILS</h2></td>

				<tr>
					<td>Degree:</td>
					<td><select name="degree">
							<optgroup label="select degree" required>
								<option value="BE">BE</option>
								<option value="Bsc">BSc</option>
								<option value="BCA">BCA</option>
								<option value="BBM">BBM</option>
								<option value="BCOM">BCOM</option>
							</optgroup>
					</select></td>
				</tr>
				<tr>
					<td>College name:</td>
					<td><input type="text" name="cname" title="feild must String"
						required /></td>
				</tr>
				<tr>
					<td>Year of Passing:</td>
					<td><input type="text" name="cyop" pattern="[0-9]{4,}"
						required /></td>
				</tr>
				<tr>
					<tr>
					<td>PUC/Diploma:</td>
					<td><input type="text" name="pname" title="feild must String"
						required /></td>
				</tr>
				<tr>
					<td>Year of Passing:</td>
					<td><input type="text" name="pyop" pattern="[0-9]{4,}"
						required /></td>
				</tr>
				<tr><tr>

									<td>School edu</td>
					<td><input type="text" name="sname" title="feild must String"
						required /></td>
				</tr>
				<tr>
					<td>Year of Passing:</td>
					<td><input type="text" name="syop" pattern="[0-9]{4,}"
						required /></td>
				</tr>
				<tr>
				<td></td>
				</tr>
				<tr>
				<td></td>
				</tr>
				<tr>
				<td><input style="margin-left: 40%;" type="submit"
						class="button" value="submit">
				
					<td><input type="reset"></td>
					</td>	
				</tr>
				<tr>
				</tr>
				<script type="text/javascript" language="javascript">
					function validatepww() {
						var password = document.getElementById("user_password").value;
						var conformpasswd = document
								.getElementById("user_password_confirm").value;
						if (password != conformpasswd) {
							alert('Passwords did not match!');
							return false;
						}
						return true;
					}
				</script>
				
			</table>
		</form>
	</center>
</body>
</html>