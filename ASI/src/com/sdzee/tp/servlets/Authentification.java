package com.sdzee.tp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.tp.beans.Utilisateur;

public class Authentification extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /*
         * Récupération des données saisies, envoyées en tant que paramètres de
         * la requête GET générée à la validation du formulaire d'authentification
         */
    	String id = request.getParameter( "identifiant" );
        String motDePasse = request.getParameter( "pwd" );
      
        String message;
       
        Utilisateur utilisateur=new Utilisateur();
     
        utilisateur.setNom("bruno");
        utilisateur.setPrenom("vincent");
     
        utilisateur.setEmail("bruno.vincent@gmail.com");
  
     
        /*
         * Vérification existance de l'utilisateur dans l'annuaire + remplissage du message
         * 
         * 
         */
        Boolean test=true;
        
        /*
         * Initialisation du message à afficher : si un des champs obligatoires
         * du formulaire d'authentification n'est pas renseigné, alors on affiche un message
         * d'erreur
         */
        if ( id.trim().isEmpty() || motDePasse.trim().isEmpty() ) {
            message = "Vous n'avez pas rempli tous les champs obligatoires. ";
            test=false;
        } else {
            message = "";
        }
        
        
       

        /* Transmission à la page JSP en charge de l'affichage des données */
        if(!test){
        	message = "authentification échouée";
        	/* Ajout du message à l'objet requête */
            request.setAttribute( "message", message );
        	this.getServletContext().getRequestDispatcher( "/authentification.jsp" ).forward( request, response );
        }
        else{
        	message = "authentification réussite";
        	request.setAttribute( "message", message );
        	request.setAttribute( "utilisateur", utilisateur );
        	this.getServletContext().getRequestDispatcher( "/informationUser.jsp" ).forward( request, response );
        }
        
    }
}


