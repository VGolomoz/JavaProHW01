<%@ page import="JavaProHW01.User" %>
<%@ page import="JavaProHW01.Question" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Hashtable" %>

<% User user = (User) request.getSession().getAttribute("loginedUser");
   List<Question> allResults = (List) request.getSession().getAttribute("allResults");
   List<Question> userResults = user.getResults();

%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Quiz</title>
    <link rel="stylesheet" href="style/w3.css">
</head>

<body class="w3-light-grey">

   <div class="w3-bar w3-blue-gray w3-opacity w3-card w3-left-align w3-medium">
            <form method="get" action="/logout">
            <button class="w3-button w3-right w3-green">Logout</button>
            </form>
   </div>

    <% if (!user.getResults().isEmpty()) {
     out.println ( "<div class=\"w3-panel w3-pale-green w3-border\">" +
                   "<h1>Hello " + user.getLogin()+ "</h1>" +
                   "<h3>You already passed this quiz</h3>" +
                   "<p>If you want to take the quiz again: " +
                   "<a href=\"/quiz\">click here</a></p></div>");
                   }%>

<div class="w3-third w3-margin-bottom">
<% out.println("<table class=\"w3-table w3-striped w3-bordered w3-border\">" +
               " <thead class=\"w3-teal\"> " +
               " <th style=\"width:100%\"> " + "Your Quiz results" +
               " </th><th></th></thead> ");

for (Question q : userResults) {
     out.println("<tr><th>" + q.getName()+ "</th></tr>");
     for (Map.Entry<String, Integer> entry : q.getAnswer().entrySet()) {
     out.println("<tr><td>" + entry.getKey() + " : " + entry.getValue() + "</td></tr>");
     }
}%>
</div>

<div class="w3-third w3-margin-bottom">
<% out.println("<table class=\"w3-table w3-striped w3-bordered w3-border\">" +
               " <thead class=\"w3-teal\"> " +
               " <th style=\"width:100%\"> " + "All Quiz results" +
               " </th><th></th></thead> ");
%>

<%for (Question q : allResults) {
       out.println("<tr><th>" + q.getName()+ "</th></tr>");
       for (Map.Entry<String, Integer> entry : q.getAnswer().entrySet()) {
       out.println("<tr><td>" + entry.getKey() + " : " + entry.getValue() + "</td></tr>");
       }
}%>
</div>

</body>
</html>