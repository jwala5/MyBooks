<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book collection</title>

</head>
<body>
<div><h2>Books For You To Master English</h2></div>
<div class= "img">
<script>
var index = 1;
var tempImg = new Image();
tempImg.onload = function(){
   appendImage();
}
var tryLoadImage = function( index ){
   tempImg.src = './assets/img/image ' + index + '.jfif';
}
var appendImage = function(){
   var img = document.createElement('img');
   img.src = tempImg.src;
   document.body.appendChild( img )
   tryLoadImage( index++ )
}
tryLoadImage( index );
</script>
</div>
</body>
</html>