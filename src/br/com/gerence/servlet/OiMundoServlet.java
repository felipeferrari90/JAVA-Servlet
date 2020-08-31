package br.com.gerence.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/oiMundoServlet")
public class OiMundoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
    	PrintWriter out = resp.getWriter();
    	out.println("<html>");
    	out.println("<body>");
    	out.println("<h2> OI MUNDO SERVLET </h2>");
    	out.println("</body>");
    	out.println("</html>");
    } 
    
    /**
     *   repare que no mundo das servlets vc nao precisa instanciar oiMundoServlet, ele ja é instanciado 
     *   mas nao por vc, o tomcat instancia por debaixo dos panos ja que é um singleton, e essa instancia 
     *   é só uma vez e pra sempre
     * 
     * 
     *   SERVLET-CONTAINER -> é tipo um lugar onde estao guardados e instanciados os objetos do servlet 
     *                        onde nao precisamos instanciar.
     * 
     *   MIDDLEWARE - o servlet é um middleware que é um intermediario entre esses objetos e o navegador.
     * 
     *   SINGLETON - o obj servlet é so instanciado uma vez.
     *   
     *   INVERSAO DE CONTROLE (IOC) - nao é o metodo main que instancia esse objeto e sim o tomcat,
     *                                vc apenas cria o 'casco'
     * 
     */

}
