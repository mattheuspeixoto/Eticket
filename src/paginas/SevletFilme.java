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

import classe.Filmes;
import classe.Pessoa;

/**
 * Servlet implementation class CadAtores
 */
@WebServlet("/CadFilme")
public class SevletFilme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	int i=0;//nao existe
	List<Filmes> arrayFilmes = new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletFilme() {
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
		
		
		String titulo = request.getParameter("titulo");
		String genero = request.getParameter("selecaoGenero");
		String hora   = request.getParameter("duracaoHora");
		String minuto = request.getParameter("duracaoMinuto");
		String atorNome      =request.getParameter("elenco");
		String classificacao =request.getParameter("classificacao");
		String diretorNome   =request.getParameter("selecaoDiretor");
		
		
		if(arrayFilmes!=null){
		
			Pessoa ator = new Pessoa(atorNome);		
			Pessoa diretor = new Pessoa(diretorNome);
			Filmes filme = new Filmes(titulo,genero,hora,minuto,classificacao,ator,diretor);
						
			arrayFilmes.add(i,filme);
			i++;//nao existe
			
			ServletContext contexto = request.getServletContext();
			contexto.setAttribute("listaFilme",arrayFilmes);
			request.getRequestDispatcher("listaFilmes.jsp").forward(request, response);
			//Ver como está sendo mandado o array
			//Hashcod
			//toString
		}
	}
}
