function testaAutenticacao(){
	dados = localstorage.getItem("autenticacao");
	if(dados != 1){
		alert("Favor realizar o login na pagina!!!!!");
		locale.href = "home.html";
	}
}

function getEstaAutenticado(){
	var url = location.href;
	var cpf = url.split("?");
	cpf = cpf[1];

	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
           if(xhttp.responseText){
           	sessionStorage.setItem("autenticacao" , 1);
            sessionStorage.setItem("dados_usuario", cpf);
           }else{
           	location.href = "home.html"
           }
        }
    };
    xhttp.open("POST", "http://127.0.0.1:8080/getAutenticacao?"+ cpf, true);
    xhttp.send();
}