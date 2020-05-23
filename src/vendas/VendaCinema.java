package vendas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.Filmes;
import classe.VendCine;

/**
 * Servlet implementation class VendaCinema
 */
@WebServlet("/VendaCinema")
public class VendaCinema extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendaCinema() {
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
		
		String selecaoSala = request.getParameter("selecaoSala");
		String exibicao = request.getParameter("classificacao");
		String tituloFilme = request.getParameter("tituloFilme");
		String horario = request.getParameter("horario");
		String opcaoCadeira = request.getParameter("opcoes");
		
		VendCine vendCine = new VendCine(selecaoSala, exibicao, opcaoCadeira, horario);
		
		request.setAttribute("venda", vendCine);
		request.getRequestDispatcher("confcinema.jsp").forward(request, response);
		
		
	}

}
