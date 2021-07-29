import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/customers")
public class CustomerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//JDBC
		
		/** Model ***/
		Customer c1 = new Customer("Mike",29);
		Customer c2 = new Customer("Peter",34);

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(c1);
		customers.add(c2);
		
		/** View ***/
		
		final ObjectMapper mapper = new ObjectMapper();
		String jsonInString = mapper.writeValueAsString(customers);
		System.out.println(jsonInString);
		
		/*** sending response ***/
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.print(jsonInString);
		
	}
	
}

class Customer {
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}