<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>authentification</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
    	<%-- Affichage de la chaîne "message" transmise par la servlet --%>
        <p class="info">${ message }</p>
        <div>
            <form method="get" action="authentification">
                <fieldset>
                    <legend>Connectez-vous</legend>
    
                    <label for="identifiant">identifiant <span class="requis">*</span></label>
                    <input type="text" id="identifiant" name="identifiant" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="pwd">Mot de passe  <span class="requis">*</span></label>
                    <input type="text" id="pwd" name="pwd" value="" size="20" maxlength="20" />
                    <br />
                    
    				<a href="pwdReinitialisation.jsp">Mot de passe oublié</a> 
    				<br />
    				
                </fieldset>
                <input type="submit" value="Valider"  />
            </form>
        </div>
    </body>
</html>