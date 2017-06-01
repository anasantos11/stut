function validarCadastro(url) {

  var nome = document.getElementsByName("nome")[0].value;
  var dataNasc = document.getElementById("dataNascimento").value;
  var cpf = document.getElementsByName("cpf")[0].value;
  var telefone = document.getElementsByName("tel")[0].value;
  var email = document.getElementsByName("email")[0].value;
  var senha = document.getElementsByName("nome")[0].value;
  var nomeResponsavel = document.getElementsByName("nomeResponsavel")[0].value;
  var cpfResponsavel = document.getElementsByName("nomeResponsavel")[0].value;
  var idade = document.getElementsByName("idade")[0].value;
  // Dados Endereço
  var cep = document.getElementsByName("cep")[0].value;
  var rua = document.getElementsByName("rua")[0].value;
  var numero = document.getElementsByName("numero")[0].value;
  var bairro = document.getElementsByName("bairro")[0].value;
  var cidade = document.getElementsByName("cidade")[0].value;
  var estado = document.getElementsByName("estado")[0].value;
  // Dados Contratuais
  var formaPgto = document.getElementsByName("formaPgto")[0].value;
  var assinaturaPgto = document.getElementsByName("assinaturaPgto")[0].value;
  var inicioContrato = document.getElementsByName("inicioContrato")[0].value;
  var fimContrato = document.getElementsByName("fimContrato")[0].value;
  var recolhimentoCasa = document.getElementsByName("recolhimentoCasa")[0].value;
  var entregaFaculdade = document.getElementsByName("entregaFaculdade")[0].value;
  var recolhimentoFaculdade = document.getElementsByName("recolhimentoFaculdade")[0].value;
  var entregaCasa = document.getElementsByName("entregaCasa")[0].value;

  //Dados Bancários
  var banco = document.getElementsByName("banco")[0].value;
  var bandeiraCartao = document.getElementsByName("bandeiraCartao")[0].value;
  var numCartao = document.getElementsByName("numCartao")[0].value;
  var codigoCartao = document.getElementsByName("codigoCartao")[0].value;
  var dataValidade = document.getElementsByName("dataValidade")[0].value;

  var xmlhttp = new XMLHttpRequest();
  var url = url + "/contratoPassageiro";
  var params = "nome=" + nome + "&dataNascimento=" + dataNasc + "&cpf=" + cpf + "&telefone=" + telefone + "&email=" + email +
  "&senha=" + senha + "&nomeResponsavel=" + nomeResponsavel+ "&cpfResponsavel="+ cpfResponsavel + "&idade=" + idade +"&cep=" + cep +
  "&rua=" + rua + "&numero=" + numero +  "&bairro=" +  bairro +  "&cidade=" + cidade + "&estado=" + estado + "&formaPgto=" + formaPgto +
  "&assinaturaPgto=" +  assinaturaPgto + "&inicioContrato=" + inicioContrato + "&fimContrato=" + fimContrato +"&recolhimentoCasa=" + recolhimentoCasa +
  "&entregaFaculdade=" + entregaFaculdade + "&recolhimentoFaculdade=" + recolhimentoFaculdade + "&entregaCasa=" + entregaCasa  + "&banco=" + banco +
  "&bandeiraCartao=" + bandeiraCartao + "&numCartao=" + numCartao + "&codigoCartao=" + codigoCartao + "&dataValidade=" + dataValidade;

  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if(xmlhttp.readyState==4) {
      swal({
      title: "Cadastro realizado com sucesso",
      text: "",
      type: "success",
      closeOnConfirm: false
    }, function () {
      window.location.reload();
    });

    setTimeout(function(){   window.location.reload(); }, 5000);

  }if (xmlhttp.readyState==4 && xmlhttp.status>=400) {
    swal(
    'Ocorreu algum erro, tente novamente',  '',
    'error'
    )
  }
};
  xmlhttp.open("POST", url, true);
  xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
  xmlhttp.send(params);

}
