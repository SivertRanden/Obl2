<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type ="text/css" href="style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
<a href="" >Norsk</a>
<a href="" >English (US)</a>
<a href="" >Espanol</a>
<form action="products" method="post">
<table>
<c:forEach var="product" items="${products}">
	<tr>
		<td><b>${product.pName}</b></td>
	</tr>
	<tr>
		<td>${apptext.name}: ${product.pName}
		</td>
	<tr>
	<tr>
		<td>${apptext.price}: ${product.priceInEuro}</td>
	</tr>
	<tr>	
		<td>${apptext.description}: ${product.description.text}</td>
	</tr>
	<tr>
		<td>
		<input type="hidden" name="pno" value="${product.pno}" />
		<input type="hidden" name="pName" value="${product.pName}" />
		<input type="hidden" name="priceInEuro" value="${product.priceInEuro}" />
		<input type="hidden" name="imageFile" value="${product.imageFile}" />
		<input type="hidden" name="langCode" value="${product.description.langCode}" />
		<input type="hidden" name="descriptionText" value="${product.description.text}" />
		
		<input type="submit" value="${apptext.addToCart}"></td>
</c:forEach>
</table>
</form>
<a href="/Obl2/home">${apptext.home}</a>
<a href="/Obl2/cart">${apptext.cart}</a>
</body>
</html>