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
        <title>Dodaj wydarzenie</title>
    </head>
    <body>
        <h1>Dodaj wydarzenie</h1>
        <form action="addcase" method="post">
            
            Typ wydarzenia:<br>
            <input type="text" name="event"><br>
            
            <input type="submit">
        </form>

    </form>       
</body>
</html>