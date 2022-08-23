package br.com.brbtechnology.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("BRB Tech");
		empresa.setCNPJ("2918995-0001");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("IOB Tech");
		empresa2.setCNPJ("19602022-0001");
		
		listEmpresas.add(empresa);
		listEmpresas.add(empresa2);
	}

	public void adicionar(Empresa empresa) {
		listEmpresas.add(empresa);
	}
	
	public List<Empresa> getAllEmpresas(){
		return Banco.listEmpresas;
	}

}
