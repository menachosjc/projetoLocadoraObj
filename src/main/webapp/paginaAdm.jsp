
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
  
if(request.getSession().getAttribute("usuarioGrupoId") == "2" || request.getSession().getAttribute("usuarioGrupoId") == null ){
%>
    <script type="text/javascript">
       window.location.replace("index.jsp");
    </script>
<%}
%>

 

<!doctype html>
<html lang="pt-br">

    <head>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="assets/js/node_modules/jquery/dist/jquery.js"></script>
        <script src="assets/js/node_modules/popper.js/dist/umd/popper.js"></script>
        <script src="assets/css/node_modules/bootstrap/dist/js/bootstrap.js"></script>

         <!-- Script  -->
        <script type="text/javascript" src="assets/js/acoes.js"></script>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="assets/css/node_modules/bootstrap/compiler/bootstrap.css">

        <!-- Local CSS -->
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- Font Awesome-->
        <link rel="stylesheet" href="assets/images/icons/node_modules/font-awesome/css/font-awesome.css">

        <!-- JqueryMask -->
        <script type="text/javascript" src="assets/js/jquery.mask.min.js"></script>
        <!-- Bootstrap Notify -->
        <script type="text/javascript" src="assets/js/bootstrap-notify.min.js"></script>



        <title>Car</title>
    </head>

    <body>
            <%
  
