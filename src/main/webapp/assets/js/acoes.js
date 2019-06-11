var usuarioGrupoId = null;
var localRetirada = null;
var localDevolucao = null;
var dataRetirada = null;
var dataDevolucao = null;
var inputHoraRetirada = null;
var inputHoraDevolucao = null;




$(document).ready(function () {
    /*MASCARAS*/
    $("#cep").mask("00000-000");




    function listarCarros() {
        $.ajax({
            type: 'POST',
            dataType: 'json',
            url: "verificarAlugueisController",
            success: function (data) {
                $.each(data, function (i, item) {
                    if (item.status === 0) {
                        var valorStatus = 0;
                        item.status = 'Não alugado';

                    } else {
                        var valorStatus = 1;
                        item.status = 'Alugado';
                    }
                    $('#tabelaCarrosAluguel > tbody').append(
                            '<tr><td id="statusAluguelCarro" value=' + valorStatus + '>'
                            + item.status + '</td><td>' + item.id + '</td><td>'
                            + item.placa + '</td><td>' + item.marca + '</td><td>'
                            + item.modelo + '</td><td>' + item.ano + '</td><td>'
                            + item.cor + '</td><td>' + item.combustivel + '</td><td>'
                            + item.quilometragem + '</td><td>'
                            + item.capacidade + '</td><td>\n\
                                <button id="excluirCarro" value=' + item.id + ' class="btn btn-danger  btn-sm">Excluir</button>  \n\
                                <button id="alterarCarro" value=' + item.id + ' class="btn btn-primary  btn-sm">Alterar</button>\n\
                                <button id="finalizarContrato" value=' + item.id + ' class="btn btn-success  btn-sm">Finalizar</button>\n\
                             </td><tr>'

                            );


                });
            }
        });

    }

    listarCarros();


    $('#email').change(function () {
        var email = $('#email').val();

        $.ajax({
            type: 'POST',
            data: {email: email},
            url: 'ajaxController',
            success: function (data) {

                $("#resultado").html("Email indisponivel para cadastro").css("color", "red");
                $("#cadastrarUsuario").prop("disabled", true);



            },
            error: function () {
                $("#resultado").html("Email disponivel para cadastro").css("color", "green");
                $("#cadastrarUsuario").prop("disabled", false);
            }
        });

    });
/*
    $('#emailLogin').change(function () {
        var emailLogin = $('#emailLogin').val();

        $.ajax({
            type: 'POST',
            data: {emailLogin: emailLogin},
            url: 'ajaxLoginController',
            success: function (data) {


                $("#loginUsuario").prop("disabled", false);



            },
            error: function () {
                $("#resultadoLogin").html("Conta não cadastrada").css("color", "red");
                $("#loginUsuario").prop("disabled", true);
            }
        });

    });

*/
    $("#loginUsuario").click(function () {


        var emailLogin = $('#emailLogin').val();
        var senhaLogin = $('#senhaLogin').val();

        $.ajax({
            type: 'POST',

            data: {

                emailLogin: emailLogin,
                senhaLogin: senhaLogin
            },
            url: 'loginComumController',
            success: function (data) {








                //$(location).attr('href', 'http://www.google.com');
            },
            error: function () {

                $("#resultadoErroLogin").html("Senha incorreta").css("color", "red");
            }



        });


    });


    $("#cadastrarCarro").click(function () {

        var placa = $('#placa').val();
        var marca = $('#marca').val();
        var modelo = $('#modelo').val();
        var ano = $('#ano').val();
        var cor = $('#cor').val();
        var combustivel = $('#combustivel').val();
        var quilometragem = $('#quilometragem').val();
        var capacidade = $('#capacidade').val();

        $.ajax({
            type: 'POST',
            data: {
                placa: placa,
                marca: marca,
                modelo: modelo,
                ano: ano,
                cor: cor,
                combustivel: combustivel,
                quilometragem: quilometragem,
                capacidade: capacidade

            },
            url: 'cadastrarCarroController',
            success: function (data) {


                $("#modalCadastrarCarro").modal('hide');
                $("#modalCadastroCarroSucesso").modal('show');


                setTimeout(function () {
                    $("#modalCadastroCarroSucesso").modal('hide');
                    location.reload();
                }, 4000);


                //$(location).attr('href', 'http://www.google.com');
            },
            error: function () {

                alert("Erro no cadastro do carro");
            }



        });



    });


    $("#cadastrarUsuario").click(function () {

        var nome = $('#nome').val();
        var sobrenome = $('#sobrenome').val();
        var email = $('#email').val();
        var senha = $('#senha').val();
        var endereco = $('#endereco').val();
        var cidade = $('#cidade').val();
        var estado = $('#estado').val();
        var cep = $('#cep').val();

        $.ajax({
            type: 'POST',
            data: {
                nome: nome,
                sobrenome: sobrenome,
                email: email,
                senha: senha,
                endereco: endereco,
                cidade: cidade,
                estado: estado,
                cep: cep

            },
            url: 'usuarioController',
            success: function (data) {


                $("#siteModalCadastro").modal('hide');
                $("#siteModalCadastroSucesso").modal('show');


                setTimeout(function () {
                    $("#siteModalCadastroSucesso").modal('hide');
                    location.reload();
                }, 4000);



                //$(location).attr('href', 'http://www.google.com');
            },
            error: function () {

                alert("Erro no cadastro");
            }



        });



    });



    $(document).on('click', '#excluirCarro', function () {

        var idCarro = $(this).attr('value');
        var row = $(this).parent().parent();
        var r = confirm("Tem certeza que deseja excluir");

        if (r === true) {
            $.ajax({
                url: 'excluirCarroController',
                method: "POST",
                data: {"action": "excluirCarro", "idCarro": idCarro},
                success: function (data) {
                    row.remove();
                },
                error: function (error) {
                    console.log('erro em ajax');
                }

            });

        } else {
            alert('Atenção, não é possivel excluir carro alugado');

        }

    });



    $('#botaoBuscarReserva').click(function () {
        var localRetirada = $('#localRetirada').val();
        var localDevolucao = $('#localDevolucao').val();
        var dataRetirada = $('#inputDataRetirada').val();
        var dataDevolucao = $('#inputDataDevolucao').val();
        var inputHoraRetirada = $('#inputHoraRetirada').val();
        var inputHoraDevolucao = $('#inputHoraDevolucao').val();
        //VERIFICAR SE EXISTE ESSAS OPÇÔES NO BANCO, SE SIM TRAZER OS CARROS DISPONIVEIS 
        if (usuarioGrupoId === 0) {
            alert('Faça o login, clique em OK');
            $("#siteModal").modal('show');

        } else {

            $.ajax({
                type: 'POST',
                data: {
                    localRetirada: localRetirada,
                    localDevolucao: localDevolucao,
                    dataRetirada: dataRetirada,
                    dataDevolucao: dataDevolucao,
                    inputHoraRetirada: inputHoraRetirada,
                    inputHoraDevolucao: inputHoraDevolucao

                },
                url: 'reservarCarroController',

            });

        }


    });



    $(document).on('click', '#finalizarContrato', function () {

        var idCarro = $(this).attr('value');
        var row = $(this).parent().parent();
        var r = confirm("Tem certeza que deseja excluir");
        if (r === true) {
            $.ajax({
                url: 'excluirCarroController',
                method: "POST",
                data: {"action": "excluirCarro", "idCarro": idCarro},
                success: function (data) {
                    row.remove();
                },
                error: function (error) {
                    console.log('erro em ajax');
                }

            });

        } else {


        }

    });



    $(document).on('click', '#alterarCarro', function () {

        var idCarro = $(this).attr('value');


        $.ajax({
            url: 'listarDadosCarroController',
            method: "POST",
            data: {"action": "listarDadosCarro", "idCarro": idCarro},
            success: function (data) {
                $("#modalAlterarCarro").modal('show');

                data = $.parseJSON(data);
                console.log(data);
                console.log(data.ano);
                $('#idAlterar').text(data.id);
                $('#placaAlterar').val(data.placa);
                $('#marcaAlterar').val(data.marca);
                $('#modeloAlterar').val(data.modelo);
                $('#anoAlterar').val(data.ano);
                $('#corAlterar').val(data.cor);
                $('#combustivelAlterar').val(data.combustivel);
                $('#kilometragemAlterar').val(data.kilometragem);
                $('#capacidadeAlterar').val(data.capacidade);
       


            },
            error: function (error) {
                console.log('erro em ajax');
            }

        });









    });

    $(document).on('click', '#alterarCarroFinal', function () {
        var idCarro = $('#idAlterar').text();
        console.log(idCarro);
        var placaAlterar = $('#placaAlterar').val();
        var marcaAlterar = $('#marcaAlterar').val();
        var modeloAlterar = $('#modeloAlterar').val();
        var anoAlterar = $('#anoAlterar').val();
        var corAlterar = $('#corAlterar').val();
        var combustivelAlterar = $('#combustivelAlterar').val();
        var kilometragemAlterar = $('#kilometragemAlterar').val();
        var capacidadeAlterar = $('#capacidadeAlterar').val();
        $.ajax({
            url: 'alterarCarroController',
            method: "POST",
            data: {
                "idCarro": idCarro,
                "placaAlterar": placaAlterar,
                "marcaAlterar": marcaAlterar,
                "modeloAlterar": modeloAlterar,
                "anoAlterar": anoAlterar,
                "corAlterar": corAlterar,
                "combustivelAlterar": combustivelAlterar,
                "kilometragemAlterar": kilometragemAlterar,
                "capacidadeAlterar": capacidadeAlterar

            },
            success: function (data) {
                
                $("#modalAlterarCarro").modal('hide');
                $("#modalAlterarCarroSucesso").modal('show');


                setTimeout(function () {
                    $("#modalAlterarCarroSucesso").modal('hide');
                    location.reload();
                }, 4000);

            },
            error: function (error) {
                console.log('deu erro');
            }


        });

    });





});



