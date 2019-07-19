<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet">

<style type="text/css">
</style>

<script type="text/javascript">

	function validateForm3() {
		
		
		var skill = form3.skill.value;
		var loc = form3.loc.value;
		if(skill == ""){
			alert("please fill the value for skill");
			return false;
		}
		if(loc == ""){
			alert("please fill the value for loc");
			return false;
		}
		
		return true;
		
		
	}

	

</script>
</head>
<body>


	<form action=<%=response.encodeUrl("srv3") %> method="post" name="form3">

		<div class="center">
			<h2>Skills && Preferences</h2>
			<div class="divRow">
				<div class="lableClass" style="padding-bottom: 10px">SkillSet</div>
				<div>
					<select class="inputClass" name="skill">

						<option>JAVA</option>
						<option>FULLSTACK</option>
						<option>ANGULAR</option>
						<option>DEVOPS</option>
						<option>REACTJS</option>
						<option>IOS</option>
						<option>AZURE</option>

					</select>
				</div>
			</div>
			<div class="divRow">
				<div class="lableClass">Exp</div>
				<div>
					<input type="number" class="inputClass" name="exp" required="required"/>
				</div>
			</div>
			<div class="divRow">
				<div>Sal</div>
				<div>
					<input type="text" class="inputClass" name="sal" required="required"/>
				</div>
			</div>
			<div class="divRow">
				<div>Location</div>
				<div>
					<select class="inputClass" name="loc">
						<option value="">--select--</option>
						<option>Bangalore</option>
						<option>Hyd</option>
						<option>Pune</option>
						<option>Chenni</option>
						

					</select>
				</div>
			</div>

			<div class="divRow">
				<div>
					<input type="submit" class="btnClass" value="register" onclick="return validateForm3()"/>
				</div>
			</div>




		</div>


	</form>

</body>
</html>