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
        MovieRec
    </title>
    <script src="lib/jquery-3.3.1.min.js"></script>
</head>
<body>
<link href="css/index.css" rel="stylesheet" type="text/css">
<div id="global-nav">
    <div class="top-nav-info">
        <ul>
            <li><a rel="nofollow">注册</a></li>
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
                <form action="/subject">
                    <fieldset>
                        <legend>搜索：</legend>
                        <label for="inp-query">
                        </label>
                        <div class="inp"><input id="inp-query" name="id" size="22" maxlength="60" placeholder="输入电影ID" value autocomplete="off"></div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>

<div id="wrapper">
    <div id="content">
        <div class="grid-16-8 clearfix">
            <div class="article">
                <div id="recommendations" class="tops">
                    <h2>
                        <i>电影热度Top5</i>
                        ......
                    </h2>
                    <div class="recommendations-bd">
                        <dl id="top1">
                            <dt>
                                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BNWIwODRlZTUtY2U3ZS00Yzg1LWJhNzYtMmZiYmEyNmU1NjMzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY268_CR1,0,182,268_AL_.jpg">
                            </dt>
                            <dd>
                                <a href="/subject?id=356">Forrest Gump (1994)</a>
                            </dd>
                        </dl>
                        <dl id="top2">
                            <dt>
                                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX182_CR0,0,182,268_AL_.jpg">
                            </dt>
                            <dd>
                                <a href="/subject?id=318">Shawshank Redemption, The (1994)</a>
                            </dd>
                        </dl>
                        <dl id="top3">
                            <dt>
                                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BMTkxMTA5OTAzMl5BMl5BanBnXkFtZTgwNjA5MDc3NjE@._V1_UX182_CR0,0,182,268_AL_.jpg">
                            </dt>
                            <dd>
                                <a href="/subject?id=296">Pulp Fiction (1994)</a>
                            </dd>
                        </dl>
                        <dl id="top4">
                            <dt>
                                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BNjNhZTk0ZmEtNjJhMi00YzFlLWE1MmEtYzM1M2ZmMGMwMTU4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg">
                            </dt>
                            <dd>
                                <a href="/subject?id=593">Silence of the Lambs, The (1991)</a>
                            </dd>
                        </dl>
                        <dl id="top5">
                            <dt>
                                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg">
                            </dt>
                            <dd>
                                <a href="/subject?id=2571">Matrix, The (1999)</a>
                            </dd>
                        </dl>
                    </div>
                </div>
                <div id="recommendations">
                    <h2>
                        <i>您可能感兴趣的......</i>
                    </h2>
                    <div class="recommendations-bd personal" hidden="hidden">
                        <dl id="rec1">
                            <dt>
                                <img >
                            </dt>
                            <dd>
                                <a></a>
                            </dd>
                        </dl>
                        <dl id="rec2">
                            <dt>
                                <img >
                            </dt>
                            <dd>
                                <a></a>
                            </dd>
                        </dl>
                        <dl id="rec3">
                            <dt>
                                <img >
                            </dt>
                            <dd>
                                <a></a>
                            </dd>
                        </dl>
                        <dl id="rec4">
                            <dt>
                                <img >
                            </dt>
                            <dd>
                                <a></a>
                            </dd>
                        </dl>
                        <dl id="rec5">
                            <dt>
                                <img >
                            </dt>
                            <dd>
                                <a></a>
                        </dl>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    var userName="<%=session.getAttribute("user")%>";
    if(userName =="" || userName == undefined || userName == null || userName == "null")
    {}
    else
    {
        var modify= "<ul><li>" + "用户 " + userName +  " 已登录" + "</li><li><a href=\"/logOut\">注销</a></li></ul>";
        $(".top-nav-info").html(modify);
        var myRec = new Object();
        $.ajax({
            type : "get",
            url : "/movie/recMovie",
            data : "userID=" + userName,
            async : false,
            success : function(data){
                myRec = data;
            }
        });

        $.get("/movie/findMoiveById", "id=" + myRec.movieid1, function(data){
            var Movie = data;
            $("#rec1 dt img").attr("src", Movie.moviePicture);
            $("#rec1 dd a").text(Movie.movieName);
            $("#rec1 dd a").attr("href","/subject?id=" + Movie.movieid);
        });
        $.get("/movie/findMoiveById", "id=" + myRec.movieid2, function(data){
            var Movie = data;
            $("#rec2 dt img").attr("src", Movie.moviePicture);
            $("#rec2 dd a").text(Movie.movieName);
            $("#rec2 dd a").attr("href","/subject?id=" + Movie.movieid);
        });
        $.get("/movie/findMoiveById", "id=" + myRec.movieid3, function(data){
            var Movie = data;
            $("#rec3 dt img").attr("src", Movie.moviePicture);
            $("#rec3 dd a").text(Movie.movieName);
            $("#rec3 dd a").attr("href","/subject?id=" + Movie.movieid);
        });
        $.get("/movie/findMoiveById", "id=" + myRec.movieid4, function(data){
            var Movie = data;
            $("#rec4 dt img").attr("src", Movie.moviePicture);
            $("#rec4 dd a").text(Movie.movieName);
            $("#rec4 dd a").attr("href","/subject?id=" + Movie.movieid);
        });
        $.get("/movie/findMoiveById", "id=" + myRec.movieid5, function(data){
            var Movie = data;
            $("#rec5 dt img").attr("src", Movie.moviePicture);
            $("#rec5 dd a").text(Movie.movieName);
            $("#rec5 dd a").attr("href","/subject?id=" + Movie.movieid);
        });
        $(".personal").removeAttr("hidden");

    }
</script>
</body>
</html>
