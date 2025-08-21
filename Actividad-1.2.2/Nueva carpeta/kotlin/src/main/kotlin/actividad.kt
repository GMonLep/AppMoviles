//VARIABLES Y OPERADORES ARITMETICOS
//En un archivo Kotlin con una función main(), realiza lo siguiente:
//1. Declara dos variables numéricas (una de tipo Int, otra de tipo Double).
//2. Realiza las cuatro operaciones aritméticas básicas (+, -, *, /) entre ellas.
//3. Imprime cada resultado en la consola con un texto descriptivo, por ejemplo:
//"La suma es: [resultado]".


//SEGURIDAD ANTE NULOS (Null Safety)
//1. Declara una variable de tipo String que pueda ser nula (String?). Asígnale un
//valor inicial de texto.
//2. Imprime en consola la longitud de la variable usando el operador de llamada
//segura ?..
//3. Asigna el valor null a esa misma variable.
//4. Intenta imprimir nuevamente su longitud usando el mismo operador ?.. Observa cómo el programa no falla y devuelve null.

//Pregunta de reflexión: En un comentario en tu código, explica brevemente cómo
//se realizaría una verificación equivalente en Java para evitar un NullPointerException.

//LOGICA CONDICIONAL CON WHEN
//1. Declara una variable de tipo Int y asígnale un número del 1 al 7.
//2. Utiliza la estructura de control when de Kotlin para imprimir el día de la semana correspondiente al número (ej. 1 -> "Lunes", 2 -> "Martes", etc.).
//3. Asegúrate de incluir un caso else para manejar cualquier otro número.
//Preguntas de Reflexion
// ¿Qué diferencias y similitudes clave observaste entre Kotlin y Java en esta
//actividad?
// ¿Cómo podrías aplicar lo aprendido sobre la seguridad ante nulos (Null Safety) y la expresión when en futuros proyectos de desarrollo de aplicaciones
//móviles?

fun main(){
    var int:Int = 5
    var double:Double = 5.5

    var suma = int+double
    var resta = int-double
    var multip = int*double
    var divi = int/double

    println("Suma double e int: $suma")
    println("Resta double e int: $resta")
    println("Multiplicacion double e int: $multip")
    println("Division double e int: $divi")

    var nulable:String? = "peo"
    println("Longitud variable nula con valor 'peo': ${nulable?.length} caracteres")
    //tmbn se puede hacer asi:
    //var longitud = nulable?.length
    //println("Longitud variable nula: $longitud caracteres")

    //para cambiar su valor no funciona var nulable = null pq estas declarando la variable como si fuera nueva y crea conflicto pq ya existe :p
    //se pone el nombrecito nms y listo
    nulable = null
    println("Longitud variable nula con valor null: ${nulable?.length} caracteres")

    var numero:Int = 6
    val semana = when(numero){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "No es un dia de la semana"

    }

}

