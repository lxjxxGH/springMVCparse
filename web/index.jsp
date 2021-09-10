<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020\11\13 0013
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-2.2.2.js"></script>
<script type="text/javascript">
  $(document).ready(function() {
    $("#json").click(function() {
      $.ajax({//ajax请求
        type : 'post',//请求方法
        url : 'test_json',//请求路径
        contentType : 'application/json;charset=utf-8',//指定传送json格式数据，并指定编码
        data : '{"sid":"1","name":"老白","sex":"女"}',//json格式数据
        success : function(data) {//回调函数
          alert(data.name);
        }
      });
    });
  });
</script>

<script type="text/javascript">
  function testJSON() {
    $.ajax({
      type: "POST",
      url: "/testJson",
      contentType: "application/json",
      dataType: "json",
      data: JSON.stringify({"name":"张三"}),
      success: function (jsonResult) {
        alert(jsonResult);
      }
    });
  }
</script>

<html>
  <head>
    <title><h1>解析springMVC报文json数据格式demo</h1></title>
  </head>

  <input type="button" value="测试JSON数据" onclick="testJSON()" />
  <body>
  $END$
  </body>
</html>
