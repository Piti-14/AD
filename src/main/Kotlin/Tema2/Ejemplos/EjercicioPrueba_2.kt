package Tema2.Ejemplos

import java.io.ByteArrayInputStream

fun main(args: Array<String>) {
    val entry = "Aquest és un byte array"
    val inputReader = ByteArrayInputStream(entry.toByteArray())
    var c = inputReader.read()
    while (c != END) { //Coge la constante END del archivo Kotlin anterior !
        println(c.toChar())
        c = inputReader.read()
    }
    inputReader.close()
}