<%--
  Created by IntelliJ IDEA.
  User: yurs1
  Date: 13.06.2015
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>World Template, Corporate - CSS Templates</title>
  <meta name="keywords" content="css templates, corporate page, free templates, world template" />
  <meta name="description" content="World Template, Corporate Page - free CSS templates from templatemo.com" />
  <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
  <link href="box_style.css" rel="stylesheet" type="text/css" />
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
          <li><a href="index.jsp" >Головна</a></li>
          <li><a href="/getTarPlan">Тарифні плани</a></li>
          <li><a href="corporate.jsp" class="current">Допомога клієнту</a></li>
          <li><a href="/getMonServ">Управління базою</a></li>
          <li><a href="/users_table" >Всі клієнти</a></li>
        </ul>
      </div> <!-- end of templatemo_menu -->

      <div class="sidebar_box">

        <h3>Відділ новин для адмінів</h3>

        <div class="news_box">
          <a href="index.jsp" target="_parent"><img src="images/chasyi-nastennyie-futbolnyiy-myach.jpg" alt="image 1" /></a>
          <p><a href="#">Робочий день буде зменшено на одну годину</a></p>

          <div class="cleaner"></div>
        </div>

        <div class="news_box">
          <a href="index.jsp" target="_parent"><img src="images/table.jpg" alt="image 2" /></a>
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

    <h1>Допомога клієнту</h1>

    <div id="templatemo_content">
      <br>
      <form action="/thisClient" method="post" style="margin-bottom: 0em; ">
      <a><input type="text" name="idcount" >
        <input type="submit" value="Пошук клієнта"  >

        <%--<img src="images/table.jpg" alt="1"></a>--%>
      <%--<a href="index.jsp"><img src="images/table.jpg" alt="1"></a>--%>
      </form>
      </br>
     <td>

      <br><form action="addNewUser" method="get" style="margin-bottom: 0em;">
      <input type="submit" value="Новий користувач">

      </form></br>
     </td>
    </div> <!-- end of templatemo_content -->

    <a href="#win1" >Открыть окно 1</a>     <%--button--%>


    <a href="#x" class="overlay" id="win1"></a>
    <div class="popup" title="повідомлення">
      Відсутнє зєднання з базою даних!
      <a class="close"title="Закрыть" href="#close"></a>
    </div>

    <select name="text">
      <option>select</option>
      <option value="key" >no</option>
      <option value="key" >yes</option>
    </select>






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
