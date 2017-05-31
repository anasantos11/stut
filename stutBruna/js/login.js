function showData(){
	var idade = document.getElementById("idade").value;
	console.log(idade);
	if(idade == ""){}
	else if(idade >= 18){
		document.getElementById("Btn-Next").style.marginTop = "40px" ;
		document.getElementById("dadosAlunoMenor").hidden = true;
		document.getElementById("dadosAlunoMaior").hidden = false;
	}else{
		document.getElementById("Btn-Next").style.marginTop = "0px" ;
		document.getElementById("dadosAlunoMaior").hidden = true;
		document.getElementById("dadosAlunoMenor").hidden = false;
	}
}