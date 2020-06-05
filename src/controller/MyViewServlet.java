package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Userdao;
import model.Details;

/**
 * Servlet implementation class MyViewServlet
 */
@WebServlet("/myview")
public class MyViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/MyView.jsp");
		rd.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String name = request.getParameter("name");
	        String rollno  = request.getParameter("rollno");
	        String address = request.getParameter("address");
	        String gender =request.getParameter("gender");

	        Details details = new Details();
	        details.setName(name);
	        details.setRoll(rollno);
	        details.setAddress(address);
	        details.setGender(gender);
	        Userdao userdao= new Userdao();
	        try {
				userdao.addDetails(details);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/MyView.jsp");
			rd.forward(request, response);	
			}
	}
	
	

