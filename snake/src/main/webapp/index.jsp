<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<ul class="nav nav-tabs" id="myTab" role="tablist">
    <form action="Home" method="post">
        <label>Name:</label>
        <input type="text" name="name"><br/>
        <label>Age:</label>
        <input type="number" name="age">
    </form>
    <li class="nav-item" role="presentation">
        <button class="nav-link" id="profile-tab" type="button" ><a href="">Submit</a></button>
    </li>

</ul>
</body>
</html>