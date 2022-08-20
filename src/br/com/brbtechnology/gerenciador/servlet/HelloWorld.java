package br.com.brbtechnology.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloword")
public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{

	PrintWriter out = resp.getWriter();
	
	System.out.println("Requisicao no Servlet iniciada..");
	out.append("<html>");
	out.append("<body>");
	out.append("<h1>Hello World!!!</h1>");
	out.append("</body>");
	out.append("</html>");
	System.out.println("Requisicao no Servlet finalizada..");	
	}

}
