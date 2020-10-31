$('#cmdguardarventa').on('click', function(e) {
        e.preventDefault();
        var clnombre = $('#txtcliente').val();
        var cltelefono = $('#txttelefono').val();
        var telVar = $('#telefonoAdd').val();
        var url = "https://umgdw.herokuapp.com/venta";
        var xhr = new XMLHttpRequest();
            xhr.open("POST", url, true);
            xhr.setRequestHeader("Content-Type", "application/json");
            var data = JSON.stringify({"nombrecliente":clnombre,"fechapedido":"2020-10-31","estado":1,"idestado_estadoventa":1,"usuario_crea":1,"idusuario_usuarios":1,"idtienda":1});
            xhr.send(data);
            xhr.onload = function() {
                console.log(xhr.response);
                if(xhr.response == "OK") {
                    $('#txtcliente').attr('readonly', true); 
                    $('#txttelefono').attr('readonly', true);
                    var requri5 = 'https://umgdw.herokuapp.com/venta';
                    requestJSON(requri5, function(json) {
                        if (json == null) {
                           $idventageneral = 0;
                        } else {
                           $idventageneral = json.length;
                        }
                    });
                    alertify.success('La venta fue ingresada correctamente.');
                } else {
                    alertify.error('Error al grabar la venta.');
                }
            };
    });
