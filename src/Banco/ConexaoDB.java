package Banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexaoDB {
    
	public  Statement stm ; // Realiza pesquisas no DB
	public  ResultSet rs;  //Armazena o resultado da pesquisa     
	private String driver = "com.mysql.jdbc.Driver"; // Responsavel por identificar o DB
        private String caminho = "jdbc:mysql://localhost:3306/eticket"; // Responsavel por Setar o local do DB
        private String usuario = "postgres";
        private String senha = "mattheus";
        public Connection conn; // Realiza a Conexao com o DB
          

 // Metodo responsavel pela conexao	
    public void conectar() throws SQLException { 
    	try {
    		System.setProperty("jdbc.Drivers", driver); // Seta a propriedade do drive de conexao 
    		Class.forName(driver); 
    		conn= DriverManager.getConnection(caminho, usuario, senha); // Realiza a conexao com o DB
    	    JOptionPane.showMessageDialog(null,"Conectado com Sucesso");
    		}
		catch (SQLException e) {
			throw new SQLException(e.getMessage());
	   }catch (ClassNotFoundException e) {
			throw new ClassCastException(e.getMessage());}
			
		
	}       

// Desconecta o Banco
    public void desconectar (){
    	try {
    		conn.close();
    		JOptionPane.showMessageDialog(null, "Desconectado com Sucesso");} 
    	catch (SQLException e) {
    		JOptionPane.showMessageDialog(null, "Erro ao Desconectar \n ");
    		e.printStackTrace();}
    }




}
