package cl.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class FormularioServlet
 */
@WebServlet("/procesar")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
        String edadStr = request.getParameter("edad");

        int edad = -1;

        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            // Ignorar, se validará más abajo
        }

        if (nombre == null || nombre.trim().isEmpty()) {
            request.setAttribute("error", "El nombre no puede estar vacío.");
            request.getRequestDispatcher("/formulario.jsp").forward(request, response);
            return;
        }
        if (edad < 0) {
            request.setAttribute("error", "La edad debe ser un número válido.");
            request.getRequestDispatcher("/formulario.jsp").forward(request, response);
            return;
        }

        request.setAttribute("nombre", nombre);
        request.setAttribute("edad", edadStr);
        request.setAttribute("mensaje", "Formulario enviado correctamente.");

        request.getRequestDispatcher("/resultado.jsp").forward(request, response);
	}

}
