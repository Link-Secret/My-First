<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<html>
  <head> 
    <title>redirectForward.jsp</title>
  </head>
  <body>
    <form action="redirectForwardServlet" method="post">
    	<table>
    		<tr>
    			<td>�û�����</td>
    			<td><input type="text" name="user"/></td>
    		</tr>
    		<tr>
    			<td>��   �룺</td>
    			<td><input type="password" name="pwd"/></td>
    		</tr>
    		<tr>
    			<td><input type="submit" value="�ύ"/></td>
    			<td><input type="reset" value="����"/></td>
    		</tr>
    	</table>	
    </form>
  </body>
</html>
