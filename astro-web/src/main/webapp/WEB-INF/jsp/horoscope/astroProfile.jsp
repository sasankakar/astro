<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Astrology | Horoscope</title>
	</head>
	<body>
		<h1>ANURADHA ASTRO RESEARCH</h1>
	
		<div>Serial No : <c:out value="${horoscopeProfile.serialNo}" /></div>
		<div>Prepared Date : <c:out value="${horoscopeProfile.preparedDate}" /></div>
		
		<form:form method="post" modelAttribute="horoscopeProfile" action="/astro/horoscopeprofile/create">
			<table width="863" border="1" cellspacing="5" cellpadding="5">
				<caption>Graha positions in janma kundali</caption>
				<tr>
					<th colspan="2" scope="col">RASHI</th>
					<th colspan="9" scope="col">GRAHA</th>
				</tr>
				<tr>
					<td width="73"><div align="right">POSITION</div></td>
					<td width="52"><div align="center">RASHI</div></td>
					<td width="54">BUDHA</td>
					<td width="53">SUKRA</td>
					<td width="79">MANGALA</td>
					<td width="96">BRUHASPATI</td>
					<td width="56">SANI</td>
					<td width="27">RAVI</td>
					<td width="34">CHANDRA</td>
					<td width="50">RAHU</td>
					<td width="95">KETU</td>
				</tr>
				<tr>
					<%-- <form:checkboxes element="td" path="rashiChakra.rashiDetails[0].grahasInThisRashi" items="${horoscopeProfile.rashiChakra.rashiDetails[0].grahasInThisRashi}"></form:checkboxes> --%>
					<c:forEach var="rashi" items="${horoscopeProfile.rashiChakra.rashiDetails}" varStatus="rashiStatus">
						<tr>
							<th><div align="center"><c:out value="${rashi.position}" /></div></th>
							<th><div align="center"><c:out value="${rashi.nameOriya}" /></div></th>
							<form:hidden path="rashiChakra.rashiDetails[${rashiStatus.index}].position"/>
							<form:hidden path="rashiChakra.rashiDetails[${rashiStatus.index}].nameOriya"/>
							<%-- <form:checkboxes element="td" path="rashiChakra.rashiDetails[${rashiStatus.index}].grahasInThisRashi" items="${rashi.grahasInThisRashi}" itemLabel="id" itemValue="nameOriya"/> --%>
							<%-- <form:checkboxes element="td" path="rashiChakra.rashiDetails" items="${rashi.grahasInThisRashi}"></form:checkboxes> --%>
							<c:forEach var="graha" items="${rashi.grahasInThisRashi}" varStatus="grahaStatus">
								
								<%-- <form:checkboxes element="td" path="rashiChakra.rashiDetails[${rashiStatus.index}].grahasInThisRashi" items="${rashi.grahasInThisRashi}"></form:checkboxes> --%>
								<%-- <td><form:checkbox path="rashiChakra.rashiDetails" value="${graha.nameOriya}" /></td>
								<td><form:checkbox path="rashiChakra.rashiDetails[${rashiStatus.index}].grahasInThisRashi[${grahaStatus.index}]" value="${graha.nameOriya}" /></td>
								
								<td><form:checkbox element="td" path="graha[${status.index}].isChecked"/></td> --%>
								<%-- <td><input id="${rashi.nameOriya}" name="${rashi.nameOriya}" type="checkbox" value="${graha.nameOriya}"/></td> --%>
								
								<%-- <td><form:checkbox element="td" path="rashiChakra.rashiDetails[${rashiStatus.index}].grahasInThisRashi[${grahaStatus.index}].nameOriya" value="${graha.nameOriya}" /> </td> --%>
								
								<td><input 
								id="rashiChakra.rashiDetails[${rashiStatus.index}].grahasInThisRashi[${grahaStatus.index}].nameOriya" 
								name="rashiChakra.rashiDetails[${rashiStatus.index}].grahasInThisRashi[${grahaStatus.index}].nameOriya" type="checkbox" 
								value="${graha.nameOriya}" /></td>
								<%-- <input id="${rashi.nameOriya}" name="rashiChakra.rashiDetails[${rashiStatus.index}].nameEnglish" type="hidden" value="${graha.nameOriya}"/> --%>
							</c:forEach>
							<%-- <form:checkboxes path="rashiChakra.rashiDetails" items="${rashi.grahasInThisRashi}" /> --%>
							<%-- <form:checkboxes element="td" path="rashiChakra.rashiDetails" items="${rashi.grahasInThisRashi}"></form:checkboxes> --%>
						</tr>
					</c:forEach>
				</tr>
			</table>
			<input type="submit">
		</form:form>
	</body>
</html>