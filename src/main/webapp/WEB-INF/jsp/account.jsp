<%
  String path=request.getContextPath();
  String basePath=request.getScheme()+"://"+request.getServerName()+":"
          +request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>登录MovieRec</title>
    <style type="text/css">
      /* Reset */
      body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,form,fieldset,input,textarea,p,blockquote,th,td { margin:0; padding:0; }
      table { border-collapse:collapse; border-spacing:0; }
      fieldset,img { border:0; }
      address,caption,cite,code,dfn,em,strong,th,var { font-style:normal; font-weight:normal; }
      ol,ul { list-style:none; }
      caption,th { text-align:left; }
      h1,h2,h3,h4,h5,h6 { font-size:100%; font-weight:normal; }
      q:before,q:after { content:''; }
      abbr,acronym { border:0; }

      /* Font,  Link & Container */
      body { font:12px/1.6 arial,helvetica,sans-serif; }
      a:link { color:#369;text-decoration:none; }
      a:visited { color:#669;text-decoration:none; }
      a:hover { color:#fff;text-decoration:none;background:#039; }
      a:active { color:#fff;text-decoration:none;background:#f93; }
      button { cursor:pointer;line-height:1.2; }
      .mod { width:100%; }
      .hd:after, .bd:after, .ft:after, .mod:after {content:'\0020';display:block;clear:both;height:0; }
      .error-tip { margin-left:10px; }
      .error-tip, .error { color:#fe2617; }

      /* Layout */
      .wrapper { width:950px;margin:0 auto; }
      #header { padding-top:30px; }
      #content { min-height:400px;*height:400px; }
      #header, #content { margin-bottom:40px; }
      #header, #content, #footer { width:100%;overflow:hidden; }
      .article { float:left;width:590px; }

      /* header */
      .logo { float:left; width:200px;  height:30px; overflow:hidden; line-height:10em; }
      a.logo:link,
      a.logo:visited,
      a.logo:hover,
      a.logo:active { background:transparent url("imgs/logo.png") }
      h1 { color:#494949;display:block;font-size:25px;font-weight:bold;line-height:1.1;margin:0;padding:0 0 30px;word-wrap:break-word; }

      /* form */
      .item { clear:both;margin:0 0 15px;zoom:1; }
      label {  float:left; margin-right: 15px; text-align: right; width: 60px; font-size: 14px; line-height: 30px; vertical-align: baseline }
      .item-captcha input,
      .basic-input { width: 200px; padding: 5px; height: 24px; font-size: 14px;vertical-align:middle; -moz-border-radius: 3px; -webkit-border-radius: 3px; border-radius: 3px; border: 1px solid #c9c9c9 }
      .basic-input.small {width:100px;}
      .item-captcha input:focus,
      .basic-input:focus { border: 1px solid #a9a9a9 }
      .item-captcha input { width:100px; }
      .item-captcha .pl { color:#666; }
      .btn-submit { cursor: pointer;color: #ffffff;background: #3fa156; border: 1px solid #528641; font-size: 14px; font-weight: bold; padding:6px 26px; border-radius: 3px; -moz-border-radius: 3px; -webkit-border-radius: 3px; *width: 100px;*height:30px; }
      .btn-submit:hover { background-color:#4fca6c;border-color:#6aad54; }
      .btn-submit:active { background-color:#3fa156;border-color:#528641; }
      #item-error { padding-left:75px; }
      .item-captcha img { max-width:70%; }
      body { -webkit-text-size-adjust: none;-webkit-touch-callout: none;-webkit-tap-highlight-color: transparent; }
      /* sms login */
      .item.extra{float:left;}
      #post-code-button {float:none;padding-left:200px;width:87px;text-align:right;margin:5px 0;}
      #post-code {float:left;width:200px;}
    </style>
    <script src="./lib/jquery-3.3.1.min.js"></script>
  </head>
  <body>
    <div class="wrapper">
      <div id="header">
        <a href class="logo">登录MovieRec</a>
      </div>
      <div id="content">
        <h1>登录MovieRec</h1>
        <div class="article">
          <form id="lzform" name="lzform" method="post" action="/login">
            <div class="item">
              <label>帐号</label>
              <input id="email" name="username" type="text" class="basic-input" maxlength="60" placeholder="用户名"
              tabindex="1" style="color: rgb(204,204,204);">
            </div>
            <div class="item">
              <label>密码</label>
              <input id="password" name="password" type="password" class="basic-input" maxlength="20" tabindex="2">
            </div>
            <div class="item">
              <label>&nbsp;</label>
              <input type="submit" value="登录" name="login" class="btn-submit" tabindex="5">
            </div>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
