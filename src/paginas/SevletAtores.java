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

import classe.Pessoa;

/**
 * Servlet implementation class CadAtores
 */
@WebServlet("/CadAtores")
public class SevletAtores extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	int i=0;
	List<Pessoa> arrayAtor = new ArrayList<Pessoa>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletAtores() {
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
		
		if(arrayAtor!=null){
			
		    String nome =  request.getParameter("nomeAtor");
			String email=  request.getParameter("emailAtor");
			String pais =  request.getParameter("listaPais");
			
			Pessoa atorNv = new Pessoa(nome,email,pais);
			
			arrayAtor.add(i,atorNv);
			i++;
					
			System.out.println(nome);
			System.out.println(email);
			System.out.println(pais);
			
			ServletContext contexto = request.getServletContext();
			contexto.setAttribute("listaAtor", arrayAtor);
			request.getRequestDispatcher("listaAtores.jsp").forward(request, response);
			
		}
		
	}

}
