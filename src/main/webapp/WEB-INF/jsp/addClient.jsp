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
        <form action="/action_page.php">

            <p>Dane Klienta</p>
            Imię:<br>
            <input type="text" name="firstname"><br>
            Nzwisko:<br>
            <input type="text" name="lastname"><br><br>

            <p>Adres klienta/p>
                Kraj:<br>
                <input type="text" name="country"><br>
                Województwo:<br>
                <input type="text" name="voivodeship"><br>
                Miasto:<br>
                <input type="text" name="city"><br>
                Ulica:<br>
                <input type="text" name="street_name"><br>
                Numer ulicy:<br>
                <input type="text" name="street_number"><br>
                Numer mieszkania:<br>
                <input type="text" name="street_flat_number"><br>

                <input type="submit" value="Submit">
        </form>

        <br><br>
        <input type="submit">
    </form>       
</body>
</html>


<!--private Long adress_id;
private Long adress_type; // adres klienta, sadu, miejsca spotkania itp.-->
