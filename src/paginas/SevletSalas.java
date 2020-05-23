package paginas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.Salas;
import classe.Shows;

/**
 * Servlet implementation class CadAtores
 */
@WebServlet("/CadSalas")
public class SevletSalas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int i=0;
	List<Salas> arraySalas = new ArrayList();
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletSalas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 if(arraySalas!=null){
						
		    String titulo     = request.getParameter("titulo");
		    String hora       = request.getParameter("duracaoHora");
			String minuto     = request.getParameter("duracaoMinuto");
			String capacidade = request.getParameter("capacidade");
		
			Salas sala = new Salas(titulo,hora,capacidade,minuto);
			
			arraySalas.add(i,sala);
			i++;
			
			ServletContext contexto = request.getServletContext();
			contexto.setAttribute("listaS", arraySalas);
			
			request.getRequestDispatcher("listaSalas.jsp").forward(request, response);
		}	
	}
}
