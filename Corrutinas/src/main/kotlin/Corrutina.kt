//cargar codigo paralelamente
//importando la libreria de rutinas (luego d agregar las dependencias a pom)

import kotlinx.coroutines.*;

//ej preparar una pizza
fun main(){
    println("1. Preparando la masa de la Pizza") //hilo principal aka MAIN THREAD
    //Agregamos una corrutina q se ejecuta paralelamente
    //alcance global.lanzar
    GlobalScope.launch{
        delay(3000) //tiempo de espera (simulando tiempo de espera pizza jij)
        println("La pizita está lista para sacarla del horno")
    }
    //espero el tiempo necesario para que l apizza se cocine para poder servirla
    //thread sleep == main thread is "asleep" for the amount of time indicated below
    Thread.sleep(5000) //esperamos q la pizza este lista
    println("LA PIZZA ESTA LISTA PA COMER") //se imprime dsps

}