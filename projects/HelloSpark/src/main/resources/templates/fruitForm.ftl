
<html>
    <head>
        <title>Fruit Picker</title>
    </head>
    <body>

        <form action="/favorite_fruit" method="POST">
            <p>What is your favority Fruit?</p>
            <#list fruits as fruit>
                <p>
                    <input type="radio" name="fruit" value="${fruit}">${fruit}</input>
                </p>
            </#list>
            <input type="submit" value="Submit"/>
        </form>
        
    </body>
</html>
