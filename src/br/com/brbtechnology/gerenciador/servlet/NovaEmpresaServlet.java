package br.com.brbtechnology.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando Nova Empresa");
		
		PrintWriter out = response.getWriter();
		
		String nomeEmpresa = request.getParameter("nome");
		
		out.append("<html>");
		out.append("<body>");
		out.append("<h3>Empresa " + nomeEmpresa + " Cadastrada com Sucesso!</h3>");
		out.append("</body>");
		out.append("</html>");
		
		System.out.println("Empresa " + nomeEmpresa + " Cadastrada com Sucesso!");
	}

}
