var map;
var directionsDisplay;
var directionsService = new google.maps.DirectionsService();

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

// funcao para mostrar mapa e a localizao de quem chamou o metodo				
function mostrar_mapa() {	
	directionsDisplay = new google.maps.DirectionsRenderer();
	var latlng = new google.maps.LatLng(-20.162371, -43.9622561);
	
    var options = {
        zoom: 10,
		center: latlng,
		disableDefaultUI: true,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };

    map = new google.maps.Map(document.getElementById("mapa"), options);
	directionsDisplay.setMap(map);
	directionsDisplay.setPanel(document.getElementById("trajeto-texto"));
	
	if (navigator.geolocation) {
		navigator.geolocation.getCurrentPosition(function (position) {

			pontoPadrao = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
			map.setCenter(pontoPadrao);
			
			var geocoder = new google.maps.Geocoder();
			
			geocoder.geocode({
				"location": new google.maps.LatLng(position.coords.latitude, position.coords.longitude)
            },
            function(results, status) {
				if (status == google.maps.GeocoderStatus.OK) {
					$("#txtEnderecoPartida").val(results[0].formatted_address);
				}
            });
		});
	}
}
mostrar_mapa();
//  Modelo para testar request 
function turma_request(){
	var xmlhttp = new XMLHttpRequest();
	xmlhttp.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		myObj = JSON.parse(this.responseText);
		// ex imprime nome
		document.getElementById("nome_do_ID").innerHTML = myObj.name;
		
		}
	};
	xmlhttp.open("GET", "json_demo.txt", true);
	xmlhttp.send();
}


// funcao para gerar rota a partir dos enderecos dos usuarios
	$("#trajeto-button").click(function(e) {	 
        e.preventDefault();
		var enderecoPartida = turma.alunos[0].ruaAl+","+turma.alunos[0].numeroEndAl;
		var enderecoChegada = turma.alunos[0].ruaFac+","+turma.alunos[0].numeroEndFac;
		
		var request = {
			origin: enderecoPartida,
			destination: enderecoChegada,
			waypoints:[{"location":"rua do vale,328"}],
			//waypoints: [{"location": 'Rua Abilio Estrela,160'}, {"location": 'rua do vale,328'}],
			travelMode: google.maps.TravelMode.DRIVING			
		};
		for(i=0;i< turma.alunos.length;i++){
		request.waypoints.push({"location":turma.alunos[i].ruaAl+","+turma.alunos[i].numeroEndAl});
		//alert(turma.alunos[i].ruaAl);		
		}
		//request.waypoints.splice(0, 1);		
		directionsService.route(request, function(result, status) {
			if (status == google.maps.DirectionsStatus.OK) {
				directionsDisplay.setDirections(result);
			}
		});
		getLocalizacao();
	});
	
	function getLocalizacao() {
		if (navigator.geolocation) {
			navigator.geolocation.getCurrentPosition(gerarLinkTrajeto);
		} else { 
			alert("Geolocation is not supported by this browser.");
		}
	}

	function gerarLinkTrajeto(position) {
		var link_trajeto = "https://www.google.com/maps?saddr=" + position.coords.latitude + "+" + position.coords.longitude + "+&daddr=";
		for (i = 0 ; i < turma.alunos.length; i++) {
			link_trajeto += turma.alunos[i].ruaAl + '+' + turma.alunos[i].numeroEndAl + '+to:';
		}
		var enderecoFinal = 'rua+claudio+manuel+1205';
		link_trajeto += enderecoFinal;
		$('#iniciar_trajeto').attr('href', link_trajeto);
	}
	
// exemplo https://www.google.com/maps?saddr=avenida+cisne&daddr=praca+da+liberdade+to:bh+shopping+to:patio+savassi