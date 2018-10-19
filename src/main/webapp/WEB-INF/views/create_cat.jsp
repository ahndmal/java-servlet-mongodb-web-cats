<%@ page import="java.util.List" %>
<%@ include file="/common/header.jspf"%>
<%@ include file="/common/navigation.jspf"%>

<!-- background="${pageContext.request.contextPath}/images/cat_create_opa.png" -->

<body >
<div class="custom_body">

    <p><h3>Welcome to Create Cat page</h3></p>

    <h4 class="create-error-message">${catCreationError}</h4>

    <div class="container">

        <form class="form-horizontal" method="POST" action="create-cat.do">

            <fieldset class="form-group">
                <label>Cat Name</label>
                <input name="cat_name" type="text" class="form-control" /><br/>
            </fieldset>
            <fieldset class="form-group">
                <label>Cat Age</label>
                <input name="cat_age" type="text" class="form-control" /><br/>
            </fieldset>
            <h4>Color</h4>
            <select class="form-control form-control-lg" name="cat_color">
                <option disabled selected value> -- select an option -- </option>
                <option value="Black">Black</option>
                <option value="Grey">Grey</option>
                <option value="Red">Red</option>
                <option value="Three-Color">Three-Color</option>
                <option value="White">White</option>
                <option value="White and Grey">White and Grey</option>
            </select>
            <br />
            <input name="add" type="submit" class="btn btn-primary" value="Go" /><br/>
        </form>
        <c:if test="${!empty success}">
            <p align="center"><img src="${pageContext.request.contextPath}/images/common/cat_success_created.png" alt="Friends" width="380" height="94"></p>
        </c:if>
    </div>
</div>
</body>

<%@ include file="/common/footer.jspf"%>