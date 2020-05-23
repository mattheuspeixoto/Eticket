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

import classe.Pessoa;

/**
 * Servlet implementation class CadAtores
 */
@WebServlet("/CadDiretor")
public class SevletDiretor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int i=0;
	List<Pessoa> diretor = new ArrayList<Pessoa>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletDiretor() {
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
		
		String nome  = request.getParameter("nomeDiretor");
		String pais  = request.getParameter("listaPais");
		String email = request.getParameter("diretorEmail");
		
		
		if(diretor!=null && nome!=null && pais!=null && email!=null){

			Pessoa diretorNv = new Pessoa(nome,email,pais);
				
			diretor.add(i,diretorNv);
			i++;
			ServletContext contexto = request.getServletContext();
			contexto.setAttribute("listaDiretor", diretor);
			request.getRequestDispatcher("listaDiretor.jsp").forward(request, response);
			
		}
			request.getRequestDispatcher("listaDiretor.jsp").forward(request, response);
		
	}

}
