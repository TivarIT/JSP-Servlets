package labs.laba13.primer2;

import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class CookieAction
 */
@WebServlet("/CookieAction")
public class CookieAction { 
private static int number = 1; 
public static void setCookie(HttpServletResponse resp) { 
	String name = "TO";
	String role = "00" + number++; 
	Cookie c = new Cookie(name, role); 
	c.setMaxAge(60 * 60); // время жизни файла cookie 
	resp.addCookie(c); // добавление cookie к объекту-ответу 
	String value = resp.getLocale().toString(); 
	Cookie loc = new Cookie("locale", value);
	resp.addCookie(loc);
} 
	public static ArrayList<String> addToRequest(HttpServletRequest request) { 
		ArrayList<String> messages = new ArrayList<>(); 
		Cookie[ ] cookies = request.getCookies(); 
		if (cookies != null) { 
			messages.add("Number cookies : " + cookies.length); 
			for (int i = 0; i < cookies.length; i++) { 
				Cookie c = cookies[i]; 
				messages.add(c.getName() + " = " + c.getValue()); } }
		return messages;
	} 
}
