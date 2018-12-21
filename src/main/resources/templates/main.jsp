<!DOCTYPE html>

<html lang="en">

<body>
<h1>{{ status }}</h1>
<div style="background-color: darkred; width: 200px;">
    <h1>
        <%if status %>
        {{ status }}!
        {% else %}
        App was stoped
        {% endif %}
    </h1>
</div>
<form action="/action" method="GET">
    <input type="submit" name="submit" value="Hello"/>
    <input type="submit" name="submit" value="Bye"/>
</form>
<p><a href="/logs">Logs</a></p>
</body>

</html>
