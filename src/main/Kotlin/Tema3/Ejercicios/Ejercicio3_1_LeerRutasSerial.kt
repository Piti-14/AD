package Tema3.Ejercicios

import java.io.DataInputStream
import java.io.FileInputStream

fun main() {
    val f = DataInputStream(FileInputStream("Rutes.dat"))

    while (f.available() > 0) {
        var nom = f.readUTF()
        println("Ruta: " + nom)
        println("Desnivell: " + f.readInt())
        println("Desnivell acumulat: " + f.readInt())

        var punts = f.readInt()
        println("Té " + punts + " punts")

        for (i in 1..punts)
            println("Punt " + i + ": " + f.readUTF() + " (" + f.readDouble() + ", " + f.readDouble() + ")")

        println()
    }
    f.close()
}