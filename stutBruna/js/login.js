function autentica(){
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            console.log(parseInt(xhttp.responseText));
            if(isNaN(parseInt(xhttp.responseText))){
                if(tipo == "al"){
                    localStorage.setItem("dados_usuario", xhttp.responseText);
                    localStorage.setItem("autenticacao" , 1);
                    location.href = "areadopassageiro.html";
                }else{
                    localStorage.setItem("dados_usuario", xhttp.responseText);
                    localStorage.setItem("autenticacao" , 1);
                    location.href = "areadomotorista.html";
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
