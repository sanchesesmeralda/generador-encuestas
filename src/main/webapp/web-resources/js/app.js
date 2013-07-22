/* Angular controllers */

function CrearEncuestaController($scope){
	$scope.titulo = "Encuesta emigrantes";
	$scope.descripcion = "Es una encuesta con el proposito de conocer la problematica economica y social de los hijos de indocumentados";
}

function EncuestaDiseniarController($scope, $http){
	
	$scope.tipoSeleccionado = 'PA';
	$scope.esPreguntaAbierta = true;
	$scope.opciones = [];
	$scope.esPreguntaDeTiempo = false;
	$scope.esPreguntaObligatoria = false;
	$scope.tiempo = 0;
	$scope.textoPregunta = "";
	$scope.responseGuardarPregunta = {};
	$scope.mostrarAlerta = false;
	
	if(TEST){
		$scope.textoPregunta = "donde esta Roger Rabbit?";
	}
	
	$scope.tipoPreguntaSelectChange = function(){
		
		if($scope.tipoSeleccionado != 'PA'){
			$scope.esPreguntaAbierta = false;
		}else{
			$scope.esPreguntaAbierta = true;
			$scope.opciones = [];
		}
	};
	
	$scope.validarPregunta = function(){		
		
		/* validaciones */
		if($scope.textoPregunta == ""){
			$scope.alerta = "Ingrese texto a la pregunta";
			$scope.mostrarAlerta = true;
			return;
		}
		
		if($scope.esPreguntaDeTiempo && $scope.tiempo <= 0){
			$scope.alerta = "El tiempo tiene que ser mayor a cero";
			$scope.mostrarAlerta = true;
			return;
		}
		
		if($scope.tipoSeleccionado != 'PA' && $scope.opciones.length < 3){
			$scope.alerta = "Es necesario por lo menos 3 opciones";
			$scope.mostrarAlerta = true;
			return;
		}
		
		window.console.info($scope.opciones);
		
		$("#formRequestSaveQuestion").submit();
	};
}


