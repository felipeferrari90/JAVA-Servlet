package br.com.gerence.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraempresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String paramId = request.getParameter("id");
		 String paramNome = request.getParameter("nome");
		 String paramData = request.getParameter("data");
		 Integer id = Integer.valueOf(paramId);
		 SimpleDateFormat sdf;

         Date dataFormatada = null;
         try {
             sdf = new SimpleDateFormat("dd/MM/yyyy");
             dataFormatada = sdf.parse(paramData);
         } catch (ParseException e) {
             throw new ServletException(e);
         }
         
         Banco banco = new Banco();
         Empresa empresa = banco.getEmpresaById(id);
         empresa.setNome(paramNome);
         empresa.setData(dataFormatada);

         response.sendRedirect("empresas");
		 
	}

}
