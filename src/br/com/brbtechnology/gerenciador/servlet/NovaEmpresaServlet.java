package br.com.brbtechnology.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
	
	Empresa empresa = new Empresa();
	Banco banco = new Banco();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando Nova Empresa");
		
		PrintWriter out = response.getWriter();
		
		String nomeEmpresa = request.getParameter("nome");
		empresa.setNome(nomeEmpresa);
		
		String cnpj = request.getParameter("cnpj");
		empresa.setCNPJ(cnpj);
		
		banco.adicionar(empresa);
		
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("nomeEmpresa", empresa.getNome());
		request.setAttribute("cnpj", empresa.getCNPJ());
		rd.forward(request, response);
		
		System.out.println("Empresa " + nomeEmpresa +  ", " + cnpj + " Cadastrada com Sucesso!");
	}

}
