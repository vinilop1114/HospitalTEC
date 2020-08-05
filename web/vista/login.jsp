<%-- 
    Document   : login
    Created on : 04-ago-2020, 17:41:45
    Author     : vinil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="loginprocess">
            <s:textfield name="cedula" label="Cedula"></s:textfield>
            <s:password name="contrasena" label="Contrasena"></s:password>
            <s:submit value="login"></s:submit>
        </s:form>
    </body>
</html>
