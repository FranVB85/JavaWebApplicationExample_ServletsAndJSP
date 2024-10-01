package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {

		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();

		// Obtener parámetros del formulario
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");

		// Manejo básico de posibles valores nulos o vacíos
		if (fname == null) fname = "";
		if (lname == null) lname = "";

		// Añadir atributos al request para pasarlos a la JSP
		request.setAttribute("nombre", fname);
		request.setAttribute("apellido", lname);

		// Redirige a la página JSP de bienvenida
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/bienvenida.jsp");
		dispatcher.forward(request, response);

		/*
		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Actividad 1. Servlets</title></head>");
		out.println("<body>");
		out.println("<h1>Bienvenid@ "  + fname + " " + lname + " !!</h1>");
		out.println("</body></html>");
		 */
	}

}