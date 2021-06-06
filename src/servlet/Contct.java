package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet/contact" })
public class Contct extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String email = request.getParameter("email");
		String content = request.getParameter("content");
		String[] magazines = request.getParameterValues("magazine");
		String requestDocs = request.getParameter("requestDocs");
		
		ContactBean c = new ContactBean();
		c.setName(name);
		c.setCompany(company);
		c.setEmail(email);
		c.setContent(content);
		c.setMagazines(magazines);
		c.setRequestDocs(requestDocs);
		
		request.setAttribute("contact", c);
		
		request.getRequestDispatcher("../jsp/confirm.jsp").forward(request, response);

	}

}