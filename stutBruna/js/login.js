function autentica(){
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if(isNaN(parseInt(xhttp.responseText))){
                var dados = xhttp.responseText;
                if(tipo == "al"){
                    sessionStorage.setItem("autenticacao" , 1);
                    sessionStorage.setItem("dados_usuario", dados);
                    location.href = "areadopassageiro.html?" + login;
                }else{
                    sessionStorage.setItem("autenticacao" , 1);
                    sessionStorage.setItem("dados_usuario", dados);
                    location.href = "areadomotorista.html?"+ login;
                }
            }else{
                alert("Login ou senha digitados de forma errada");
            }
        }
    };
    var login = document.getElementById("login_username").value;
    var senha = document.getElementById("login_password").value;
    var tipo = document.getElementById("login_type_user").value;
    xhttp.open("POST", "http://127.0.0.1:8080/logarUsuario/" + login + "/" + senha + "/" + tipo, true);
    xhttp.send();
}
