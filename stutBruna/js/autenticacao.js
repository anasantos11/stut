function testaAutenticacao(){
	dados = localstorage.getItem("autenticacao");
	if(dados != 1){
		alert("Favor realizar o login na pagina!!!!!");
		locale.href = "home.html";
	}
}