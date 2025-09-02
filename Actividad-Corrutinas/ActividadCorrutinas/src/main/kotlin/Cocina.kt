//Objetivo: Aplicar los conceptos básicos
// de corrutinas en Kotlin (launch, runBlocking,
// delay, CoroutineScope, Dispatchers.Default).

import kotlinx.coroutines.*;
//Usa runBlocking para que el programa no termine antes de tiempo.
fun main () = runBlocking{
    println("Iniciando cocina inteligente...")
    //Usa CoroutineScope(Dispatchers.Default).launch para ejecutar cada tarea.
    val scope = CoroutineScope(Dispatchers.Default);

    scope.launch {
        //Usa delay() para simular los tiempos de espera.
        delay(2000L)
        println("Arroz listoko")
    }
    scope.launch {
        delay(1500L)
        println("Papas listokas")
    }
    scope.launch {
        delay(1000L)
        println("Jugo listoko")
    }
    println("Preparando la mesa...")

    delay(5000L)
    println("Cocina completa")
}