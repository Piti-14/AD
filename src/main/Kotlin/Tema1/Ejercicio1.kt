package Tema1

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

const val EXIT = -1
fun main(args: Array<String>) {
    val init = File.listRoots()[0]
    if (init.isDirectory) {
        showDirectories(init.canonicalPath)
    }
}

fun showDirectories(input: String) {
    val dir = File(input)
    var directoriesList = dir.listFiles().sorted()
    var order = 0

    println("Lista de carpetas y ficheros del directorio: " + dir.name
          + "\n--------------------------------------------"
          + "\n0.- Directorio raíz" )

    for (i in directoriesList) {
        order++
        print("$order.- ${i.name} \t")
        if (i.isDirectory) {
            print("<Directorio>")
        } else {
            print("${i.totalSpace}")
        }

        //if (i.canExecute())
        println()

    }

    print("¿A qué directorio deseas ir ahora ? (-1 para salir): ")
    var option = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
    changeDirectorie(option, directoriesList)
}

fun changeDirectorie(option: Int, directoriesList: List<File>) {
    if (option == 0) {
        showDirectories("/")
    } else if (option != EXIT) {
        var newDir = option - 1
        showDirectories(directoriesList[newDir].canonicalPath)
    }
}
