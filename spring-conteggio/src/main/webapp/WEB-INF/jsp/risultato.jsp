<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>risultato</title>
</head>
<body>
${testo}, ha: ${conteggio}
<c:if test="${tipo == 'parole'}">
parole
</c:if>
<c:if test="${tipo == 'vocali'}">
vocali
</c:if>
<c:if test="${tipo == 'consonanti'}">
consonanti
</c:if>
<form action="home" method="post">
<input type="submit" value="Torna Alla Home">
</form>
</body>
</html>