if(request.getSession().getAttribute("usuarioGrupoId") == "1"){
%>
    <script type="text/javascript">
        $(document).ready(function () {
           
            $('#botaoFazerLoginUsuario').hide();
            $('#botaoCadastrarUsuario').hide();

            $('#botaoFazerLogoutUsuario').show();
            $('#botaoContaUsuario').show();
      });

       
    </script>
<%}
%>
        <nav class="navbar navbar-expand-lg navbar-light bg-warning">

            <div class="container">
            
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSite">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSite">
                    <ul class="navbar-nav mr-auto">
                       
                        <li class="nav-item">
                            <a class="nav-link" href="#">Usuários</a>
                        </li>

                  
                    </ul>

                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="navDrop">
                                Login
                            </a>

                             <div class="dropdown-menu">
                                <a class="dropdown-item" id="botaoFazerLoginUsuario" style="display:block" href="#" data-toggle="modal" data-target="#siteModal">Fazer Login</a>
                                <a class="dropdown-item" id="botaoCadastrarUsuario" style="display:block"  href="#" data-toggle="modal" data-target="#siteModalCadastro">Cadastro</a>

                                <a class="dropdown-item" id="botaoFazerLogoutUsuario"   style="display:none" href="logout.jsp">Sair</a>
                                <a class="dropdown-item" id="botaoContaUsuario" style="display:none" href="#">Minha conta</a>
                            </div>
                        </li>
                    </ul>
                  
                </div>
            </div>

        </nav>

        <div class="container">
            <br>
            <div class="row">
                <div class="col-md-2">
                    <button class="btn btn-primary" data-toggle="modal" data-target="#modalCadastrarCarro">
                        Cadastrar carro
                    </button>
                </div>   
            </div>
            <br>
                
              
           <div class="table-responsive">
            
            <table class="table" id="tabelaCarrosAluguel">
                 <thead>
                    <tr>
                        <th scope="col">Status</th>
                        <th scope="col">ID</th>
                        <th scope="col">Placa</th>
                        <th scope="col">Marca</th>
                        <th scope="col">Modelo</th>
                        <th scope="col">Ano</th>
                        <th scope="col">Cor</th>
                        <th scope="col">Combustivel</th>
                        <th scope="col">Quilometragem</th>
                        <th scope="col">Capacidade</th>
                        <th scope="col">Ações</th>
                    </tr>
                </thead>
                
                <tbody>
             
                    
                </tbody>
                
           
                
                
            </table>
               
           </div>
        </div>

      
     
       <!-- Modal Cadastrar Carro para alugar -->
         <div class="modal fade" id="modalCadastrarCarro" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="modal-title">Cadastro Carro</h3>
                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">

                        <div class="form-row">

                            <div class="form-group col-sm-4">
                                <input name="placa" type="text" class="form-control" id="placa" placeholder="Placa">
                            </div>

                            <div class="form-group col-sm-4">
                                <input name="marca" type="marca" class="form-control" id="marca" placeholder="Marca">
                            </div>
                            <div class="form-group col-sm-4">
                                <input name="modelo" type="text" class="form-control" id="modelo" placeholder="Modelo">
                                
                            </div>
                        </div>
                               
                                           
                  

                        <div class="form-row">

                            <div class="form-group col-sm-4">
                                <input name="ano" type="text" class="form-control" id="ano" placeholder="Ano">
                            </div>
                            
                             <div class="form-group col-sm-4">
                                <input name="cor" type="text" class="form-control" id="cor" placeholder="Cor">
                            </div>

                            <div class="form-group col-sm-4">
                                <input name="combustivel" type="text" class="form-control" id="combustivel" placeholder="Combustivel">
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-sm-4">
                                <input name="quilometragem" type="text" class="form-control" id="quilometragem" placeholder="Quilometragem">
                            </div>
                            
                            <div class="form-group col-sm-4">
                                <input name="capacidade" type="text" class="form-control" id="capacidade" placeholder="Capacidade">
                            </div>
                        </div>

                     

                        


                        <div class="modal-footer">
                            <input id="cadastrarCarro" type="submit"  class="btn btn-success" value="Cadastrar">

                        </div>




                    </div>


                </div>
            </div>
        </div>
       
       <!-- modalAlterarCarro -->
       
       
           <div class="modal fade" id="modalAlterarCarro" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="modal-title">Alterar Carro ID: <label id="idAlterar"></label></h3>
                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">

                        <div class="form-row">

                            <div class="form-group col-sm-4">
                                <input name="placa" type="text" class="form-control" id="placaAlterar" placeholder="Placa">
                            </div>

                            <div class="form-group col-sm-4">
                                <input name="marca" type="marca" class="form-control" id="marcaAlterar" placeholder="Marca">
                            </div>
                            <div class="form-group col-sm-4">
                                <input name="modelo" type="text" class="form-control" id="modeloAlterar" placeholder="Modelo">
                                
                            </div>
                        </div>
                               
                                           
                  

                        <div class="form-row">

                            <div class="form-group col-sm-4">
                                <input name="ano" type="text" class="form-control" id="anoAlterar" placeholder="Ano">
                            </div>
                            
                             <div class="form-group col-sm-4">
                                <input name="cor" type="text" class="form-control" id="corAlterar" placeholder="Cor">
                            </div>

                            <div class="form-group col-sm-4">
                                <input name="combustivel" type="text" class="form-control" id="combustivelAlterar" placeholder="Combustivel">
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-sm-4">
                                <input name="quilometragemAlterar" type="text" class="form-control" id="quilometragemAlterar" placeholder="Quilometragem">
                            </div>
                            
                            <div class="form-group col-sm-4">
                                <input name="capacidade" type="text" class="form-control" id="capacidadeAlterar" placeholder="Capacidade">
                            </div>
                        </div>

                     

                        


                        <div class="modal-footer">
                            <input id="alterarCarroFinal" type="submit"  class="btn btn-primary" value="Alterar">

                        </div>




                    </div>


                </div>
            </div>
        </div>
       
       <!--Modal Cadastro Sucesso -->

        <div class="modal fade" id="modalCadastroCarroSucesso" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">

                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">

                        <h4 style="text-align: center">Carro cadastrado com sucesso !</h4>
                    </div>



                </div>
            </div>
        </div>
       
        <!--Modal Alterar Carro Sucesso -->

        <div class="modal fade" id="modalAlterarCarroSucesso" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">

                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">

                        <h4 style="text-align: center">Carro alterado com sucesso !</h4>
                    </div>



                </div>
            </div>
        </div>
       


        
    </div>




</body>

</html>