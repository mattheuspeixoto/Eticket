package paginas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.Filmes;
import classe.Pessoa;
import classe.Shows;

/**
 * Servlet implementation class ServletShows
 */
@WebServlet("/ServletShows")
public class ServletShows extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int i=0;//nao existe
	List<Shows> arrayShows = new ArrayList<>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletShows() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String titulo = request.getParameter("titulo");
		String local  = request.getParameter("local");
		String data   = request.getParameter("dataEvento");
		String hora   = request.getParameter("hora");
		String minuto = request.getParameter("minuto");
		String classificacao =request.getParameter("classificacao");
		
		
		
		if(arrayShows!=null){
		
			Shows sh = new Shows(titulo,local,hora,minuto,classificacao,data);
									
			arrayShows.add(i,sh);
			i++;//nao existe
			
			ServletContext contexto = request.getServletContext();
			contexto.setAttribute("listaShow",arrayShows);
			request.getRequestDispatcher("listaShows.jsp").forward(request, response);
			
			}
	}
}
