<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet">

<style type="text/css" >

</style>
</head>
<body>


	<form action=<%=response.encodeUrl("srv2") %> method="post">

		<div class="center">
			<h2>Educational Qualifications</h2>
			<div class="divRow">
				<div class="lableClass" style="padding-bottom: 10px">Qualification</div>
				<div>
					<select  class="inputClass" name="quali" >
						<option value="">--select--</option>
						<option>Btech</option>
						<option>MBA</option>
						<option>MCA</option>
						<option>Msc</option>
						<option>BCA</option>
						<option>Mtech</option>
						<option>Bsc</option>
						
					</select>
				</div>
			</div>
			<div class="divRow">
				<div class="lableClass">Year</div>
				<div>
					<input type="date" class="inputClass" name="year" required="required"/>
				</div>
			</div>
			<div class="divRow">
				<div>University</div>
				<div>
					<input type="text" class="inputClass" name="univ" required="required"/>
				</div>
			</div>
			
			<div class="divRow">
				<div>
					<input type="submit" class="btnClass" value="continue" />
				</div>
			</div>




		</div>


	</form>

</body>
</html>