package br.com.slbruno.exemplo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.slbruno.exemplo.model.Empresa;
import br.com.slbruno.exemplo.service.Banco;

/**
*Servlet implementation class ListaEmpresasSerlvet
*/
@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
    * @see HttpServlet#HttpServlet()
    */
    public ListaEmpresasServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 

            Banco banco = new Banco();
            List<Empresa> lista = banco.getEmpresas();

            request.setAttribute("empresas", lista);

            RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas.jsp");
            rd.forward(request,response);
      
    }
} 