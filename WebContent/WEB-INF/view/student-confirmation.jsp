<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>

<html>
<head>
<title>Student Confirmation Form</title>
</head>
<body>

The student is confirmed! ${student.firstName } ${student.lastName }

<br></br>

Country:${student.country }

<br></br>

Native country:${student.nativeCountry}

<br></br>

Favorite Language:${student.favoriteLanguage }

<br></br>

Secondary Skill: ${student.secondarySkill }

</body>
</html>