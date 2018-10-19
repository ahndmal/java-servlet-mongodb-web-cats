<%@ include file="/common/header.jspf"%>
<%@ include file="/common/navigation.jspf"%>

<body>
<p><font color="red">${errorMessage}</font></p>
<div class="container" align="center">
    <form action="/login.do" method="POST" id="form_login">
    <table>

        <tr>
                <fieldset class="form-group">
                    <td>
                        <label>Name</label>
                    </td>
                </fieldset>

            <td>
                <input name="name" type="text" />
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <fieldset class="form-group">
            <td>
                <label>Password</label>&nbsp;&nbsp;&nbsp;
            </td>
            </fieldset>
            <td>
            <input name="password" type="password" /><br/>
            </td>
        </tr>

    </table>
        <br/>
    <input type="submit" class="btn btn-primary" value="Login" />
    </form>
</div>

<%@ include file="/common/footer.jspf"%>
