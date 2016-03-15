<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Collection Validator Sample</title>
    <style type="text/css">
        .strike {
            text-decoration: line-through;
        }
    </style>
</head>
<body>
<h1>Collection Validator Sample</h1>
<div id="form">
    <form:form
            action="${pageContext.request.contextPath}/"
            method="post" modelAttribute="collectionForm">
        <form:errors path="*"/>
        <ol>
            <li>
                <form:input path="list[0].name"/>
            </li>
            <li>
                <form:input path="list[1].name"/>
            </li>
            <li>
                <form:input path="list[2].name"/>
            </li>
        </ol>
        <form:button>submit</form:button>
    </form:form>
</div>
</body>
</html>
