package labs.laba13.primer1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class SessionControl
 */
@WebServlet("/SessionControl")
public class SessionControl extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException {
	HttpSession session = request.getSession(true);
	if (session.getAttribute("role") == null){ 
		session.setAttribute("role", "moderator"); 
	}
	Integer counter = (Integer) session.getAttribute("counter"); 
	if (counter == null){ 
		session.setAttribute("counter", 1); 
	} 
	else { 
		counter++; session.setAttribute("counter", counter); 
	} 
	request.setAttribute("lifecycle", "CONTROL request LIFECYCLE"); 
	request.getRequestDispatcher("./sessionattr.jsp").forward(request, response); 
	}
}

