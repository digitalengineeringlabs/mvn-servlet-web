import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("processing request ...");
		
		int i = 1/0;
		
		response.setContentType("text/html"); 

		String[] names = {"Mike","Kevin","Peter"};
		request.setAttribute("names", names);
		
		
		//Forwarding to JSP (Java Server Pages)
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		
		dispatcher.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
	
}
