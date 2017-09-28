package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
import java.util.ResourceBundle;
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Locale locale = Locale.getDefault();
		Locale locale = new Locale("en");
        ResourceBundle apptexts = ResourceBundle.getBundle("apptexts_en", locale);
		
        request.getSession().setAttribute("apptext", apptexts);
        
//        Locale locale = new Locale("en");
//        Locale locale = new Locale("es");
		request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
