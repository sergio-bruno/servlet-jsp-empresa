package br.com.slbruno.exemplo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.slbruno.exemplo.model.Empresa;
import br.com.slbruno.exemplo.service.Banco;

//oi		
@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// método service de uma HttpServlet: lida com GET e POST
	// doGet - só GET
	// do Post - só POST
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		String endereco = request.getParameter("endereco");
		String contato = request.getParameter("contato");
		String telefone = request.getParameter("telefone");
		
		
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		empresa.setCnpj(cnpj);
		empresa.setEndereco(endereco);
		empresa.setContato(contato);
		empresa.setTelefone(telefone);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
/*		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Empresa cadastrada: "+empresa.getNome());
		out.println("</body>");
		out.println("</html>");
*/	
		
		RequestDispatcher rd = request.getRequestDispatcher("/NovaEmpresaCriada.jsp");
        request.setAttribute("empresa", empresa.getNome());
        rd.forward(request, response);
	}
	
}