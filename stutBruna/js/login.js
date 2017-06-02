function autentica(){
    var login = document.getElementById("login_username").value;
    var senha = document.getElementById("login_password").value;
    var tipo = document.getElementById("login_type_user").value;
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            console.log(parseInt(xhttp.responseText));
            if(parseInt(xhttp.responseText)){
                if(tipo == "al"){
                    location.href = "areadopassageiro.html?" + login;
                }else{
                    location.href = "areadomotorista.html?" + login;
                }
            }else{
                alert("Login ou senha incorretos");
            }
        }
    };
    xhttp.open("POST", "http://127.0.0.1:8080/logarUsuario//" + login + "/" + senha + "/" + tipo, true);
    xhttp.send();
}
