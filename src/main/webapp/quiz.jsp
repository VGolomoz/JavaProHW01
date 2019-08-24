<%@ page import="JavaProHW01.User" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Quiz</title>
    <link rel="stylesheet" href="style/w3.css">
</head>
<body class="w3-light-grey">
    <!-- header -->
    <div class="w3-container w3-blue-grey w3-opacity w3-left-align">
        <h1>Quiz</h1>
    </div>

    <% User user = (User) request.getSession().getAttribute("loginedUser");
    %>


   <div  class="w3-container w3-card-4">
   <form method = "post" action = "/quiz">
     <h2>Do you want to eat?</h2>

     <input class="w3-radio" type="radio" name="1stQ" value="Yes">
     <label>Yes</label></p>

     <input class="w3-radio" type="radio" name="1stQ" value="No">
     <label>No</label></p>

     <h2>Are you happy?</h2>

     <input class="w3-radio" type="radio" name="2ndQ" value="Yes">
     <label>Yes</label></p>

     <input class="w3-radio" type="radio" name="2ndQ" value="Ofcourse Yes">
     <label>Ofcourse Yes</label></p>

     <input class="w3-radio" type="radio" name="2ndQ" value="Absolutely Yes">
     <label>Absolutely Yes</label></p>

     <h2>Do you want a vacation?</h2>

          <input class="w3-radio" type="radio" name="3rdQ" value="Yes">
          <label>Yes</label></p>

          <input class="w3-radio" type="radio" name="3rdQ" value="Ofcourse!!!">
          <label>Ofcourse!!!</label></p>

     <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Send</button>
   </form>
   </div>


</body>
</html>