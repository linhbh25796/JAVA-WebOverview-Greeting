<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/7/2019
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
  .login {
    height: 200px;
    width: 260px;
    margin: 0;
    padding: 10px;
    border: 1px #CCC solid;
  }

  .login input{
    padding: 5px;
    margin: 5px;
  }
</style>
  <head>
    <title>Log in</title>
  </head>
  <body>
  <form method="get" action="/login">
  <div class="login">
    <h2>Login</h2>
    <input type="text" name="username" size="30" placeholder="username">
    <input type="password" name="password" size="30" placeholder="password">
    <input type="submit" value="Sign in" >
  </div>
  </form>
  </body>
</html>
