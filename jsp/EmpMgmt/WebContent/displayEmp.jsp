  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>

<script type="text/javascript">
	
	
$(document).ready( function() {
    $('#deleteMsg').delay(5000).fadeOut();
  });
</script>

<%@page import="java.util.List,com.pragim.empmgmt.model.Employee" %>


<%

	String msg = (String)request.getAttribute("message");
	if(msg!=null){	
%>
	<span id="deleteMsg"><font color='red'><%=msg%></font></span>
	<%} %>



<form action="empsrv">

	<div>

	<div>
		<span>EmpName</span>
		<div><input type="text" name="empname"/></div>
	</div>
	<div>
		<span>Sal</span>
		<div><input type="number" name="sal"/></div>
	</div>
	<div>
		<span>DOJ</span>
		<div><input type="date" name="doj"/></div>
	</div>
	<div>
		<div><input type="submit" name="action" value="store"/></div>
	</div>


</div>

</form>
	
<table class="table table-hover">
<%

	
	List<Employee> list = (List<Employee>)request.getAttribute("elist");

	if(list!=null)
	for(Employee emp:list){
		
	%>
	
	<tr>
		<td><input type="checkbox"/></td>
		<td><%=emp.getEmpId() %></td>
		<td><%=emp.getEmpName() %></td>
		<td><%=emp.getSal() %></td>
		<td><%=emp.getHireDate() %></td>
		<td><a href="empsrv?empid=<%=emp.getEmpId() %>" class="glyphicon glyphicon-edit"></a></td>
		<td><a href="empsrv?empid=<%=emp.getEmpId() %>&action=delete"  class="glyphicon glyphicon-trash"></a></td>
	</tr>
	
<%} %>
</table>