package paginas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.Usuario;

/**
 * Servlet implementation class CadAtores
 */
@WebServlet("/CadUsuario")
public class SevletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletUsuario() {
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
		
		String nome = request.getParameter("usuName");
		String dataNascimento = request.getParameter("dataNascimento");
		String CPF = request.getParameter("cpf");
		String endereco = request.getParameter("endereco");
		String numeroEndereco = request.getParameter("numeroEndereco");
		String bairro = request.getParameter("bairro");
		String CEP = request.getParameter("cep");
		String nomeCidade = request.getParameter("nomeCidade");
		String nomeEstado = request.getParameter("nomeEstado");
		String usuEmail = request.getParameter("usuEmail");
		
		//Usuario usuario = new Usuario(nome, usuEmail, CPF, endereco, dataNascimento, numeroEndereco,
	    //	CEP, nomeEstado, nomeCidade, bairro);
		
		System.out.println(nome);
		System.out.println(usuEmail);
		System.out.println(CPF);
		System.out.println(endereco);
		System.out.println(dataNascimento);
		System.out.println(numeroEndereco);
		System.out.println(CEP);
		System.out.println(nomeEstado);
		System.out.println(nomeCidade);
		System.out.println(bairro);
	}

}
