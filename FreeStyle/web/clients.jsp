<%--
  Created by IntelliJ IDEA.
  User: yurs1
  Date: 13.06.2015
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>World Template, Clients - CSS Templates</title>
  <meta name="keywords" content="css templates, clients, free templates, world template" />
  <meta name="description" content="World Template, Clients Page - free CSS templates from templatemo.com" />
  <link href="templatemo_style.css" rel="stylesheet" type="text/css" />

  <!--////// CHOOSE ONE OF THE 3 PIROBOX STYLES  \\\\\\\-->
  <link href="css_pirobox/white/style.css" media="screen" title="shadow" rel="stylesheet" type="text/css" />
  <!--<link href="css_pirobox/white/style.css" media="screen" title="white" rel="stylesheet" type="text/css" />
  <link href="css_pirobox/black/style.css" media="screen" title="black" rel="stylesheet" type="text/css" />-->
  <!--////// END  \\\\\\\-->

  <!--////// INCLUDE THE JS AND PIROBOX OPTION IN YOUR HEADER  \\\\\\\-->
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/piroBox.1_2.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $().piroBox({
        my_speed: 600, //animation speed
        bg_alpha: 0.5, //background opacity
        radius: 4, //caption rounded corner
        scrollImage : false, // true == image follows the page, false == image remains in the same open position
        pirobox_next : 'piro_next', // Nav buttons -> piro_next == inside piroBox , piro_next_out == outside piroBox
        pirobox_prev : 'piro_prev',// Nav buttons -> piro_prev == inside piroBox , piro_prev_out == outside piroBox
        close_all : '.piro_close',// add class .piro_overlay(with comma)if you want overlay click close piroBox
        slideShow : 'slideshow', // just delete slideshow between '' if you don't want it.
        slideSpeed : 4 //slideshow duration in seconds(3 to 6 Recommended)
      });
    });
  </script>
  <!--////// END  \\\\\\\-->

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
          <li><a href="/getMonServ" class="current">Управління базою</a></li>
          <li><a href="/users_table" >Всі клієнти</a></li>
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

      <h1>Управління базою</h1>
      <div id="gallery">
        <ul>

          <li>
            <p>Дата останнього зняття коштів ${data}, база оновлена до ${base}</p>

          </li>
          </ul>

        <div class="cleaner"></div>
        <ul>
          <li>
        <form action="/delUser" method="post">
          Для видалення клієнта введіть його обліковий запис та натисніть кнопку
          <br><input type="text" name="iddel">
          <input type="submit" value="Видалити">
          <h7>${error}</h7></br>


        </form>
          </li>
        </ul>
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
