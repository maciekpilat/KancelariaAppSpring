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
        <title>Dodaj Klienta</title>
    </head>
    <body>
        <h1>Dodaj Klienta111</h1>
        <form action="addclient" method="post">

            <p>Dane Klienta</p>
            Imię:<br>
            <input type="text" name="firstname"><br>
            Nzwisko:<br>
            <input type="text" name="lastname"><br>
            <input type="submit">
        </form>

    </form>       
</body>
</html>


<!--private Long adress_id;
private Long adress_type; // adres klienta, sadu, miejsca spotkania itp.-->
