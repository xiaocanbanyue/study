<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
   <head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>我的电脑</title>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/uudisk.js"></script>
    <link href="css/global.css" rel="stylesheet" />
    <link href="css/uudisk.css" rel="stylesheet" />
  </head>
  
  <body>
  <p id="back-to-top"><a href="#top" ><span></span>回到顶部</a></p>
  <div class="global_nav">
   	<div class="nav_title" ><a href="#" >首页</a></div>
   </div>
   <div class="head_main">
   	<div class="divlogo"><a href="#"></a></div>
    <ul class="nav_main">
    	<li class="disk_nav_select"><a href="#" id="toMyComputer">我的电脑</a></li>
        <li class="disk_nav_share"><a href="#" id="toMyShare">我的分享</a></li>
        <li class="disk_nav_search">
        	<input type="text" id="serarch_key"/>
            <input type="submit" id="search_btn"  value=""/>
        </li>
        <li id="disk_nav_arrow"></li>
    </ul>
   </div>
   <div class="disk_all">
   		<div id="disk_topline"></div>
        <div id="disk_content">
        	<div id="disk_left">
            	<p id="disk_path">
                <a href="javascript:void(0);" class="location_show" id="to_root_nav">我的电脑</a>
                </p>
                <div id="content_menu">
                <a href="javascript:void(0);" id="menu_photo" class="menuleft"></a>
                <a href="javascript:void(0);" id="menu_word" class="menuleft"></a>
                <a href="javascript:void(0);" id="menu_music" class="menuleft"></a>
                <a href="javascript:void(0);" id="menu_movie" class="menuleft"></a>
                <a href="javascript:void(0);" id="menu_floder" class="menuleft"></a>
                <a href="javascript:void(0);" id="menu_other" class="menuleft"></a>
                <a href="javascript:void(0);" id="menu_list"></a>
                </div>
                <div id="showContent">
                	<a href="javascript:void(0);" id="get_root_a"><img src="images/workgroup-icon.png"  title="我的电脑" style="width:100px; height:100px;"/> </a>                
                </div>
            </div>
        </div>
        <div id="disk_bottomline"></div>
        
   </div>
  </body>
  
</html>
