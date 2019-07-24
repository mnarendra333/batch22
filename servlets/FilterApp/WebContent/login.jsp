
<h2>Login Here!!</h2>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>

<script type="text/javascript">
	
	
$(document).ready( function() {
    $('#msg').delay(5000).fadeOut();
  });
</script>

<%

	String msg = (String)request.getAttribute("message");
	if(msg!=null){
%>

	<h2 id="msg"><font color='red'><%=msg%></font></h2>
	
	<%} %>
<form action="loginsrv">

	<table>

	<tr>
		<td>Username</td>
		<td><input type="text" name="uname" required="required"/></td>
	</tr>
	
	<tr>
		<td>Password</td>
		<td><input type="password" name="pwd" required="required"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="login"/></td>
	</tr>

</table>
</form>