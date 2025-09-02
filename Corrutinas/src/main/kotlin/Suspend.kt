//Suspend permite detener el hilo sin bloquear el programa

import kotlinx.coroutines.*;

suspend fun saludarConRetraso(nombre:String){
    //suspend detenemos la funcion de un tiempo especifico
    delay(4000) //-->4 segundos
    //esta variable solo existe en esta funcion (variable local)
    //x lo q no se puede usar en otra parte, x ejemplo no se podria usar en main en el ultimo print
    println("Hola $nombre")
}

//convierto main en una corrutina que se pueda bloquear con = runBlocking
fun main() = runBlocking{
    println("Preparando el saludo, el alumno aún no llega a la sala")
    saludarConRetraso("Thomas")
    println("Saludo realizado, don Thomas ya esta en la sala")
}