<%-- ********* ErrPage.jsp ********** --%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ page isErrorPage="true" %>
<HTML>
<BODY TEXT="red">

������Ϣ��<%= exception.getMessage() %>
</BODY>
</HTML>
