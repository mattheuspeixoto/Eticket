package paginas;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Redirect;

import Banco.ConexaoDB;
import classe.Contato;
import classe.Pessoa;

/**
 * Servlet implementation class CadContato
 */
@WebServlet("/CadContato")
public class SevletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletContato() {
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
	
		String nome     = request.getParameter("nomeContato");
		String email    = request.getParameter("emailContato");
		String cidade   = request.getParameter("cidade");
		String estado   = request.getParameter("estado");
		String assunto  = request.getParameter("assunto");
		String mensagem = request.getParameter("mensagem");
		
		Contato c = new Contato(nome, email, cidade, assunto, mensagem, estado);
		try{
		ConexaoDB db = new ConexaoDB();
		db.conectar();
		
		
	      	 PreparedStatement pst = db.conn.prepareStatement("insert into contato(nome,cidade,estado,email,assunto,mensagem)values(?,?,?,?,?,?)");
	      	 pst.setString(1,nome);
	      	 pst.setString(2,email);
	      	 pst.setString(3,cidade);
	      	 pst.setString(4,estado);
	      	 pst.setString(5,assunto);
	      	 pst.setString(6,mensagem);
	      	 pst.executeUpdate();
	      	 System.out.println( "Salvo com Sucesso ");         	         
	    }catch (SQLException e1) {
	      	    System.out.println("Erro ao Salvar"+e1);
	      	    e1.printStackTrace();}
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
		
	/*	System.out.println(nome);
		System.out.println(email);
		System.out.println(estado);
		System.out.println(cidade);
		System.out.println(assunto);
		System.out.println(mensagem);
	*/
	

			
		  
		
	
		
	}

	
	
}
