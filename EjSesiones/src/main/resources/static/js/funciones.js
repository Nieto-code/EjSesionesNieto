

var era;
function deseleccionarRadio(rbutton) {
    if (rbutton.checked == true && era == true) { rbutton.checked = false; }
    era = rbutton.checked;
}



function verClave() {
    var clave = document.getElementById("clave");
;
    if(clave.type == "password"){
        clave.type = "text";
        
    }else{
        clave.type = "password";
        
    }
}

function verClaveLogin() {
    var clave = document.getElementById("clave_login");
;
    if(clave.type == "password"){
        clave.type = "text";
        
    }else{
        clave.type = "password";
        
    }
}

function verConfirmaClave() {
    var clave = document.getElementById("confirmaClave");
;
    if(clave.type == "password"){
        clave.type = "text";
        
    }else{
        clave.type = "password";
        
    }
}

function todoSelect(input) {
  select = Array.from(input.options);
  for (var i = 0; i < select.length; i++) {
    console.log((select[i].selected = true));
  }
}

function nadaSelect(input) {
  select = Array.from(input.options);
  for (var i = 0; i < select.length; i++) {
    console.log((select[i].selected = false));
  }
}



function seleccionar_todo_checkbox(input){
  input.forEach((element) => {
    element.checked = true;
  });
}

function deseleccionar_todo_checkbox(input){
  input.forEach((element) => {
    element.checked = false;
  });
}




function vaciaAlta() {
    document.getElementById("alta").reset();
}


function seleccionaID(){
	
	let id = document.getElementById("id").innerText;
	alert("El id a eliminar es:" + id);
}