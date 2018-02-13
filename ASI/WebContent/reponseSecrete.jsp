<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Questionnaire</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
        <%-- Affichage de la chaîne "message" transmise par la servlet --%>
        <p class="info">${ message }</p>
        <div>
            <form method="get" action="verifReponse">
        		<fieldset>
        
        			<p>question: ${ utilisateur.question }</p>
        
        			<label for="reponse">réponse <span class="requis">*</span></label>
                    <input type="text" id="reponse" name="reponse" value="" size="20" maxlength="20" />
                    <br />
       		    </fieldset>
         <input type="submit" value="Valider"  />
    </body>
</html>