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
    <title>
      电影详情
    </title>
    <link rel="stylesheet" href="lib/jquery.raty.css">
    <script src="lib/jquery-3.3.1.min.js"></script>
    <script src="lib/jquery.raty.js"></script>
  </head>
  <body>
    <link href="css/subject.css" rel="stylesheet" type="text/css">
    <div id="global-nav">
      <div class="top-nav-info">
        <ul>
          <li><a  rel="nofollow">注册</a></li>
          <li><a href="account" rel="nofollow">登录</a></li>
        </ul>
      </div>
      <div class="global-nav-items">
        <ul>
          <li><a class = "active" href = "/">MovieRec</a></li>
          <li><a href = "#more">更多</a></li>
        </ul>
      </div>
    </div>

    <div id="nav-movie" class="nav">
      <div class="nav-wrap">
        <div class="nav-primary">
          <div class="nav-logo">
            <img class="logo" src="./imgs/Google_Logo.png">
          </div>
          <div class="nav-search">
            <form action="/subject" method="get">
              <fieldset>
                <legend>搜索：</legend>
                <label for="inp-query">
                </label>
                <div class="inp"><input id="inp-query" name="id" size="22" maxlength="60" placeholder="输入电影ID" autocomplete="off"></div>
              </fieldset>
            </form>
          </div>
        </div>
      </div>
    </div>
    <div id="wrapper">
      <div id="content">
        <h1>
          <span id="title" property="v:itemreviewed"></span>
        </h1>
        <div class="grid-16-8 clearfix">
          <div class="article">
            <div class="indent clearfix">
              <div class="subjectwrap clearfix">
                <div class="subject clearfix">
                  <div id="mainpic" class>
                    <img  title="海报" alt="海报" rel="v:image">
                  </div>
                  <div id="info">
                    <span class="director">
                      <span class="pl">导演</span>
                      :
                      <span class="attrs"></span>
                    </span>
                    <br>
                    <span class="actor">
                      <span class="pl">主演</span>
                      :
                      <span class="attrs"></span>
                    </span>
                    <br>
                    <span class="pl">IMDb编号:</span>
                    <span class="imdb"></span>
                    <br>
                    <span class="pl">简介:</span>
                    <span class="summary"></span>
                  </div>
                </div>
                <div id="interest_sectl">
                  <div class="rating_wrap clearbox" rel:"v:rating">
                    <div class="clearfix">
                      <div class="rating_logo ll">
                        电影评分
                      </div>
                      <br>
                      <br>
                    </div>
                    <div class="rating_self clearfix" typeof="v:Rating">
                      <div class="rating_left">
                        <strong class="ll rating_num" property="v:average"></strong>
                        <span property="v:best" content="5.0"></span>
                      </div>
                      <div class="rating_right">
                        <div class="bigstar45"></div>
                        <div class="rating_sum">
                          <span class="count" property="v:votes"></span>
                          “人评价”
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              <div id="interest_sect_level" class="clearfix">
                <div class="ll">
                  评价：
                </div>
                <div id="rating"></div>
              </div>
            </div>
          </div>
          <div id="recommendations">
            <h2>
              <i>封面风格近似的电影还有</i>
              ......
            </h2>
            <div class="recommendations-bd">
              <dl id="rec1">
                <dt>
                  <img alt="近似电影1">
                </dt>
                <dd>
                    <a>近似电影1</a>
                </dd>
              </dl>
              <dl id="rec2">
                <dt>
                  <img alt="近似电影2">
                </dt>
                <dd>
                    <a>近似电影2</a>
                </dd>
              </dl>
              <dl id="rec3">
                <dt>
                  <img alt="近似电影3">
                </dt>
                <dd>
                    <a>近似电影3</a>
                </dd>
              </dl>
              <dl id="rec4">
                <dt>
                  <img alt="近似电影4">
                </dt>
                <dd>
                    <a>近似电影4</a>
                </dd>
              </dl>
              <dl id="rec5">
                <dt>
                  <img alt="近似电影5">
                </dt>
                <dd>
                    <a>近似电影5</a>
              </dl>
          </div>
        </div>
      </div>
    </div>
    </div>

    <script>
        $.fn.raty.defaults.path = './lib/images';
        var userName = "<%=session.getAttribute("user")%>";
        if(userName =="" || userName == undefined || userName == null || userName == "null")
        {}
        else
        {
            var modify= "<ul><li>" + "用户 " + userName +  " 已登录" + "</li><li><a href=\"/logOut\">注销</a></li></ul>";
            $(".top-nav-info").html(modify);
        }
        var movieID = "<%=request.getParameter("id")%>";
        var myMovie = new Object();
        $.ajax({
            type : "get",
            url : "/movie/findMoiveById",
            data : "id=" + movieID,
            success : function(data){
                var myMovie = data;
                $("#title").text(myMovie.movieName);
                $("#mainpic img").attr("src", myMovie.moviePicture);
                $(".director .attrs").text(myMovie.movieDirector);
                $(".actor .attrs").text(myMovie.movieActor);
                $(".imdb").text(myMovie.imdbid);
                $(".summary").text(myMovie.movieIntro);
                $(".rating_num").text(myMovie.score);
                $(".count").text(myMovie.scoreCount);

                $(function() {
                    $('.bigstar45').raty({
                        readOnly: true,
                        half: true,
                        score: myMovie.score});
                });
                $.get("/movie/findRecByImdbId","id=" + myMovie.imdbid, function(data){
                    var coverRec = data;
                    $.get("/movie/findMoiveByImdbId", "id=" + coverRec.first, function(data){
                        var Movie = data;
                        $("#rec1 dt img").attr("src", Movie.moviePicture);
                        $("#rec1 dd a").text(Movie.movieName);
                        $("#rec1 dd a").attr("href","/subject?id=" + Movie.movieid);
                    });
                    $.get("/movie/findMoiveByImdbId", "id=" + coverRec.second, function(data){
                        var Movie = data;
                        $("#rec2 dt img").attr("src", Movie.moviePicture);
                        $("#rec2 dd a").text(Movie.movieName);
                        $("#rec2 dd a").attr("href","/subject?id=" + Movie.movieid);
                    });
                    $.get("/movie/findMoiveByImdbId", "id=" + coverRec.third, function(data){
                        var Movie = data;
                        $("#rec3 dt img").attr("src", Movie.moviePicture);
                        $("#rec3 dd a").text(Movie.movieName);
                        $("#rec3 dd a").attr("href","/subject?id=" + Movie.movieid);
                    });
                    $.get("/movie/findMoiveByImdbId", "id=" + coverRec.forth, function(data){
                        var Movie = data;
                        $("#rec4 dt img").attr("src", Movie.moviePicture);
                        $("#rec4 dd a").text(Movie.movieName);
                        $("#rec4 dd a").attr("href","/subject?id=" + Movie.movieid);
                    });
                    $.get("/movie/findMoiveByImdbId", "id=" + coverRec.fifth, function(data){
                        var Movie = data;
                        $("#rec5 dt img").attr("src", Movie.moviePicture);
                        $("#rec5 dd a").text(Movie.movieName);
                        $("#rec5 dd a").attr("href","/subject?id=" + Movie.movieid);
                    });

                });
            }
        });

      $(function() {
        $('#rating').raty({
          half: true
        });
      });

    </script>
  </body>

</html>
