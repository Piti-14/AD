package Tema2.Ejemplos

import java.io.FileInputStream

fun main(args: Array<String>) {
    val file = FileInputStream("src/main/resources/f2.txt")
    var buffer = ByteArray(30)
    var n = file.read(buffer)
    while (n != END) {
        for (i in 0..<n)
            print(buffer[i].toChar())
        println("")
        n = file.read(buffer)
    }
    file.close();
}