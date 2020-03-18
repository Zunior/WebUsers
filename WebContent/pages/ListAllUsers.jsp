<%@page import="domain.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
<style type="text/css">
	body{
		margin: 0;
	}

	.flex-container{
		display: flex;
		justify-content: center;
		align-items: center;
		height: 100vh;
	}
	.Login-form div{
		padding: 0.2em;
		text-align: center;
	}
	
/*  	.Login-form div:nth-child(7), div:nth-child(8){  */
/*  		float: left;  */
/*  	}  */
		
	@media all and (max-width: 500px){
		.flex-container{
			flex-direction: column;
		}
	}
	
	#home{
		display: block;
	}
	
	
	
</style>
</head>
<body>
	
<%-- 	<jsp:useBean id="currentUser" class = "domain.User" scope="session"> --%>
<%-- 		<jsp:setProperty name="currentUser" property="name"></jsp:setProperty> --%>
<%-- 	</jsp:useBean> --%>

		<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>
		<c:url var="getDelete" value="/application/user/delete" />
		<c:url var="getEdit" value="/application/user/edit" />
	
	<div class="flex-container">
		<div class="Login-form">
			<jsp:include page="UserLogout.jsp"></jsp:include>
				<div>
					<table>
						<thead>
						    <tr>
								<th>Surname</th>  
								<th>Name</th>
								<th>Username</th>
								<th>Delete</th>
								<th>Edit</th> 
						    </tr>
						</thead>
							<tbody>
								<c:forEach items="${users}" var="user">
								<tr>
									<td><p>${user.getSurname()}</p><br/></td>
									<td><p>${user.getName()}</p><br/></td>
									<td><p>${user.getUsername()}</p><br/></td>
									<td>
										<form method="get" action="<c:out value="${getDelete}" />">
											<input type = "hidden" id="usernameUser" name = "usernameUser" value = "${user.getUsername()}" />
											<input type = "submit" value="delete"/>
										</form>
									</td>
									<td>
										<form method="get" action="<c:out value="${getEdit}" />">
											<input type = "hidden" id="surnameUser" name = "surnameUser" value = "${user.getSurname()}" />
											<input type = "hidden" id="nameUser" name = "nameUser" value = "${user.getName()}" />
											<input type = "hidden" id="usernameUser" name = "usernameUser" value = "${user.getUsername()}" />
											<input type = "hidden" id="passwordUser" name = "passwordUser" value = "${user.getPassword()}" />
											<input type = "submit" value="edit"/>
										</form>
									</td>
								</tr>
								</c:forEach>
							</tbody>
<%-- 							<c:out value="${getDelete}" /> --%>
					</table>
				</div>
		</div>
	</div>
	

</body>
</html>