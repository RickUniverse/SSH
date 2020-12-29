<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>

    <s:if test="#request.employees == null || #request.employees.size() <= 0">
        沒有任何員工信息
    </s:if>
    <s:else>
        <table cellpadding="10" border="1" cellspacing="0">
            <tr>
                <td>id</td>
                <td>lastName</td>
                <td>email</td>
                <td>birth</td>
                <td>createTime</td>
                <td>department</td>
            </tr>
            <tr>
                <td>id</td>
                <td>lastName</td>
                <td>email</td>
                <td>birth</td>
                <td>createTime</td>
                <td>department</td>
                <td>Delete</td>
            </tr>
            <s:iterator value="#request.employees">
                <tr>${id}</tr>
                <tr>${lastName}</tr>
                <tr>${email}</tr>
                <tr>${birth}</tr>
                <tr>${createTime}</tr>
                <tr>${department.name}</tr>
                <tr><a href="employee-delete?id=${id}"></a></tr>
            </s:iterator>
        </table>
    </s:else>
</body>
</html>
