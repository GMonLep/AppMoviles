import kotlinx.coroutines.*;


sealed class ResultadoLogin{
    data class Success(val perfil: PerfilUsuario?) : ResultadoLogin()
    data class Error(val mensaje:String?) : ResultadoLogin()
    object Autenticacion: ResultadoLogin()
}

suspend fun autenticarUsuario(usuario:String, contrasenia:String): ResultadoLogin{
    delay(2000L)
    if (usuario == "Admin" || contrasenia == "1234")
        return ResultadoLogin.Success(perfil = PerfilUsuario(usuario,contrasenia))
    else
        return ResultadoLogin.Error(mensaje = usuario+" INCORRECTO")
}

