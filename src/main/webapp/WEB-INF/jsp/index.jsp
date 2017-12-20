<%--
  Created by IntelliJ IDEA.
  User: xzh
  Date: 2017/12/19
  Time: 下午3:15
  To change this template use File | Settings | File Templates.
--%>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"
            +request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link type="text/css" rel="styleSheet"  href="css/css.css" />

<html>
<head>
    <title>aaaaa</title>
</head>
<body>
     <a href="" class="a">Hello index~~~xuzhaohui</a>
     <%=basePath%>
</body>
</html>
