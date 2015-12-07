<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>World Template, Contact Page - CSS Templates</title>
  <meta name="keywords" content="css templates, contact page, free templates, world template" />
  <meta name="description" content="World Template, Contact Page - free CSS templates from templatemo.com" />
  <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div id="templatemo_wrapper">

  <div id="templatemo_header">
    <div id="site_title">
      <%--<a href="index.html"><img src="images/templatemo_logo.png" alt="World Template" /><span>free css templates</span></a>--%>
    </div> <!-- end of site_title -->
  </div> <!-- end of templatemo_header -->

  <div id="templatemo_main">

    <div id="templatemo_sidebar">

      <div id="templatemo_menu">
        <ul>
          <li><a href="start_page.jsp" >Головна</a></li>
          <li><a href="/getTarPlan">Тарифні плани</a></li>
          <li><a href="corporate.jsp">Допомога клієнту</a></li>
          <li><a href="/getMonServ">Управління базою</a></li>
          <li><a href="/users_table" class="current">Всі клієнти</a></li>
        </ul>
      </div> <!-- end of templatemo_menu -->
      
      <div class="sidebar_box">

        <h3>Відділ новин для адмінів</h3>

        <div class="news_box">
          <a href="start_page.jsp" target="_parent"><img src="images/chasyi-nastennyie-futbolnyiy-myach.jpg" alt="image 1" /></a>
          <p><a href="#">Робочий день буде зменшено на одну годину</a></p>

          <div class="cleaner"></div>
        </div>

        <div class="news_box">
          <a href="start_page.jsp" target="_parent"><img src="images/table.jpg" alt="image 2" /></a>
          <p><a href="#">Відбудеться нарада головних адміністраторів</a></p>

          <div class="cleaner"></div>
        </div>

        <div class="news_box">
          <a href="https://vk.com/yurs_abdulayev" target="_parent"><img src="images/avtor.jpg" alt="image 3" /></a>
          <p><a href="#">Головний розробник Абдулаєв Ю.Ю.</a></p>

          <div class="cleaner"></div>
        </div>

      </div>

    </div> <!-- end of templatemo_sidebar -->

    <div id="templatemo_content">

      <h1>Список клієнтів</h1>

      <table border="1">
        <tr>
          <th>№</th>
          <th>id</th>
          <th>login</th>
          <th>Ім'я користувача</th>
          <th>телефон</th>
          <th>активний</th>
          <th>ip</th>

        </tr>

        <c:forEach items="${usersList}" var="user" varStatus="status">
          <tr>
            <td>${status.count}</td>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.nameofuser}</td>
            <td>${user.phone}</td>
            <td>${user.online}</td>
            <td>${user.ipaddres}</td>

          </tr>
        </c:forEach>
      </table>

      </div>


    </div> <!-- end of templatemo_content -->

    <div class="cleaner"></div>
  </div> <!-- end of templatemo_main -->

  <div id="templatemo_footer">

    Copyright © 2048 <a href="#">Your Company Name</a> |
    Designed by <a href="http://www.templatemo.com" target="_parent">Free CSS Templates</a> |
    Validate <a href="http://validator.w3.org/check?uri=referer">XHTML</a> &amp;
    <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a>

  </div> <!-- end of templatemo_footer -->

  <div class="cleaner"></div>
</div> <!-- end of templatemo_wrapper -->

</body>
</html>
