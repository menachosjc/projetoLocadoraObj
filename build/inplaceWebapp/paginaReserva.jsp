
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

       
                <div class="col-sm-12 col-md-10 col-lg-8">

                    <div class="row">
                        <div class="col-lg9 col-md-8">
                            <h4> Reservar Carro</h4>
                            <div class="content-steps">

                            </div>
                            <div><h2>Escolha o veículo</h2></div>

                            <form role="form" method="POST" action="">

                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <div class="row">

                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6"></div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6"></div>


                                    </div>

                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 center-vertical">
                                        <img src="https://prdmovida.blob.core.windows.net/public/imagens/cars/t3_grupo_AX.jpg" class="img-responsive">
                                    </div>

                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 text-right">
                                        <div class="selConteudoSelecao col-xs-8 col-sm-10 pull-right text-center">
                                            
                                            <div class="price semi-bold">
                                                <span>R$</span>
                                                76,37
                                            </div>
                                            
                                            <div class="tipoDiaria">DIÁRIA COM KM LIVRE</div>
                                            
                                            <input type="radio" value="Mobi Like, ou similar" name="nome">
                                            <input type="radio" value="ECMM" name="codigo">
                                            <input type="radio" value="PF44B" name="tarifa">

                                            <div class="row">
                                                <button>PAGAR AGORA</button>
                                            </div>

                                          
                                        </div>
                                        
                                       
                                    </div>



                                </div>

                            </form>


                        </div>





                    </div>


                    <div class="col-sm-12">
                        <button id="botaoFecharReserva" type="submit" class="btn btn-primary" style="float: right;">Reservar</button>
                    </div>




                </div>
        
        </div>

       


    </div>




</body>

</html>