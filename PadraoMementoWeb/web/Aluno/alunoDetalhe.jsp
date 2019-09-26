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
        <h1>Listando alunos</h1>
        <table>            
              <tr>
                <td>#</td>
                <td>Nome</td>
                <td>Estado</td>
              </tr>
            <c:forEach items="${listAlunos}" var="aluno">
              <tr>
                <td><c:out value="${aluno.getId()}" /></td>
                <td><c:out value="${aluno.getNome()}" /></td>
                <td><c:out value="${aluno.getNomeEstado()}" /></td>
              </tr>
            </c:forEach>
        </table>
    </body>
</html>
