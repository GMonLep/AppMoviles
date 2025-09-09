//define clase heredable
open class Pescado (
    private val nombre: String,
    private val precioPorKilo: Int,
    private val stockKilos: Int
):Producto(){
    override fun descripcion(): String {
        return "\n🐟 NOMBRE: $nombre \n🐟 PRECIO X KILO: $${precioPorKilo} \n🐟 STOCK (KILOS): ${stockKilos}🐟"
    }
    override fun valorTotal(): Int {
        var precioFinal = precioPorKilo*stockKilos
        return precioFinal
    }
}

