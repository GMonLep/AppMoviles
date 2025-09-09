fun validarValor(valor: Int): Result<String>{
    return if (valor>0){
        Result.success("Valor ingresado correctamente")
    }else{
        Result.failure( Exception("Valor inválido"))
    }
}


fun main(){
    println("Bienvenido a Salmones del Sur SPA")
    println("Ingresa un pescao: \n")

    try{
        var productos: List<Producto> = listOf()
        println("Nombre pescao: ")
        var nombreInput = readLine()

        println("Precio pescao: ")
        var precioInput = readLine()

        println("Stock pescao: ")
        var stockInput = readLine()


    }catch(){

    }finally {

    }

}