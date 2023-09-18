package Tema2.Ejemplos

import java.io.ByteArrayInputStream
import java.io.FileInputStream
import java.io.SequenceInputStream

fun main(args: Array<String>) {
    val file1 = FileInputStream("src/main/resources/f1.txt")
    val entry1 = "Aquest és un byte array"
    val file2 = ByteArrayInputStream(entry1.toByteArray())
    val inputReader = SequenceInputStream(file1,file2)
    var c = inputReader.read()
    while (c != END) {
        println(c.toChar())
        c = inputReader.read()
    }
    inputReader.close()
}