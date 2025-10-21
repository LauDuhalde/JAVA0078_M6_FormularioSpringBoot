<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="es-CL">
<head>
    <meta charset="UTF-8">
    <title>Formulario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex align-items-center justify-content-center vh-100">
<div class="card shadow p-4" style="width: 25rem;">
    <h3 class="text-center mb-3">Formulario</h3>
    <c:if test="${not empty error}">
        <div class="alert alert-danger" role="alert"><c:out value="${error}" /></div>
    </c:if>
    <form action="procesar" method="post">
        <div class="mb-3">
            <label for="nombre" class="form-label">Nombre:</label>
            <input type="text" class="form-control" id="nombre" name="nombre" required>
        </div>
        <div class="mb-3">
            <label for="edad" class="form-label">Edad:</label>
            <input type="text" class="form-control" id="edad" name="edad" required>
        </div>
        <button type="submit" class="btn btn-primary w-100">Enviar</button>
    </form>
</div>
</body>
</html>
