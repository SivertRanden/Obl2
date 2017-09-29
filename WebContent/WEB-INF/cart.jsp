<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="dat152-tags" prefix="dat152" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type ="text/css" href="style.css"/>
<title>Cart</title>
</head>
<body>
<a href="/Obl2/cart?language=no" >Norsk</a>
<a href="/Obl2/cart?language=en" >English (US)</a>
<a href="/Obl2/cart?language=es" >Espanol</a>
<h1>Cart</h1>
<table>
<tr>
	<td><b>${apptext.name}</b></td>
	<td><b>${apptext.shortDescription}</b></td>
	<td><b>${apptext.price}</b></td>
	<td><b>${apptext.quantity}</b></td>
	<td><b>${apptext.total}</b></td>
</tr>
<c:forEach var="product" items="${cart.products}">
<tr>
	<td>${product.pName}</td>
	<td>Kort beskrivelse</td>
	<td>${product.priceInEuro}</td>

	<td>total</td>
</tr>

</c:forEach>
<tr>
	<td><b>${apptext.totalAmount}: </b></td>
	<td><b>${cart.sum}</b></td>
</tr>
</table>
</form>
<a href="/Obl2/home">${apptext.home}</a>
<a href="/Obl2/cart">${apptext.cart}</a>
<dat152:printCopyright year="2009"/>
</body>
</html>