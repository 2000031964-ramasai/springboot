<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h2{
  color:red;
}

</style>
</head>
<body>
<center><h2>Welcome to Serverless Certification Uploading</h2></center>
<h4>Please Upload Your AWS Certificate with file name as your ID</h4>
<form action="upload" method="post" enctype="multipart/form-data">
    <p>
    	Please Enter your College ID only<input type="text" name="uname" required></br>
        <input type="file" name="file" required />
    </p> 
    <p>
        <button type="submit">Upload to AWS</button>
    </p>
</form>
</body>
</html>