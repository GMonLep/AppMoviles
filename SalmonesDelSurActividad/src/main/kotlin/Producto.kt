//common interface across classes, when a subclass extends it has to provide
//implementations for all of the abstract methods defined in the abstract class
abstract class Producto {
    //abstract, in which case they have no body in the abstract class, but subclasses must implement them.
    abstract fun descripcion(): String
    //open, in which case they have a body in the abstract class, but subclasses may override them.
    //x eso la inicializamos
    open fun valorTotal(): Int = 0
}