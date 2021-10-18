<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>

<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

First name:<form:input path="firstName"/>

<br></br>

Last name:<form:input path="lastName"/>

<br></br>

Country:<form:select path="country">

<form:options items="${student.countries}"/>

<!--<form:option value="India" label="India"/>
<form:option value="Spain" label="Spain"/>
<form:option value="Germany" label="Germany"/>
<form:option value="Australia" label="Australia"/>
<form:option value="Portugal" label="Portugal"/>
<form:option value="Brazil" label="Brazil"/>-->

</form:select>

<br></br>

Native Country:<form:select path="nativeCountry">

<form:options items="${theCountryOptions}"/>

</form:select>

<br></br>

Favorite Language:
Java<form:radiobutton path="favoriteLanguage" value="Java"/>
Kotlin<form:radiobutton path="favoriteLanguage" value="Kotlin"/>
PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>

<br></br>

Secondary Skill:<form:radiobuttons path="secondarySkill" items="${student.secondarySkills}"/>

<br></br>

Operating Systems:
Linux <form:checkbox path="operatingSystems" value="Linux"/>
Mac <form:checkbox path="operatingSystems" value="Mac"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>

<br></br>

<input type="submit" value="Submit"/>

</form:form>


</body>
</html>