package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet
public class apiServlet extends HttpServlet{

	private String[] infoCategories = { "Ability scores",
										"Aligments",
										"Backgrounds",
										"Classes",
										"Conditions",
										"Damage types",
										"Equipment categories" };
	private String respo;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
    	RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("https://www.dnd5eapi.co/api");
//    	this.respo = dispatcher.toString();
    	System.out.println("hahah");
    	this.respo = "Ut hendrerit enim ac lectus accumsan, ac elementum magna auctor. Maecenas imperdiet mattis sollicitudin. Phasellus vel nunc eu lorem dignissim commodo vitae vitae nulla. Ut sollicitudin dui vel neque iaculis pulvinar. Praesent lobortis elit mauris, sit amet aliquet orci bibendum in. Cras eget justo id augue feugiat tristique et non turpis. Nunc nec nunc non nisl sagittis mattis.";
    	
	}

	public String[] getMainList(){
		return infoCategories;
	}
	
	public String getResponse(){
		return respo;
	}
}
