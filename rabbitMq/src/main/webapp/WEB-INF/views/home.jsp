<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<script src='http://code.jquery.com/jquery-1.9.1.min.js'></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<script type="text/javascript">
	$(document).ready(function() {
		console.log('test');
		
		$('#pop').click(function(){
			$.getJSON('pop', function(json) {
				var data = json.data;
				$('#display').html('<h1>'+data+'</h1>');
				
			});
		});
		$('#push').click(function(){
			 var params = {
					 '_method' : 'PUT',
					 data: $('#pushString').val()
					};
			 
			 $.ajax({
				type : "POST",
				url : "",
				data : params,
				dataType : "json",
				success : function(json){
				},
				complete : function(){
					 console.log('success');
				}
				});	
			
		});
	});
	</script>
	<title>Test</title>
</head>
<body>
<h1>
	Rabbit!  
</h1>
<input type="text" id="pushString" value="">
<input type="button" id="push" value="push">
<input type="button" id="pop" value="pop">
<div id="display"></div>

</body>
</html>
