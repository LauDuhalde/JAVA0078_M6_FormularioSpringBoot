# JAVA0078_M6_FormularioSpringBoot

Este proyecto es una aplicación **Spring Boot** que implementa un **formulario web con JSP y Bootstrap**, procesado a través de un **Servlet**. Permite ingresar un nombre y una edad, valida los datos y muestra un mensaje de confirmación o error según corresponda.

Se eligió **Spring Boot con Servlets y JSP** como base del proyecto, ya que permite aprovechar la estructura moderna y flexible de Spring Boot sin necesidad de usar controladores `@Controller`, manteniendo compatibilidad con Servlets tradicionales y vistas JSP.


---

## Tecnologías utilizadas

- **Java 21**
- **Spring Boot**
- **Jakarta Servlet API**
- **JSP (Java Server Pages)**
- **Bootstrap 5**
- **Maven**
- **Apache Tomcat (embebido)**

---

## Estructura simplificada del proyecto

```
JAVA0078_M6_FormularioSpringBoot
├──src/
│	└── main/
│  		 ├── java/
│  		 │   └── cl/web/
│  	 	 │       ├── Java0078M6FormularioSpringBootApplication.java
│  		 │       └── FormularioServlet.java
│  		 └── webapp/
│    		    ├── formulario.jsp
│    		    └── resultado.jsp
├── M6_AE1_ABPRO-Ejercicio grupal[Actividad Evaluada].pdf
├── pom.xml
└── README.md
```

---

## Ejecución del proyecto

1. Clonar el repositorio o copiar el proyecto en tu entorno de desarrollo (por ejemplo, **Spring Tool Suite** o **Eclipse**).  
2. Asegurarse de tener configurado **Java 21** y **Maven**.  
3. Ejecutar el proyecto desde la clase principal:

   ```bash
   Java0078M6FormularioSpringBootApplication.java
   ```

4. Abrir el navegador y acceder a:

   👉 [http://localhost:8080/formulario.jsp](http://localhost:8080/formulario.jsp)

---

## Descripción funcional

1. El usuario completa el formulario con su **nombre** y **edad**.  
2. El **FormularioServlet** procesa la información:
   - Valida que el nombre no esté vacío.
   - Verifica que la edad sea un número válido.
3. Si hay errores, el usuario vuelve al formulario con un mensaje de error.
4. Si todo es correcto, se muestra una página de resultado con el mensaje de éxito.

---

## Autor

- Andrea Correa
- Laura Duhalde  

---
