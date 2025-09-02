class Drone (
    override var patente: String = "",
    override var peso: Int = 0,
    override var capacidad: Int = 0
) : TransporteCarga() {
    override fun costoEnvio(): Int {
        return peso * 100000
    }

    override fun patenteContenido(): Result<String> {
        return if (patente.isNotEmpty()) {
            Result.success(patente)
        } else {
            Result.failure(Exception("Formato inválido"))
        }
    }
}

fun infoDrone(): Drone {
    val drone = Drone()
    return drone.apply {
        println("Patente:")
        patente = readLine().toString()
        println("Peso:")
        peso = readLine()!!.toInt()
        println("Capacidad:")
        capacidad = readLine()!!.toInt()
    }
}