package com.sdzee.tp.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.tp.beans.Utilisateur;

public class VerifReponse extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		String reponse = request.getParameter( "reponse" );
		Utilisateur utilisateur = (Utilisateur) request.getAttribute("utilisateur");
		if(utilisateur.getQuestion().equals(reponse)){
			String message = "authentification réussite";
        	request.setAttribute( "message", message );
        	request.setAttribute( "utilisateur", utilisateur );
        	this.getServletContext().getRequestDispatcher( "/informationUser.jsp" ).forward( request, response );
			
		}else{
			String message = "authentification échouée";
            request.setAttribute( "message", message );
        	this.getServletContext().getRequestDispatcher( "/authentification.jsp" ).forward( request, response );
		}
	}

}
