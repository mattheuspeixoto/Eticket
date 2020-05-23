package vendas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classe.VendShow;

/**
 * Servlet implementation class VendaShow
 */
@WebServlet("/VendaShow")
public class VendaShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendaShow() {
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
		String atracao = request.getParameter("selecaoShow");
		String area = request.getParameter("area");
		
		VendShow vendShow = new VendShow(atracao,area);
		
		request.setAttribute("vendaS", vendShow);
		request.getRequestDispatcher("confshow.jsp").forward(request,response);
		
		
	}

}
