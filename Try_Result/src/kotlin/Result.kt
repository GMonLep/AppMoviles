//funcion q valida un correo
fun validarEmail(email: String): Result<String>{
    //verificar q el correo tenga un @
    return if (email.contains("@")&& email.contains(".")){
        Result.success(email);
    }else{
        Result.failure(RuntimeException("Formato incorrecto de correo"));
    };
    //fin validar email
};

fun main(){
    //mostramos mensaje al usuario
    println("Ingrese su correo electrónico \n");
    val correo = readLine()?:"";

    //llamar a la funcion validar
    validarEmail(correo)
        .onSuccess { println("Correo válido🦸‍♂️✅ $it") } //it referenciando al validarEmail d arribita
        .onFailure { println("ERROR CORREO INVÁLIDO") }
};