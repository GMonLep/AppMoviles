//3. **`try–catch`** para manejar posibles errores de cálculo.
//4. Aplicar **`Result`** para validar los datos antes de registrar un vehículo.
//    - Ej: Si el peso excede la capacidad → Error controlado.
//    - Ej: Si la patente está vacía → Error controlado.
//5. Mostrar mensajes adecuados según cada resultado.
//6. Permitir registrar al menos **2 vehículos diferentes** y mostrar su información.

fun main(){

    println("CAMIONETA")
    val camioneta = infoCamioneta()
    val resultadoPatente = camioneta.patenteContenido()

    if (resultadoPatente.isSuccess) {
        println("TODO OK ${resultadoPatente.getOrNull()}")
    } else {
        println("Error en patente ${resultadoPatente.exceptionOrNull()?.message}")
    }
    println("Costo de envío: ${camioneta.costoEnvio()}")

    println("")
    println("CAMION")
    val camion = infoCamion()
    val resultadoPatente2 = camion.patenteContenido()

    if (resultadoPatente.isSuccess) {
        println("TODO OK ${resultadoPatente2.getOrNull()}")
    } else {
        println("Error en patente ${resultadoPatente.exceptionOrNull()?.message}")
    }
    println("Costo de envío: ${camioneta.costoEnvio()}")
}