package br.com.gerence.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	//mocar dois registros.
	static {
		
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void adiciona(Empresa empresa) {
		
		//valor colocado e depois do objeto ser criado a variavel chavesequencial é incrementada
		empresa.setId(chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public void remove(int id) {
		
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa e = it.next();
			if(e.getId() == id) {
	    		it.remove();
	    	}
		}	
	}

	public Empresa getEmpresaById(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
	
}
