<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<html>
  <head> 
    <title>inputLader.jsp</title>
  </head>
  <body>
    <h2>������εĳ��Ϳ��ύ��servlet��post��ʽ�������:</h2>
    <form action="getLengthOrAreaServlet" method="post">
    	����<input type="text" name="length"/><br/>
    	��<input type="text" name="width"/><br/>
    	<input type="submit" value="�ύ"/>
    </form>
     <br/>
    <h2>������εĳ��Ϳ��ύ��servlet��get��ʽ�����ܳ�:</h2>
    <form action="getLengthOrAreaServlet" method="get">
    	����<input type="text" name="length"/><br/>
    	��<input type="text" name="width"/><br/>
    	<input type="submit" value="�ύ"/>
    </form>
  </body>
</html>
