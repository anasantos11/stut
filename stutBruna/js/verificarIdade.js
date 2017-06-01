	function calcularIdade() {
		var data = document.getElementById("dataNascimento").value;
		data = data.split("-");
		dia_aniversario= data[2];
		mes_aniversario = data[1];
		ano_aniversario = data[0];
		
    var d = new Date();
    var ano_atual = d.getFullYear();
    var mes_atual = d.getMonth() + 1;
    var dia_atual = d.getDate();
    ano_aniversario = +ano_aniversario;
    mes_aniversario = +mes_aniversario;
    dia_aniversario = +dia_aniversario;
    quantos_anos = ano_atual - ano_aniversario;
    if (mes_atual < mes_aniversario || mes_atual == mes_aniversario && dia_atual < dia_aniversario) {
        quantos_anos--;
    }
		document.getElementById("idade").value=quantos_anos;
		showData(quantos_anos);

	}

function showData(idade){
	if(idade >= 18){
		//document.getElementById("Btn-Next").style.marginTop = "0px" ;
		document.getElementById("dadosAlunoMenor").hidden = true;
	}else{
		//document.getElementById("Btn-Next").style.marginTop = "0px" ;
		document.getElementById("dadosAlunoMenor").hidden = false;
	}
}
