package Tema2.Ejercicios

import java.io.File

fun main(args: Array<String>){
    var f = File("Penyagolosa.bmp")

    val fi = FitxerImatge(f)
    fi.transformaNegatiu()
    fi.transformaObscur()
    //voluntari
    //fi.transformaBlancNegre()
}