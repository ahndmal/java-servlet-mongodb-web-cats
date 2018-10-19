<%@ page import="java.util.List" %>
<%@ include file="/common/header.jspf" %>
<%@ include file="/common/navigation.jspf" %>

<body>
<div class="all_cats_body">

    <h3>See all cats</h3>

    <table class="table table-striped">
        <thead>
        <th>Name</th>
        <th>Age</th>
        <th>Color</th>
        </thead>
        <tbody>
        <c:forEach items="${cats}" var="cat">
            <tr>
                <td>${cat.name}</td>
                <td>${cat.age}</td>
                <td>${cat.color}</td>
                <td><img src="${pageContext.request.contextPath}${cat.imagePath}" alt="Cat" width="100" height="68"></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>

<%@ include file="/common/footer.jspf" %>