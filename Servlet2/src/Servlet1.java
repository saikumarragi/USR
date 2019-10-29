

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try {
			response.sendRedirect("/servlet2/servhtml2.html");
		} 
		catch (IOException e) 
		{
			System.out.println("some problem occured");
		}
	}
}
	