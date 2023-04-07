<%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 07.04.2023
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<title>Save user</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<%
    if (session.getAttribute("user") != null) {
        response.getWriter().println("<div class=\"w3-panel w3-green w3-display-container w3-card-4 w3-round\">\n"
                + "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                "   <h5>You name saved in current session!</h5>\n" +
                "</div>");
    } else {
        response.getWriter().println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n"
                + "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                "   <h5>You dont log in yet!</h5>\n" +
                "</div>");
    }
    ;
%>
<form method="post" class="w3-selection w3-center w3-light-grey w3-padding">
    <input type="text" name="name" size="15" maxlength="10" class="w3-input w3-border" value=""
           placeholder="Enter your name" required>
    <input type="text" name="surname" size="15" maxlength="20" class="w3-input w3-border" value=""
           placeholder="Enter your surname" required>
    <button type="submit" class="w3-btn w3-hover-blue w3-round-large">Save in session</button>
    <button class="w3-btn w3-hover-blue w3-round-large" onclick="location.href='..'">Back</button>
</form>
</body>
</html>

