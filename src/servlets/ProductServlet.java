package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cart;
import model.Description;
import model.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProductServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String languageCode = request.getParameter("language");
		Locale locale = null;
		if(languageCode == null) {
			languageCode = (String)request.getSession().getAttribute("languageCode");
			if(languageCode == null){
				locale = Locale.getDefault();
			}else {
				locale = new Locale(languageCode);
			}
		}else {
			request.getSession().setAttribute("languageCode", languageCode);
			locale = new Locale(languageCode);
		}
		
        ResourceBundle apptexts = ResourceBundle.getBundle("apptexts", locale);
        request.getSession().setAttribute("apptext", apptexts);
		
		Description d1 = new Description(1, "NO", apptexts.getString("blackCup"));
		Description d2 = new Description(2, "NO", apptexts.getString("whiteCup"));
		
		Product p1 = new Product(1, "Black cup", 10.0, "", d1);
		Product p2 = new Product(2, "White cup", 12.0, "", d2);
				
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(p1);
		products.add(p2);
		
		request.getSession().setAttribute("products", products);
		
		request.getRequestDispatcher("WEB-INF/products.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cart cart;
		if(request.getSession().getAttribute("cart") != null) {
			cart = (Cart)request.getSession().getAttribute("cart");
		}else {
			cart = new Cart();
		}
		int pno = Integer.parseInt(request.getParameter("pno"));
		String pName = request.getParameter("pName");
		double priceInEuro = Double.parseDouble(request.getParameter("priceInEuro"));
		String imageFile = request.getParameter("imageFile");
		
		String langCode = request.getParameter("langCode");
		String descriptionText = request.getParameter("descriptionText");
		Description d = new Description(pno, langCode, descriptionText);
		Product p = new Product(pno, pName, priceInEuro, imageFile, d);
		cart.addProduct(p);
		
		request.getSession().setAttribute("cart", cart);
		response.sendRedirect("products");
		
		
		
	}

}
