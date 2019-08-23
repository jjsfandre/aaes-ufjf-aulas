<%-- 
    Document   : contatoListagem
    Created on : 20/08/2019, 22:36:09
    Author     : jjsfa
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listando contatos</h1>
        <table>            
              <tr>
                <td>Nome</td>
                <td>Email</td>
              </tr>
            <c:forEach items="${listContatos}" var="contato">
              <tr>
                <td><c:out value="${contato.getNome()}" /></td>
                <td><c:out value="${contato.getEmail()}" /></td>
              </tr>
            </c:forEach>
        </table>
    </body>
</html>
