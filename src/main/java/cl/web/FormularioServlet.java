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

        String mensaje;
        int edad = -1;

        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            // Ignorar, se validará más abajo
        }

        if (nombre == null || nombre.trim().isEmpty()) {
            mensaje = "El nombre no puede estar vacío.";
        } else if (edad < 0) {
            mensaje = "La edad debe ser un número válido.";
        } else {
            mensaje = "Formulario enviado correctamente.";
        }

        request.setAttribute("nombre", nombre);
        request.setAttribute("edad", edadStr);
        request.setAttribute("mensaje", mensaje);

        request.getRequestDispatcher("/resultado.jsp").forward(request, response);
	}

}
