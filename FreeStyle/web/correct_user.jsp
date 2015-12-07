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
          <li><a href="corporate.jsp" class="current">Допомога клієнту</a></li>
          <li><a href="/getMonServ">Управління базою</a></li>
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
      <form action="/correct" method="get" style="margin-bottom: 0em;  ">

      <h1>Клієнт id = ${users.id} </h1>
      <br>Обліковий рахунок: ${users.id} </br>
      <br>
        Ваше ім'я та прізвище:
        <input type="text" value="${users.nameofuser}" name="c_name" style="background: transparent; border: 0px; color: #12758e;"/>
      </br>

      <br>Ваш логін:
        <input type="text" value="${users.username}" name="c_username" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e "/>
        </br>

      <br>Номер телефону:
        <input type="text" value="${users.phone}" maxlength="12" name="c_phone" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e "/>
      </br>

      <br>Кількість грошей на рахунку:
        <input type="text" value="${monofus.credit}" name="c_credit" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e ; width: 5%  "/>грн
      </br>

      <br>Інтернет тариф:
        <input type="text" value="${users.tariff}" name="c_tariff" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e; width: 5% "/>грн/день</br>

      <br>Ваша адреса:
        <input type="text" value="${users.addres}" name="c_addres" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e "/>
        </br>

      <br>Активність :
        <input type="text" value="${users.online}" name="c_online"  style="background: transparent; border: 0px; color: #12758e; border-color: #12758e "/>
        </br>

      <br>IP адреса:
        <input type="text" value="${users.ipaddres}" name="c_ip" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e "/>
        </br>

      <br>Дата останнього поповнення:
        <input type="text" value="${monofus.daterenewal}" name="c_data_ren" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e "/>
        </br>

      <p>Останнє поповнення на :
        <input type="text" value="${monofus.newrenewal}" name="c_newren" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e; width: 5%"/>грн </p>

      <br>Робота з лінією користувача :
        <input type="text" value="${problem.problem}" name="c_problem" style="background: transparent; border: 0px; color: #12758e; border-color: #12758e "/>
        </br>


        <br>
        <button href="#win12" type="submit" style="width: 50%;overflow: auto;margin: auto;" value="${users.id}" name="id">Зберегти</button>
        <a href="#x" class="overlay" id="win12"></a>

        <div class="popup" title="повідомлення">
          Відсутнє зєднання з базою даних!
          <a class="close"title="Закрыть" href="#close"></a>
        </div>

        </br>
      </form>
    </div> <!-- end of templatemo_content -->

    <div class="cleaner"></div>
  </div> <!-- end of templatemo_main -->

  <div id="templatemo_footer">

    Copyright © 2048 <a href="#">Your Company Name</a> |
    Designed by <a href="https://vk.com/yurs_abdulayev" target="_parent">Yurik</a> |
    Validate <a href="https://vk.com/yurs_abdulayev">XHTML</a> &amp;
    <a href="https://vk.com/yurs_abdulayev">CSS</a>

  </div> <!-- end of templatemo_footer -->

  <div class="cleaner"></div>
</div> <!-- end of templatemo_wrapper -->

</body>
</html>
