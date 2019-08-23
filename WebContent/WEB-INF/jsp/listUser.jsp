<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div style="width:1000px;margin:0px auto;text-align:center">
    <table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>userName</td>
        <td>password</td>
        <td>realName</td>
        <td>useType</td>
        <td>docTitleID</td>
        <td>isScheduling</td>
        <td>deptID</td>
        <td>registLeID</td>
        <td>delMark</td>
       	<td>编辑</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.userName}</td>
            <td>${c.password}</td>
            <td>${c.realName}</td>
            <td>${c.useType}</td>
            <td>${c.docTitleID}</td>
            <td>${c.isScheduling}</td>
            <td>${c.deptID}</td>
            <td>${c.registLeID}</td>
            <td>${c.delMark}</td>  
           	<td><a href="editUser?id=${c.id}">编辑</a></td>
	        <td><a href="deleteUser?id=${c.id}">删除</a></td>
        </tr>
    </c:forEach>
	</table>
    <div style="text-align:center">
        <a href="?start=0">首  页</a>
        <a href="?start=${page.start-page.count}">上一页</a>
        <a href="?start=${page.start+page.count}">下一页</a>
        <a href="?start=${page.last}">末  页</a>
    </div>
    
   	<div style="text-align:center;margin-top:40px">
	
	<form method="post" action="addUser">
		user名称              ： 	<input name="userName" value="" type="text"> <br><br>
		Password名称       ： 	<input name="password" value="" type="text"> <br><br>
		realName名称       ： 	<input name="realName" value="" type="text"> <br><br>
		useType名称         ： 	<input name="useType" value="" type="text"> <br><br>
		docTitleID名称    ： 	<input name="docTitleID" value="" type="text"> <br><br>
		isScheduling名称： 	<input name="isScheduling" value="" type="text"> <br><br>
		deptID名称           ： 	<input name="deptID" value="" type="text"> <br><br>
		registLeID名称    ： 	<input name="registLeID" value="" type="text"> <br><br>
		delMark名称          ： 	<input name="delMark" value="" type="text"> <br><br>
		<input type="submit" value="增加user">
	</form>
	
	
	</div>	
 </div>
