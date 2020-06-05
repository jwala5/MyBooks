package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Userdao;
import model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");  //get email from jsp page
		String password = request.getParameter("password");
		
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		
		Userdao userdao = new Userdao();
		boolean validateUser = false;
		try {
			validateUser = userdao.loginUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(validateUser)
		{
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/MyView.jsp");
			rd.forward(request, response);
		}
		else 
		{
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
			rd.forward(request, response);
		}
	}
	}


