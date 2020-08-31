package br.com.gerence.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/mostraempresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresaById(id);
		request.setAttribute("empresa", empresa);
		
		
		//quando o dispatcher é pra um arquivo jsp ai se usa a / + nome com o .jsp
		RequestDispatcher rd = request.getRequestDispatcher("/alteraempresa.jsp");
		rd.forward(request, response);
	}

}
