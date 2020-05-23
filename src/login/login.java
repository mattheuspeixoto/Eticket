package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import Banco.ConexaoDB;
import classe.Usuario;

/**
 * Servlet implementation class login
 */
@WebServlet("/login.do")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession(false);
		String op = request.getParameter("operacao");
		if(sessao!= null){
			if("logout".equals(op)){
				sessao.invalidate();
			   }
			response.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nome = request.getParameter("login");
		String senha = request.getParameter("password");
		try{
			ConexaoDB db = new ConexaoDB();
			db.conectar();/*
			String sql = "select * from login where usuario=? and senha=?";
			PreparedStatement pst = db.conn.prepareStatement(sql);
			pst.setString(1, nome);
			pst.setString(2,senha);
			db.rs = pst.executeQuery();
			if(db.rs.next()){ */
		
				if(nome.equals("mat")&&senha.equals("mat")){	    	
					//JOptionPane.showMessageDialog(null, "ok");
					HttpSession session=request.getSession();
					if(session != null){
						session.setAttribute("usuariologado", new Usuario(nome, senha));
						request.getRequestDispatcher("home.jsp").forward(request, response);
						System.out.println(request.getRemoteAddr());
					}	
				
				}else{
					response.setContentType("text/html");
					request.setAttribute("erro", "Usuario/Senha Invalido");
					request.getRequestDispatcher("login.jsp").forward(request, response);
 	 //  }
			}
		}catch(Exception e){
			System.out.println("Erro ao conectar: "+e.getMessage());
			}
	}}
		
	
	
