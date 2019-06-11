
<%@page contentType="text/html" pageEncoding="UTF-8"%>



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

            if (request.getSession().getAttribute("usuarioGrupoId") == "2") {
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
        
         <%

            if (request.getSession().getAttribute("usuarioGrupoId") != "2") {
        %>
        <script type="text/javascript">
            $(document).ready(function () {

                usuarioGrupoId = 0;
           
            });


        </script>
        <%}
        %>

        <nav class="navbar navbar-expand-lg navbar-light bg-warning">

            <div class="container">
                <!--
                <a class="navbar-brand" href="#">
                   <img src="assets/images/logo.png" width="100" height="100" class="img-fluid d-block" alt="Logo">
                  
                   Logo
                </a>
                -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSite">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSite">
                    <ul class="navbar-nav mr-auto">
                        <!--
                        <li class="nav-item">
                            <a class="nav-link" href="#">Inicio</a>
                        </li>
                        -->

                        <li class="nav-item">
                            <a class="nav-link" href="#" data-toggle="modal" data-target="#siteModalContato">Contato</a>
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
                    <!--
                    <form action="" class="form-inline">
                        <input class="form-control ml-4 mr-4" type="search" placeholder="Buscar...">
                        <button class="btn btn-dark" type="submit">Ok</button>
                    </form>
    
                    -->
                </div>
            </div>

        </nav>

        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <img src="assets/images/logo.png" width="100" height="100" class="img-fluid d-block" alt="Logo">
                </div>
            </div>

            <div class="row justify-content-center mb-5">
                <div class="col-sm-12 col-md-10 col-lg-8">
                  
                        <div class="form-row">
                            <div class="form-group col-sm-6">

                               <!-- <input type="text" class="form-control" id="#inputLocalRetirada" placeholder="Digite o local de retirada">-->
                                 <select name="localRetirada" id="localRetirada" class="form-control">
                                    <option selected>Escolha o local de retirada</option>
                                    <option value='1'>São José dos Campos</option>
                                    <option value='2'>São Paulo</option>
                                </select>
                            </div>

                            <div class="form-group col-sm-3">

                                <input type="date" class="form-control" id="#inputDataRetirada" placeholder="Data">
                                
                            </div>

                            <div class="form-group col-sm-2">

                                <input type="time" class="form-control" id="#inputHoraRetirada" placeholder="Hora">

                            </div>

                            <div class="form-group col-sm-6">

                                <!--<input type="text" class="form-control" id="#inputLocalDevolucao" placeholder="Digite o local de devolução">-->
                                    <select name="localDevolucao" id="localDevolucao" class="form-control">
                                    <option selected>Escolha o local de devolução</option>
                                    <option value='1'>São José dos Campos</option>
                                    <option value='2'>São Paulo</option>
                                </select>
                            </div>

                            <div class="form-group col-sm-3">

                                <input type="date" class="form-control" id="#inputDataDevolucao" placeholder="Data">

                            </div>

                            <div class="form-group col-sm-2">

                                <input type="time" class="form-control" id="#inputHoraDevolucao" placeholder="Hora">

                            </div>






                        </div>

                        <div class="form-row">
                            <div class="col-sm-12">
                                <button id="botaoBuscarReserva" type="submit" class="btn btn-primary" style="float: right;">Buscar</button>
                            </div>
                        </div>
               
                </div>
            </div>
        </div>

        <div id="carouselSite" class="carousel slide" data-ride="carousel">

            <ol class="carousel-indicators">
                <li data-target="#carouselSite" data-slide-to="0" class="active"></li>
                <li data-target="#carouselSite" data-slide-to="1"></li>
                <li data-target="#carouselSite" data-slide-to="2"></li>
                <li data-target="#carouselSite" data-slide-to="3"></li>
            </ol>

            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="assets/images/slide_1_carro.jpg" class="img-fluid d-block" style="margin: 0 auto;">


                </div>

                <div class="carousel-item">
                    <img src="assets/images/slide_2_carro.jpg" class="img-fluid d-block" style="margin: 0 auto;">


                </div>

                <div class="carousel-item">
                    <img src="assets/images/slide_3_carro.jpg" class="img-fluid d-block" style="margin: 0 auto;">


                </div>

                <div class="carousel-item">
                    <img src="assets/images/slide_4_carro.jpg" class="img-fluid d-block" style="margin: 0 auto;">


                </div>
            </div>

            <a class="carousel-control-prev" href="#carouselSite" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
                <span class="sr-only">Anterior</span>
            </a>

            <a class="carousel-control-next" href="#carouselSite" role="button" data-slide="next">
                <span class="carousel-control-next-icon"></span>
                <span class="sr-only">AvanÃ§ar</span>
            </a>

        </div>

        <div class="row">
            <div class="col-12 mb-3">
                <hr>
            </div>

            <div class="col-sm-4">


            </div>

            <div class="col-sm-4">

            </div>

        </div>

        <!--Modal Login -->

        <div class="modal fade" id="siteModal" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-md" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="modal-title">Login</h3>
                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">
                        <form action="loginComumController" method="post">

                            <input id="emailLogin" type="text" value="" name="emailLogin" placeholder="Digite o seu email" class="form-control">
                            <span class="red-text accent-4" id="resultadoLogin"></span>
                            <br>
                            <input id="senhaLogin" type="password" value="" name="senhaLogin" placeholder="Digite a sua senha" class="form-control">
                            <span class="red-text accent-4" id="resultadoErroLogin"></span>
                            <div class="modal-footer">
                                <span><a href=""> Esqueceu sua senha?</a></span>

                                <input id="loginUsuario" type="submit"  class="btn btn-success" value="Acessar">
                            </div>
                            
                            <%
                                if (request.getSession().getAttribute("erro") == "erro") {
                            %>
                            <script type="text/javascript">
                                $(document).ready(function () {
                                    $('#resultadoErroLogin').html("Senha incorreta");
                         

                                });


                            </script>
                            <%}
                            %>
                           
                        </form>

                    </div>



                </div>
            </div>
        </div>

        <!--Modal Cadastro -->

        <div class="modal fade" id="siteModalCadastro" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="modal-title">Cadastro</h3>
                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">

                        <div class="form-row">

                            <div class="form-group col-sm-6">
                                <input name="nome" type="text" class="form-control" id="nome" placeholder="Nome">
                            </div>

                            <div class="form-group col-sm-6">
                                <input name="sobrenome" type="text" class="form-control" id="sobrenome" placeholder="Sobrenome">
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-sm-12">
                                <input name="email" type="email" class="form-control" id="email" placeholder="E-mail">
                                <span class="red-text accent-4" id="resultado"></span>
                            </div>

                        </div>

                        <div class="form-row">

                            <div class="form-group col-sm-6">
                                <input name="senha" type="password" class="form-control" id="senha" placeholder="Senha">
                            </div>

                        </div>

                        <div class="form-row">
                            <div class="form-group col-sm-12">
                                <input name="endereco" type="text" class="form-control" id="endereco" placeholder="Endereço">
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-sm-6">
                                <input name="cidade" type="text" class="form-control" id="cidade" placeholder="Cidade">
                            </div>

                            <div class="form-group col-sm-4">
                                <select name="estado" id="estado" class="form-control">
                                    <option selected>Escolha...</option>
                                    <option>AC</option>
                                </select>
                            </div>

                            <div class="form-group col-sm-2">
                                <input name="cep" type="text" class="form-control" id="cep" placeholder="CEP">
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-sm-12">
                                <div class="form-check">
                                    <label class="form-check-label" for="">
                                        <input class="form-check-input" type="checkbox">
                                        Aceitar os termos
                                    </label>
                                </div>
                            </div>
                        </div>


                        <div class="modal-footer">
                            <input id="cadastrarUsuario" type="submit"  class="btn btn-success" value="Enviar">

                        </div>




                    </div>


                </div>
            </div>
        </div>

        <!--Modal Cadastro Sucesso -->

        <div class="modal fade" id="siteModalCadastroSucesso" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">

                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">

                        <h4 style="text-align: center">Cadastro efetuado com sucesso !</h4>
                    </div>



                </div>
            </div>
        </div>

        <!--Modal Contato -->

        <div class="modal fade" id="siteModalContato" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Atendimento ao Cliente</h4>


                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">
                        <p>
                            <strong>Central de Reservas:<br>Telefone: 0800 555 5456</strong>
                            <br>
                            24 horas
                            <br><br>
                            <strong>Comunicação de Roubo ou Furto/ Assistência 24h/ Manutenção:
                                <br>
                                Telefone: 0800 444 4141
                                <br><br>
                                Central de Relacionamento (SAC):
                                <br>
                                Telefone: 0800 888 0829
                                <br>
                            </strong>
                            Horário: Segunda a sábado das 08h às 18h, exceto feriados nacionais.<br><br>
                            <strong>
                                Nos envie um e-mail com sugestões, reclamações e elogios:
                            </strong>
                        </p>

                        <form action="loginUsuario" method="post">

                            <div class="form-row">

                                <div class="form-group col-sm-6">
                                    <input type="text" class="form-control" id="inputNomeCompleto" placeholder="Nome Completo">
                                </div>

                                <div class="form-group col-sm-6">
                                    <input type="email" class="form-control" id="inputEmail" placeholder="E-mail">
                                </div>
                            </div>

                            <div class="form-row">

                                <div class="form-group col-sm-6">
                                    <input type="text" class="form-control" id="inputTelefone" placeholder="Telefone">
                                </div>

                                <div class="form-group col-sm-6">
                                    <select id="inputTipoTelefone" class="form-control">
                                        <option selected>Celular</option>
                                        <option>Residencial</option>
                                        <option>Comercial</option>
                                    </select>
                                </div>
                            </div>

                            <div class="form-row">
                                <div class="form-group col-sm-6">
                                    <select id="inputAreaContato" class="form-control">

                                        <option value="sugestoes-elogios-reclamacoes">Sugestões, elogios ou reclamações</option>
                                        <option value="marketing">Marketing</option>
                                        <option value="imprensa">Imprensa</option>
                                        <option value="recursos-humanos">Recursos Humanos</option>
                                        <option value="financeiro">Financeiro</option>
                                        <option value="reservas">Reserva</option>
                                        <option value="cotacao">Cotação</option>
                                        <option value="franquias">Franquias</option>
                                        <option value="novo-cliente-cnpj">Cadastro de Novos Clientes de CNPJ</option>

                                    </select>
                                </div>

                                <div class="form-group col-sm-6">
                                    <input type="text" class="form-control" id="inputAssunto" placeholder="Assunto">
                                </div>


                            </div>

                            <div class="form-row">

                                <div class="form-group col-sm-12"></div>
                                <textarea style="height: 200px; width: 100%;" name="texto" class="form-control" placeholder="Digite sua mensagem..."></textarea>
                            </div>
                    </div>





                    </form>

                    <div class="modal-footer">
                        <button  type="submit" class="btn btn-success" data-dismiss="modal">
                            Enviar
                        </button>
                    </div>

                </div>


            </div>
        </div>
    </div>




</body>

</html>