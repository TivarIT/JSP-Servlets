package labs.laba13.mainTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; 
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		Date currentDate = new Date();
		if(login.equals("brek") && pass.equals("1234")){
			HttpSession session = request.getSession();
			session.setAttribute("username", login);
			session.setAttribute("password", pass);
			session.setAttribute("currentDate", currentDate);
			String fileName = "C:\\Users\\user\\eclipse-workspace\\JSP_Servlets\\code.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			try (BufferedReader br = new BufferedReader(fr)) {
				int srav = 0;
				int pris = 0;
				int logi = 0;
				String line;
				while((line = br.readLine()) != null){
					if(line.contains(" != ")) {
						srav++;
						}
					if(line.contains(" && ")) {
						logi++;
						}
					if(line.contains(" = ")) {
						pris++;
						}
					}
				Cookie cookie1 = new Cookie("sravCount", String.valueOf(srav));
				response.addCookie(cookie1);
				Cookie cookie2 = new Cookie("logiCount", String.valueOf(logi));
				response.addCookie(cookie2);
				Cookie cookie3 = new Cookie("prisCount", String.valueOf(pris));
				response.addCookie(cookie3);
				session.setAttribute("sravCount", cookie1.getValue());
				session.setAttribute("logiCount", cookie2.getValue());
				session.setAttribute("prisCount", cookie3.getValue());
			}
			response.sendRedirect("./welcomePage.jsp");
			}
		else{			
			response.sendRedirect("./loginForm.jsp");	
			}	
		}
	}
