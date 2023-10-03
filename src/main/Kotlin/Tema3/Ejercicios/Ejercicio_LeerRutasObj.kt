package Tema3.Ejercicios

import java.io.EOFException
import java.io.FileInputStream
import java.io.ObjectInputStream

fun main() {
    val file = ObjectInputStream(FileInputStream("Rutes.obj"))

    try {
        while (true) {  //Usamos esta condición porque no está disponible el métodod available
            val ruta = file.readObject() as Ruta
            ruta.mostrarRuta()
        }
    } catch (EOF: EOFException) {
        file.close()
    }
}