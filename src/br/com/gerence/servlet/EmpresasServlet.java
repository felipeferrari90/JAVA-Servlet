package br.com.gerence.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/empresas")
public class EmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 Banco banco = new Banco();
		 List<Empresa> empresas = banco.getEmpresas();
		 
		 request.setAttribute("empresas", empresas);
		 RequestDispatcher rd = request.getRequestDispatcher("empresas.jsp");
		 
		 rd.forward(request, response);
	     
        
	}

	
	

}
