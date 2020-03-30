<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home odabir</title>
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
	
</style>
</head>
<body>

	<jsp:useBean id="currentUser" class = "domain.User" scope="session">
		<jsp:setProperty name="currentUser" property="name"></jsp:setProperty>
	</jsp:useBean>
	
	<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>
	<c:url var="listUserURL" value="/application/user/list"/>
	<c:url var="listAllUserURL" value="/application/user/listAll"/>
	<c:url var="addUserURL" value="/application/user/add"/>
	
	<div class="flex-container">
		<div class="Login-form">
			<jsp:include page="UserLogout.jsp"></jsp:include>
				<div>
					<a href="<c:out value="${listUserURL}"/>">Active users</a>
				</div>
				<br />
				<div>
					<a href="<c:out value="${listAllUserURL}"/>">All users</a>
				</div>
				<br />
				<div>
					<a href="<c:out value="${addUserURL}"/>">New user</a> 
				</div>
				<br />
				<c:out value="${loggedMessage}"></c:out>
		</div>
	</div>


</body>
</html>