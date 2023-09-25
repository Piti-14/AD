package Tema2.Ejercicios

import Tema2.Ejemplos.END
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

private const val NEGATIVE = 255
private const val IMAGEINFO = 54
class FitxerImatge(fEnt: File) {

    private var f: File = File("")   // No modifiqueu aquesta línia. El seu valor s'ha de modificar en el constructor

    init {
        // Constructor
        // Control d'existència del fitxer i control de l'extensió .bmp (traure missatges d'error)
        // En cas que tot siga correcte, inicialitzar f amb fEnt
        if (fEnt.exists() && fEnt.extension == "bmp") {
            f = fEnt
        } else {
            println("The file doesn't exist or is not a .bmp image")
        }
    }

    fun transformaNegatiu() {
        // Transformar a negatiu i guardar en _n.bmp
        val image = FileInputStream(f)
        var fOut = FileOutputStream("Penyagolosa_n.bmp")

        var b = image.read()
        for (i in 0..<IMAGEINFO) {
            fOut.write(b)
            b = image.read()
        }

        while (b != END) {
            fOut.write(NEGATIVE - b)
            b = image.read()
        }

        image.close()
        fOut.close()
    }

    fun transformaObscur() {
        // Transformar a una imatge més fosca i guardar en _o.bmp
        val image = FileInputStream(f)
        var fOut = FileOutputStream("Penyagolosa_o.bmp")

        var b = image.read()
        for (i in 0..<IMAGEINFO) {
            fOut.write(b)
            b = image.read()
        }

        while (b != END) {
            fOut.write(b / 2)
            b = image.read()
        }

        image.close()
        fOut.close()

    }

    //Partvoluntària
    fun transformaBlancNegre() {
        // Transformar a una imatge en blanc i negre i guardar en _bn.bmp
        val image = FileInputStream(f)
        var fOut = FileOutputStream("Penyagolosa_bn.bmp")

        var b = image.read()
        for (i in 0..<IMAGEINFO) {
            fOut.write(b)
            b = image.read()
        }

        while (b != END) {
            var R = b
            b = image.read()
            var G = b
            b = image.read()
            var B = b

            var avg = (R + G + B) / 3
            fOut.write(avg)
            fOut.write(avg)
            fOut.write(avg)

            b = image.read()
        }

        image.close()
        fOut.close()
    }
}