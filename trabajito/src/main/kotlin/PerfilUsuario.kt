class PerfilUsuario {
    var nombreUsuario: String? = null;
    var contrasenia:String?=null;
}


//class PerfilUsuario (
  //  var nombreUsuario: String?,
    ///var contrasenia:String?

//)

fun datosUsuario(): PerfilUsuario{
    val usuario1 = PerfilUsuario()
    return usuario1.apply {
        println("NOMBRE DE USUARIO:")
        nombreUsuario = readLine().toString()
        println("CONTRASENIA")
        contrasenia = readLine().toString()
    }
}