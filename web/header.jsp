
<header>  
    <div class="logins">
        <%  if(session.getAttribute("name") == null) {%>
        <a href="loginScreen" >Iniciar sesión</a>
        <a href="registerScreen">Registrarse</a>
        <% } else{ %>
        Bienvenido 
        <%=session.getAttribute("name")%><%}%>
        
    </div>
    <h1>ArquiCV</h1><hr>
    <nav>
        <ul>
            <li><a title="PaginaPrincipal" href="PaginaPrincipal.jsp">Página principal</a></li>
            <li><a title="AcercaDeArquiCV" href="AcercaDeArquiCV.jsp">Acerca de ArquiCV</a></li>
            <li><a title="Documentos" href="#">Documentos</a></li>
            <li><a title="Ventajas" href="Ventajas.jsp">Ventajas</a></li>
            <li><a title="Recursos" href="Recursos.jsp">Recursos</a></li>
            <li><a title="Social" href="#">Social</a></li>
        </ul>
    </nav>
</header>