<%@ page import="java.util.List" %>
<%@ include file="/common/header.jspf"%>
<%@ include file="/common/navigation.jspf"%>

<!-- background="${pageContext.request.contextPath}/images/cat_11_opa.png" -->

<body >
<div class="custom_body">
    <h2>Welcome to Find Cat page</h2>

    <div class="container">

        <form class="form-horizontal" method="POST" action="find-cat.do">
            <fieldset class="form">
                <label>Cat Name</label>
                <input name="cat_name" type="text" class="form-control" /><br/>
            </fieldset>
            <fieldset class="form">
                <label>Cat Age</label>
                <input name="cat_age" type="text" class="form-control" /><br/>
            </fieldset>
            <fieldset class="form">
                <label>Cat Color</label>
                <input name="cat_color" type="text" class="form-control" /><br/>
            </fieldset>
            <input name="add" type="submit" class="btn btn-primary" value="Go" /><br/>
        </form>
    </div>

    <h3 align="center">Search Results:</h3>
    <div align="center">
        <c:if test="${!empty catsName && empty catsAge && empty catsColor && empty catsNameAge && empty catsAgeColor && empty catsNameColor && empty catsNameAgeColor}">
            <table class="table custom_table" align="center">
                <thead>
                <th>Name</th>
                <th>Age</th>
                <th>Color</th>
                <th>Picture</th>
                </thead>
                <tbody>
                <c:forEach items="${catsName}" var="cat">
                    <tr>
                        <td>${cat.name}</td>
                        <td>${cat.age}</td>
                        <td>${cat.color}</td>
                        <td><img src="${pageContext.request.contextPath}${cat.imagePath}" alt="Friends" width="100" height="68"></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
    <div align="center">
        <c:if test="${!empty catsAge && empty catsName && empty catsColor && empty catsNameAge && empty catsAgeColor && empty catsNameColor && empty catsNameAgeColor}">
            <table class="table custom_table">
                <thead>
                <th>Name</th>
                <th>Age</th>
                <th>Color</th>
                <th>Picture</th>
                </thead>
                <tbody>
                <c:forEach items="${catsAge}" var="cat">
                    <tr>
                        <td>${cat.name}</td>
                        <td>${cat.age}</td>
                        <td>${cat.color}</td>
                        <td><img src="${pageContext.request.contextPath}${cat.imagePath}" alt="Friends" width="100" height="68"></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
    <div align="center">
        <c:if test="${!empty catsColor && empty catsAge && empty catsName && empty catsNameAge && empty catsAgeColor && empty catsNameColor && empty catsNameAgeColor}">
            <table class="table custom_table">
                <thead>
                <th>Name</th>
                <th>Age</th>
                <th>Color</th>
                <th>Picture</th>
                </thead>
                <tbody>
                <c:forEach items="${catsColor}" var="cat">
                    <tr>
                        <td>${cat.name}</td>
                        <td>${cat.age}</td>
                        <td>${cat.color}</td>
                        <td><img src="${pageContext.request.contextPath}${cat.imagePath}" alt="Friends" width="100" height="68"></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
    <div align="center">
        <c:if test="${!empty catsNameAge && empty catsAge && empty catsColor && empty catsName && empty catsAgeColor && empty catsNameColor && empty catsNameAgeColor}">
            <table class="table custom_table">
                <thead>
                <th>Name</th>
                <th>Age</th>
                <th>Color</th>
                <th>Picture</th>
                </thead>
                <tbody>
                <c:forEach items="${catsNameAge}" var="cat">
                    <tr>
                        <td>${cat.name}</td>
                        <td>${cat.age}</td>
                        <td>${cat.color}</td>
                        <td><img src="${pageContext.request.contextPath}${cat.imagePath}" alt="Friends" width="100" height="68"></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
    <div align="center">
        <c:if test="${!empty catsAgeColor && empty catsAge && empty catsColor && empty catsNameAge && empty catsName && empty catsNameColor && empty catsNameAgeColor}">
            <table class="table custom_table">
                <thead>
                <th>Name</th>
                <th>Age</th>
                <th>Color</th>
                <th>Picture</th>
                </thead>
                <tbody>
                <c:forEach items="${catsAgeColor}" var="cat">
                    <tr>
                        <td>${cat.name}</td>
                        <td>${cat.age}</td>
                        <td>${cat.color}</td>
                        <td><img src="${pageContext.request.contextPath}${cat.imagePath}" alt="Friends" width="100" height="68"></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
    <div align="center">
        <c:if test="${!empty catsNameColor && empty catsAge && empty catsColor && empty catsNameAge && empty catsAgeColor && empty catsName && empty catsNameAgeColor}">
            <table class="table custom_table">
                <thead>
                <th>Name</th>
                <th>Age</th>
                <th>Color</th>
                <th>Picture</th>
                </thead>
                <tbody>
                <c:forEach items="${catsNameColor}" var="cat">
                    <tr>
                        <td>${cat.name}</td>
                        <td>${cat.age}</td>
                        <td>${cat.color}</td>
                        <td><img src="${pageContext.request.contextPath}${cat.imagePath}" alt="Friends" width="100" height="68"></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
    <div align="center">
        <c:if test="${!empty catsNameAgeColor && empty catsAge && empty catsColor && empty catsNameAge && empty catsAgeColor && empty catsNameColor && empty catsName}">
            <table class="table custom_table">
                <thead>
                <th>Name</th>
                <th>Age</th>
                <th>Color</th>
                <th>Picture</th>
                </thead>
                <tbody>
                <c:forEach items="${catsNameAgeColor}" var="cat">
                    <tr>
                        <td>${cat.name}</td>
                        <td>${cat.age}</td>
                        <td>${cat.color}</td>
                        <td><img src="${pageContext.request.contextPath}${cat.imagePath}" alt="Friends" width="100" height="68"></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
</div>
</body>

<%@ include file="/common/footer.jspf"%>