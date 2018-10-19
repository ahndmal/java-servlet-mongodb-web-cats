<%@ include file="/common/header.jspf"%>
<%@ include file="/common/navigation.jspf"%>
<!-- background="${pageContext.request.contextPath}/images/cat_mom_opa_2.png"-->
<body >
<div class="welcome_body">

<p>
    <h3>Hello ${name}</h3>
    <br/>
    <br/>
</p>
<p>
    <h4>This is the welcome page</h4>
    <br/>
</p>
<p>
    <form action="${pageContext.request.contextPath}/show-all-cats.do" method="POST" id="show_all_cats_form">
        <input type="submit" class="btn btn-primary" value="Show All Cats" />
    </form>
</p>
</div>
</body>

<%@ include file="/common/footer.jspf"%>