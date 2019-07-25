  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


<%@page import="java.util.List,com.pragim.empmgmt.model.Employee" %>


<table class="table table-hover">
<%


	List<Employee> list = (List<Employee>)request.getAttribute("elist");


	for(Employee emp:list){
		
	%>
	
	<tr>
		<td><input type="checkbox"/></td>
		<td><%=emp.getEmpId() %></td>
		<td><%=emp.getEmpName() %></td>
		<td><%=emp.getSal() %></td>
		<td><%=emp.getHireDate() %></td>
	</tr>
	
<%} %>
</table>