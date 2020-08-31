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


@WebServlet("/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         String nomeEmpresa = (String) request.getParameter("nome");
         String dataEmpresa = request.getParameter("data");
         
         /* o param digitado pelo form vai vir string e ai temos de converter 
          * para Date, ai usamos o simpledateformat que so pode ser trabalhadado
          * em try catchs
          * 
          * porem se vc digitar uma data errada nao pode continuar a criar
          * entao sera lancada uma excecao do tipo ServletException. 
          * Para não perdermos de vista o problema original da exceção, 
          * adicionaremos e em ServletException, isto é, a exceção original.
          * 
          * Esse padrão é conhecido por CATCH AND RETROW, isto é, 
          * capturar e relançar a exceção.
          * 
          **/
         

         Date dataFormatada = null;
         try {
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             dataFormatada = sdf.parse(dataEmpresa);
         } catch (ParseException e) {
             throw new ServletException(e);
         }
         
         Empresa empresa = new Empresa();
         empresa.setNome(nomeEmpresa);
         empresa.setData(dataFormatada);
         
         Banco banco = new Banco();
         banco.adiciona(empresa);
         
         request.setAttribute("nome", empresa.getNome());
         
         response.sendRedirect("empresas");
         
         /*
         RequestDispatcher rd = request.getRequestDispatcher("/empresas"); 
         
         rd.forward(request, response);
         */
	}

}
