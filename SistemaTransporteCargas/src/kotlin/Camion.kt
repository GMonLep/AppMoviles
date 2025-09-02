
class Camion (
    override var patente: String = "",
    override var peso: Int = 0,
    override var capacidad: Int = 0
) : TransporteCarga() {
    override fun costoEnvio(): Int {
        return peso * 300000
    }

    override fun patenteContenido(): Result<String> {
        return if (patente.isNotEmpty()) {
            Result.success(patente)
        } else {
            Result.failure(Exception("Formato inválido"))
        }
    }
}

fun infoCamion(): Camion {
    val camion = Camion()
    return camion.apply {
        println("Patente:")
        patente = readLine().toString()
        println("Peso:")
        peso = readLine()!!.toInt()
        println("Capacidad:")
        capacidad = readLine()!!.toInt()
    }
}