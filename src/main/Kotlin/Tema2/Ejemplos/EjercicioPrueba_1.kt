package Tema2.Ejemplos

import java.io.FileInputStream

const val END = -1
fun main(args: Array<String>){
    val fileReader= FileInputStream("src/main/resources/f1.txt")
    var c = fileReader.read() //es un int
    while (c != END){
        println(c.toChar())
        c = fileReader.read()
    }
    fileReader.close()
}