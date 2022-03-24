package labs.laba13.primer2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class CookieController
 */
@WebServlet("/CookieController")
public class CookieController extends HttpServlet { 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException { 
	CookieAction.setCookie(response); // добавление cookie 
	// извлечение cookie и добавление информации к request 
	request.setAttribute("messages", CookieAction.addToRequest(request)); 
	request.getRequestDispatcher("./maincookie.jsp").forward(request, response); 
	} 
}
