package websites;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowWebsites
 */
@WebServlet("/ShowWebsites")
public class ShowWebsites extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowWebsites() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String value = request.getParameter("websites");
		
		if(value.equals("google")) {
			response.sendRedirect("https://www.google.com/");
		}
		else if(value.equals("svecw")) {
			response.sendRedirect("http://www.svecw.edu.in/");
		}
		else if(value.equals("codetantra")) {
			response.sendRedirect("https://www.code.com/");
		}
		else if(value.equals("gmail")) {
			response.sendRedirect("https://www.gmail.com/");
		}
		else if(value.equals("instagram")) {
			response.sendRedirect("https://www.instagram.com/");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
