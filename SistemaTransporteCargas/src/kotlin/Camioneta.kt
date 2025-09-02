class Camioneta(
    override var patente: String = "",
    override var peso: Int = 0,
    override var capacidad: Int = 0
) : TransporteCarga() {
    override fun costoEnvio(): Int {
        return peso * 200000
    }

    override fun patenteContenido(): Result<String> {
        return if (patente.isNotEmpty()) {
            Result.success(patente)
        } else {
            Result.failure(Exception("Formato inválido"))
        }
    }
}

fun infoCamioneta(): Camioneta {
    val camioneta = Camioneta()
    return camioneta.apply {
        println("Patente:")
        patente = readLine().toString()
        patenteContenido()
        println("Peso:")
        peso = readLine()!!.toInt()
        println("Capacidad:")
        capacidad = readLine()!!.toInt()
    }
}