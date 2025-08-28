//funcion simular descarga de un archivo

fun descargarArchivo(url:String): Result<String>{
    //si la url esta vacia
    return if(url.isBlank()){
        Result.failure(Exception("La url esta vacía"));
    }else if(!url.startsWith("http"))
        Result.failure(Exception("La url debe comenzar con http"));
    else if //pendingggg
}

