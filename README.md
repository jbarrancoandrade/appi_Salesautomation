# appi_Salesautomation
Online ordering system and consultations

## Overview

The company Quality Systems group
we are developing a system to bring order online and do some consultations, all as value added to the system QualityErp one of our main products

##  Versioning

The API is based on using java 1.0.3 jersey

## Design

The API is in an initial V0 version, trying to get into the web world, experimenting with these technologies

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

## dependency
Jar | Description
--------|----------------
sqljdc.jar| sql server 
asm-3.1.jar | is an all purpose Java bytecode manipulation and analysis framework. It can be used to modify existing               classes or dynamically generate classes
jersey-client-1.0.3.jar |.adsad
jersey-core-1.0.3.jar   |asdas
jersey-server-1.0.3.jar |dasd
jsr311-api-1.0.jar      |dasdas
gson-2.2.2.jar          |dasda




