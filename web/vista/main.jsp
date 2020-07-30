<%-- 
    Document   : main
    Created on : 29-jul-2020, 18:39:15
    Author     : vinil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="strut" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <strut:form action="login">
            <strut:textfield name="cedula"></strut:textfield>
            <strut:textfield name="contrasena"></strut:textfield>
            <strut:submit value="Log In"></strut:submit>
        </strut:form>
    </body>
</html>
