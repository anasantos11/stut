$(document).ready(function() {
    var panels = $('.user-infos');
    var panelsButton = $('.dropdown-user');
    panels.hide();

    //Click dropdown
    panelsButton.click(function() {
        //get data-for attribute
        var dataFor = $(this).attr('data-for');
        var idFor = $(dataFor);

        //current button
        var currentButton = $(this);
        idFor.slideToggle(400, function() {
            //Completed slidetoggle
            if(idFor.is(':visible'))
            {
                currentButton.html('<i class="glyphicon glyphicon-chevron-up text-muted"></i>');
            }
            else
            {
                currentButton.html('<i class="glyphicon glyphicon-chevron-down text-muted"></i>');
            }
        })
    });


    $('[data-toggle="tooltip"]').tooltip();

    //$('button').click(function(e) {
    //    e.preventDefault();
    //    alert("This is a demo.\n :-)");
    //});
});

var turma = {"alunos":
	[{"nome" :"Joao",
	"tel" : "21994823757",
	"ruaAl": "avenida cisne",
	"bairroAl": "lagoa dos ingleses",
	"numeroEndAl": "160",
	"cepAl": "34018010",
	"nomeFac": "PUC-Minas Praca da Liberdade",
	"ruaFac": "Rua Claudio Manuel",
	"bairroFac": "Funcionarios",
	"numeroEndFac":"1205", 
	"cepFac": "30140108"
	},{"nome" :"ana paula",
	"tel" : "21994823757",
	"ruaAl": "Rua Abilio Estrela" ,
	"bairroAl": "Jardim Guanabara" ,
	"numeroEndAl": "280",
	"cepAl": "31742135",
	"nomeFac": "PUC-Minas Praca da Liberdade",
	"ruaFac": "Rua Claudio Manuel",
	"bairroFac": "Funcionarios",
	"numeroEndFac":"1205", 
	"cepFac": "30140108"
	}]
}
// funcao para gerar usuarios na tabela de alunos
function gerarTabela(){
	var lista_turma;
	for(x=0; x<turma.alunos.length;x++){
		lista_turma += 
			'<div class="row user-row">'+
				'<div class="col-md-2">'+
					'<img class="img-circle"'+
					'src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=50"'+
					'alt="User Pic">'+
				'</div>'+
				'<div class="col-md-8">'+
					'<strong>'+turma.alunos[x].nome+'</strong><br>'+
					'<span class="text-muted">Avenida Cisne,160</span>'+
				'</div>'+
				'<!-- add .rowname class to attribute data-for (Dropdown!)-->'+
				'<div class="col-md-1 dropdown-user" data-for=".cyruxx">'+
					'<i class="glyphicon glyphicon-chevron-down text-muted"></i>'+
				'</div>'+
			'</div>'+            
			'<!-- Add data-for class to this row -->'+
			'<div class="row user-infos cyruxx">'+
				'<div class="col-sm-10 col-md-10 col-md-offset-1">'+
					'<div class="panel panel-primary">'+
						'<div class="panel-heading">'+
							'<h3 class="panel-title">Informacoes do usuario</h3>'+
						'</div>'+
						'<div class="panel-body">'+
							'<div class="row">'+
								'<div class="col-md-3">'+
									'<img class="img-circle"'+
										'src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100"'+
											'alt="User Pic">'+
								'</div>'+
								'<div class="col-md-6">'+
									'<strong>'+turma.alunos[x].nome+'</strong><br>'
										'<table class="table table-condensed table-responsive table-user-information">'+
											'<tbody>'+
												'<tr>'+
													'<td>End:</td>'+
													'<td>'+turma.alunos[x].ruaAl+","+turma.alunos[x].numeroEndAl+'</td>'+
												'</tr>'+
												'<tr>'+
													'<td>Bairro:</td>'+
													'<td>'+turma.alunos[x].bairroAl+'</td>'+
												'</tr>'+
												'<tr>'+
													'<td>Cidade:</td>'+
													'<td>Belo Horizonte</td>'+
												'</tr>'+
												'<tr>'+
													'<td>Universidade</td>'+
													'<td>Puc-Minas Praca da Liberdade</td>'+
												'</tr>'+
											'</tbody>'+
										'</table>'+
								'</div>'+
							'</div>'+
						'</div>'+
							'<div class="panel-footer">'+
								'<button class="btn btn-sm btn-primary" type="button"'+
									'data-toggle="tooltip"'+
										'data-original-title="Send message to user"><i class="glyphicon glyphicon-envelope"></i></button>'+
									'<span class="pull-right">'+
										'<button class="btn btn-sm btn-warning" type="button"'+
											'data-toggle="tooltip"'+
												'data-original-title="Edit this user"><i class="glyphicon glyphicon-edit"></i></button>'+
										'<button class="btn btn-sm btn-danger" type="button"'+
											'data-toggle="tooltip"'+
												'data-original-title="Remove this user"><i class="glyphicon glyphicon-remove"></i></button>'+
									'</span>'+
								'</div>'+
							'</div>'+
						'</div>'+
					'</div>'+
				'</div>'+
			'</div>';
		}
		var element = document.getElementById("turma_tabela");
		element.innerHTML = lista_turma;
	}
//gerarTabela();