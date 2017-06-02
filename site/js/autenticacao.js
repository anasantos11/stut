function testaAutenticacao(){
	setInterval(function(){
    dados = localStorage.getItem("autenticacao");
  	if(dados != 1){
    	getEstaAutenticado();
    }
  }, 5000);
}

function getEstaAutenticado(){
	var url = location.href;
	var cpf = url.split("?");
	cpf = cpf[1];

	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
           //if(xhttp.responseText){
           	localStorage.setItem("autenticacao" , 1);
            localStorage.setItem("dados_usuario", cpf);
           //}else{
            //alert("Favor realizar o login!");
           	//location.href = "home.html"
           // }
        }
    };
    xhttp.open("POST", "http://127.0.0.1:8080/getAutenticacao//"+ cpf, true);
    xhttp.send();
}


function logout(){
  localStorage.clear();
  location.href = "home.html";
}