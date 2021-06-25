package com.shopping.login;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import com.shopping.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	private LoginService userValidationService = new LoginService();
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
							throws ServletException, IOException{
		
		//String name = request.getParameter("name");
		//String password = request.getParameter("password");
		
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		//PrintWriter writer = response.getWriter();
		//writer.println("Hello World");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isUserValid = userValidationService.isUserValid(name, password);
		
		if(isUserValid) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todos.do");
			//request.setAttribute("todos", todoService.retrieveTodos());
			//request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Invalid Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}
