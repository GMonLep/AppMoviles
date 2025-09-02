abstract class TransporteCarga {
    abstract var patente: String
    abstract var peso: Int
    abstract var capacidad: Int

    open fun costoEnvio(): Int = 0
    abstract fun patenteContenido(): Result<String>
}