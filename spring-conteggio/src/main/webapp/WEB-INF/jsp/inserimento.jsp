<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserimento Stringa</title>
</head>
<body>
<c:if test="${scelta == 'contaParole'}">
<form action="conta-parole" method="post">
<input type="text" required="required" name="testo" placeholder="Inserisci testo">
<input type="submit" value="Conta">
</form>
</c:if>
<c:if test="${scelta == 'contaVocali'}">
<form action="conta-vocali" method="post">
<input type="text" required="required" name="testo" placeholder="Inserisci testo">
<input type="submit" value="Conta">
</form>
</c:if>
<c:if test="${scelta == 'contaConsonanti'}">
<form action="conta-consonanti" method="post">
<input type="text" required="required" name="testo" placeholder="Inserisci testo">
<input type="submit" value="Conta">
</form>
</c:if>
</body>
</html>