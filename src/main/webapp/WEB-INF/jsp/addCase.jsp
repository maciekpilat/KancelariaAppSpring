<%-- 
    Document   : addEvent
    Created on : 2017-10-19, 13:51:40
    Author     : Pilat
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodaj sprawę</title>
    </head>
    <body>
        <h1>Dodaj sprawę</h1>
        <form action="addcase" method="post">
            
            Nazwa sprawy:<br>
            <input type="text" name="caseTitle"><br>
           
            Data rozpoczęcia:<br>
            <input type="text" name="caseStartDate"><br>
            
            Data zakonczenia:<br>
            <input type="text" name="dateEndDate"><br>
            
            Dlient:<br>
            <input type="text" name="clientId"><br>
            
            <input type="submit">
        </form>

    </form>       
</body>
</html>