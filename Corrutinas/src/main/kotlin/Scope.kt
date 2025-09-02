import kotlinx.coroutines.*;

//Scope alcance
fun main() = runBlocking {

    //Dispatchers.Default = ejecuta una tarea en segundo plano usando hilos optimizados para CPU
    val scope = CoroutineScope(Dispatchers.Default)
    scope.launch {
        delay(1000L) // 1s
        println("Postre leche asada en el horno")
    }

    scope.launch {
        delay(3000L) // 3s
        println("Pollito asado en horno")
    }

    println("Comida se esta sirviendo en los platos")

    delay(5000L) // 5s --> tiempo suficiente para q la comidita se cocine
    println("Tanto el pollito como el postre estan listillos")

}