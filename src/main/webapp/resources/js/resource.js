$(document).ready(function(){
	 $("#save-link").click(function(e){
		 e.preventDefault(); //告诉浏览器不进行该事件的默认操作，这里的默认行为就是访问链接地址
		 alert("you click me!");
		 alert($("form").serialize());
		 $.post("/resource/request",$("form").serialize(),function(data){
			 alert(data);
		 })
	 })
})