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
        <title>Add Adress</title>
    </head>
    <body>
        <h1>Dodaj Adres</h1>
        <!--pametaj o tym co nizej-->
        <form action="addadress" method="post" > 

            <p>Dane adres</p>
            Typ adresu:<br>
            <input type="number" name="adress_type"><br>
            Kraj:<br>
            <input type="number" name="country"><br>
            Województwo:<br>
            <input type="number" name="voivodeship"><br>
            Miasto:<br>
            <input type="number" name="city"><br>
            Ulica:<br>
            <input type="text" name="street_name"><br>
            Numer ulicy:<br>
            <input type="number" name="street_number"><br>
            Numer mieszkania:<br>
            <input type="number" name="street_flat_number"><br>
            <input type="submit" value="Submit">
        </form>        
    </body>
</html>
