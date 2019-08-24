<html>
<head>
    <meta charset="UTF-8">
    <title>Login Quiz</title>
    <link rel="stylesheet" href="style/w3.css">
</head>
<body class="w3-light-grey">

    <!-- header -->
    <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
        <h1>Login Quiz</h1>
    </div>

      <div class="w3-container w3-padding">
          <form method="post" action = "/login" class="w3-selection w3-light-grey w3-padding">
        <label>Enter your login:
            <input type="text" name="login" class="w3-input w3-border w3-round-large" style="width: 30%"><br />
        </label>
        <label>Enter your password:
            <input type="password" name="pass" class="w3-input w3-border w3-round-large" style="width: 30%"><br />
        </label>
         <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Sign in</button>
        </form>

</body>
</html>