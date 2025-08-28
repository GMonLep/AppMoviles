import java.io.File
import java.io.FileNotFoundException

fun main(){
    println("Inresa mel nombre del archivo a leer: ");
    val nombreArchivo = readLine()?: "";

    try{
        //Intentar leer el archivo puede fallar si este no existe
        val contenido = File(nombreArchivo).readText();
        println("Contenido del archivo: \n $contenido");

        //si es q no pilla el archivo
    }catch (e: FileNotFoundException){
        println("El archivo no existe");
    }catch (e:Exception){
        println("Error inesperado");
    }

}