<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
		<title>Kranti Tech Services</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
		<script src="WEB-INF/css/style.css"></script>
</head>

<body style="background-color: skyblue"; >
	<div class="container">
		<div class="row">
			<div class="col-sm-4">
			</div>
						<div class="col-sm-4" ng-app="myApp" ng-controller="addTraineeControler" >
							<h1>Kranti Tech Services</h1>
				 			<p class="p">Attendance Management System</p> 
				  			<img class="img-rounded" src="static/image/abc.jpg" alt="Not Found" width="360" height="236"> 

				  			<form>
				   				<div class="form-group" ng-app="">
							      <label for="user">User Name:</label>
							      <input type="user" ng-model="user" class="form-control" id="user" placeholder="Enter Uname" name="name" required ng-model="firstname" >
				   				</div>

				   				<div class="form-group">
				    			    <label for="pwd">Password:</label>
				    				<input type="password" ng-model="upass" class="form-control my-password" name="upass" placeholder="Enter password"  pattern="^[_A-z0-9]{1,}$" maxlength="15" required data-toggle="password" required />
  										<input type="checkbox" class="showPassword" />Show Password
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-info btn-md" ng-click="login()">Login</button>
									<br>
				   					<a href="" style="color: red">Forgot Password</a>
				   				</div>
				  			</form>
				  				<script>
				  				var app = angular.module('myApp', []);
				  					app.controller('addTraineeControler',function($scope,$http){
				  			
				  						$scope.login=function(){
				  							$http.post("http://localhost:8080/krantiTech/Admin/",{ 'name':$scope.user,'upass':$scope.upass });
				  								then(function(data,status,headers,config){
				  									console.log("data insert successfull");
				  								});
				  						}
				  					});
				  				</script>
						</div>

			<div class="col-sm-4">
				
			</div>
		</div>
	</div>

</body>
</html>