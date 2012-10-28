<html>
<body>
<table border="1">
		<tr>
			<td>first name</td>
			<td>last name</td>
		</tr>
	<g:each in="${people}" status="i" var="Person" >
		<tr>
			<td>${Person.firstName}</td>
			<td>${Person.lastName}</td>
		</tr>
	</g:each>
</table>

</body>
</html> 