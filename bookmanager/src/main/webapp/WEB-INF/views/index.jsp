<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Manager</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto&display=swap">
</head>
<body>
    <div class="container">
        <h1>WELCOME</h1>
        <img src="${pageContext.request.contextPath}/bookmanager.png"
        alt="Book Manager Banner"
        class="small-banner" />
   
        <div class="menu">
            <!-- Corrected URLs -->
            <a href="${pageContext.request.contextPath}/authors" class="btn">Manage Authors</a>
            <a href="${pageContext.request.contextPath}/books" class="btn">Manage Books</a>
        </div>
        <br>
    <br>
    <h6>Made in 🇮🇳 2023EBCS016 TANISHQ VIJAY VAIDYA</h6>
    </div>
</body>
</html>
