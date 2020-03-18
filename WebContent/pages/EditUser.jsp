<%@page import="domain.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	
	DIV.table{
	    display:table;
	}
	FORM.tr, DIV.tr{
	    display:table-row;
	}
	SPAN.td{
	    display:table-cell;
	}
	
</style>
</head>
<body>
	
	<c:url var="getEdit" value="/application/user/edit" />
	
	<div class="flex-container">
		<div class="Login-form">
			<jsp:include page="UserLogout.jsp"></jsp:include>
			<jsp:include page="Home.jsp"></jsp:include>
				<div>
					<div class="table">
						    <div class="tr">
								<span class="td">Surname</span>  
								<span class="td">Name</span>
								<span class="td">Edit</span>
						    </div>
<!-- 							<tbody> -->
								<c:forEach items="${users}" var="user">
								<form class="tr" method="get" action="<c:out value="${getEdit}" />" >
										<span class="td"><input type = "text" id="surnameUser" name = "surnameUser" value = "${user.getSurname()}" /></span>
										<span class="td"><input type = "text" id="nameUser" name = "nameUser" value = "${user.getName() }" /></span>
										<span class="td"><input type = "submit" value="update"/></span>
								</form>
								</c:forEach>
<!-- 							</tbody> -->
					</div>
				</div>
		</div>
	</div>
	

</body>
</html>