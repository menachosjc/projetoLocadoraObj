/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.51
 * Generated at: 2019-06-11 05:26:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paginaAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

  
if(request.getSession().getAttribute("usuarioGrupoId") == "2" || request.getSession().getAttribute("usuarioGrupoId") == null ){

      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("       window.location.replace(\"index.jsp\");\n");
      out.write("    </script>\n");
}

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"assets/js/node_modules/jquery/dist/jquery.js\"></script>\n");
      out.write("        <script src=\"assets/js/node_modules/popper.js/dist/umd/popper.js\"></script>\n");
      out.write("        <script src=\"assets/css/node_modules/bootstrap/dist/js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("         <!-- Script  -->\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/acoes.js\"></script>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/node_modules/bootstrap/compiler/bootstrap.css\">\n");
      out.write("\n");
      out.write("        <!-- Local CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/images/icons/node_modules/font-awesome/css/font-awesome.css\">\n");
      out.write("\n");
      out.write("        <!-- JqueryMask -->\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery.mask.min.js\"></script>\n");
      out.write("        <!-- Bootstrap Notify -->\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/bootstrap-notify.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Car</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("            ");

  
if(request.getSession().getAttribute("usuarioGrupoId") == "1"){

      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("           \n");
      out.write("            $('#botaoFazerLoginUsuario').hide();\n");
      out.write("            $('#botaoCadastrarUsuario').hide();\n");
      out.write("\n");
      out.write("            $('#botaoFazerLogoutUsuario').show();\n");
      out.write("            $('#botaoContaUsuario').show();\n");
      out.write("      });\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </script>\n");
}

      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-warning\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("            \n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSite\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSite\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                       \n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Usuários</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" id=\"navDrop\">\n");
      out.write("                                Login\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                             <div class=\"dropdown-menu\">\n");
      out.write("                                <a class=\"dropdown-item\" id=\"botaoFazerLoginUsuario\" style=\"display:block\" href=\"#\" data-toggle=\"modal\" data-target=\"#siteModal\">Fazer Login</a>\n");
      out.write("                                <a class=\"dropdown-item\" id=\"botaoCadastrarUsuario\" style=\"display:block\"  href=\"#\" data-toggle=\"modal\" data-target=\"#siteModalCadastro\">Cadastro</a>\n");
      out.write("\n");
      out.write("                                <a class=\"dropdown-item\" id=\"botaoFazerLogoutUsuario\"   style=\"display:none\" href=\"logout.jsp\">Sair</a>\n");
      out.write("                                <a class=\"dropdown-item\" id=\"botaoContaUsuario\" style=\"display:none\" href=\"#\">Minha conta</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <button class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modalCadastrarCarro\">\n");
      out.write("                        Cadastrar carro\n");
      out.write("                    </button>\n");
      out.write("                </div>   \n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("           <div class=\"table-responsive\">\n");
      out.write("            \n");
      out.write("            <table class=\"table\" id=\"tabelaCarrosAluguel\">\n");
      out.write("                 <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">Status</th>\n");
      out.write("                        <th scope=\"col\">ID</th>\n");
      out.write("                        <th scope=\"col\">Placa</th>\n");
      out.write("                        <th scope=\"col\">Marca</th>\n");
      out.write("                        <th scope=\"col\">Modelo</th>\n");
      out.write("                        <th scope=\"col\">Ano</th>\n");
      out.write("                        <th scope=\"col\">Cor</th>\n");
      out.write("                        <th scope=\"col\">Combustivel</th>\n");
      out.write("                        <th scope=\"col\">Quilometragem</th>\n");
      out.write("                        <th scope=\"col\">Capacidade</th>\n");
      out.write("                        <th scope=\"col\">Ações</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("             \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("     \n");
      out.write("       <!-- Modal Cadastrar Carro para alugar -->\n");
      out.write("         <div class=\"modal fade\" id=\"modalCadastrarCarro\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h3 class=\"modal-title\">Cadastro Carro</h3>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                            <span>&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"placa\" type=\"text\" class=\"form-control\" id=\"placa\" placeholder=\"Placa\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"marca\" type=\"marca\" class=\"form-control\" id=\"marca\" placeholder=\"Marca\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"modelo\" type=\"text\" class=\"form-control\" id=\"modelo\" placeholder=\"Modelo\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                               \n");
      out.write("                                           \n");
      out.write("                  \n");
      out.write("\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"ano\" type=\"text\" class=\"form-control\" id=\"ano\" placeholder=\"Ano\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                             <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"cor\" type=\"text\" class=\"form-control\" id=\"cor\" placeholder=\"Cor\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"combustivel\" type=\"text\" class=\"form-control\" id=\"combustivel\" placeholder=\"Combustivel\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"quilometragem\" type=\"text\" class=\"form-control\" id=\"quilometragem\" placeholder=\"Quilometragem\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"capacidade\" type=\"text\" class=\"form-control\" id=\"capacidade\" placeholder=\"Capacidade\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                     \n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input id=\"cadastrarCarro\" type=\"submit\"  class=\"btn btn-success\" value=\"Cadastrar\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("       <!-- modalAlterarCarro -->\n");
      out.write("       \n");
      out.write("       \n");
      out.write("           <div class=\"modal fade\" id=\"modalAlterarCarro\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h3 class=\"modal-title\">Alterar Carro ID: <label id=\"idAlterar\"></label></h3>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                            <span>&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"placa\" type=\"text\" class=\"form-control\" id=\"placaAlterar\" placeholder=\"Placa\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"marca\" type=\"marca\" class=\"form-control\" id=\"marcaAlterar\" placeholder=\"Marca\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"modelo\" type=\"text\" class=\"form-control\" id=\"modeloAlterar\" placeholder=\"Modelo\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                               \n");
      out.write("                                           \n");
      out.write("                  \n");
      out.write("\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"ano\" type=\"text\" class=\"form-control\" id=\"anoAlterar\" placeholder=\"Ano\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                             <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"cor\" type=\"text\" class=\"form-control\" id=\"corAlterar\" placeholder=\"Cor\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"combustivel\" type=\"text\" class=\"form-control\" id=\"combustivelAlterar\" placeholder=\"Combustivel\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"quilometragemAlterar\" type=\"text\" class=\"form-control\" id=\"quilometragemAlterar\" placeholder=\"Quilometragem\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group col-sm-4\">\n");
      out.write("                                <input name=\"capacidade\" type=\"text\" class=\"form-control\" id=\"capacidadeAlterar\" placeholder=\"Capacidade\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                     \n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input id=\"alterarCarroFinal\" type=\"submit\"  class=\"btn btn-primary\" value=\"Alterar\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("       <!--Modal Cadastro Sucesso -->\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"modalCadastroCarroSucesso\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                            <span>&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <h4 style=\"text-align: center\">Carro cadastrado com sucesso !</h4>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <!--Modal Alterar Carro Sucesso -->\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"modalAlterarCarroSucesso\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                            <span>&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <h4 style=\"text-align: center\">Carro alterado com sucesso !</h4>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}