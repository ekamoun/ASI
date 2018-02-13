package com.sdzee.tp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.tp.beans.Utilisateur;

public class PwdReinitialisation extends HttpServlet {
	
	 public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	        /*
	         * Récupération de l'identifiant
	         */
	    	String id = request.getParameter( "identifiant" );
	    
	      
	        String message;
	        Boolean test=true;
	        
	        if ( id.trim().isEmpty()  ) {
	            message = "Vous n'avez pas rempli le champ obligatoire. ";
	            request.setAttribute( "message", message );
	            this.getServletContext().getRequestDispatcher( "/pwdReinitialisation.jsp" ).forward( request, response );
	          
	        } else {
	        
	        
	        	Utilisateur utilisateur=new Utilisateur();
	        	/*vérification de l'existance de l'utilisateur et récupération de sa question secrète*/

	            /* Transmission à la page JSP en charge de l'affichage des données */
	            if(!test){
	            	message = "Utilisateur non trouvé";
	            	/* Ajout du message à l'objet requête */
	            	request.setAttribute( "message", message );
	            	this.getServletContext().getRequestDispatcher( "/pwdReinitialisation.jsp" ).forward( request, response );
	            }
	            else{
	            
	            
	            	message = "Veuillez répondre à la question suivante";
	            	request.setAttribute( "message", message );
	        		
	        		utilisateur.setNom("rrr");
	                utilisateur.setPrenom("rr");
	                utilisateur.setEmail("tte");
	                utilisateur.setQuestion("are you sure ?");
	                utilisateur.setReponse("yes i am sure");
	                request.setAttribute( "utilisateur", utilisateur );
	        		this.getServletContext().getRequestDispatcher( "/reponseSecrete.jsp" ).forward( request, response );
	        		this.getServletContext().getRequestDispatcher("/verifreponse").forward(request, response);

	           }
	        
	    }
	 }
	        
}
