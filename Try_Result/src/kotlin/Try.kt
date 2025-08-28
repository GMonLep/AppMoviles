fun main(){
    println("Bienvenid@ a PuertoGames móvil");
    println("Ingrese monto a recargar: ");

    try{
        //leer info del usuario en un input
        val entrada = readLine();

        //el input se lee como string pq kotlin no puede identificar su tipo altiro,
        //entonces convertinos de String --> Int
        val monto = entrada?.toInt()?: throw Exception("Ingresa un dato la entrada no es validilla");

        //pa numeros negativos ooo
        if (monto<=0){
            throw IllegalArgumentException("El monto de la recarga debe ser mayor a cero");
        }
        println("La recarga del $monto CLP fue éxitosa");
        //e puede ser cualquier letra aparentemente (?)
    }catch(e: NumberFormatException){
        println("Ingresa un número válido")
    }catch(e: IllegalArgumentException){
        println("Error de la lógica ${e.message}");
    }//se ejecuta si o si, aunq no haya un error
    finally{
        println("Gracios por recargar en PuertoGames móvil :D")
    }
}

