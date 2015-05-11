# appi_Salesautomation
Online ordering system and consultations

## Overview

The company Quality Systems group
we are developing a system to bring order online and do some consultations, all as value added to the system QualityErp one of our main products

##  Versioning

The API is in an initial V0 version, trying to get into the web world, experimenting with these technologies

## Design
The API is based on using java 1.0.3 jersey

## routes

**base path : http://localhost:8080/appi_Salesautomation/rest** 
### Edit
**can change the server : http://localhost:8080** 

Serive | Description | method | reply
------|------------|---------|------------
/Consecutivos/|/GetConsecutivo/{tmpCodalm}/{tmpIDProces}/{tmpAño}/{tmpMes}/{tmpIncrementar}|GET|Consecutivo
/Prices|/GetPrices/{codalm}|GET|Lista de precios
/Product|/Getproduct/{tmpCodalm}/{tmpLtsPrecios}/{tmpCodLinea}/{tmpCodsub}/{cant}/{all}|GET|los productos
/Customers|/Getcustomers/{codven}|GET|clientes
/Customers|/Getcustomers/{codven}/{cedula}|GET|cliente por cedula
/Stores|/Getstores/{codalm}|GET|almacenes
/Users|/Getusers|GET|usuarios del sistema
/Invent|/GetInvent/{codalm}|GET|Obtener Inventarios por almacen
/Lines|/GetLines|GET|Obtener todas las categorias
/Sublineas|/GetSublin/{codlinea}|obtener subcaterorias de acuerdo a la categoria
/Pedidos|/GetPed/{codven}|Obtener lista de pedidos, realizados




## dependency
Jar | Description
--------|----------------
sqljdc.jar| sql server 
asm-3.1.jar | is an all purpose Java bytecode manipulation and analysis framework. It can be used to modify existing               classes or dynamically generate classes
jersey-client-1.0.3.jar |in order to simplify development of RESTful Web services and their clients in Java
jersey-core-1.0.3.jar   |in order to simplify development of RESTful Web services and their clients in Java
jersey-server-1.0.3.jar |in order to simplify development of RESTful Web services and their clients in Java
jsr311-api-1.0.jar      |handling of java api
gson-2.2.2.jar          |Gson is a Java library that can be used to convert Java Objects into their JSON representation. It can also be used to convert a JSON string to an equivalent Java object. 




