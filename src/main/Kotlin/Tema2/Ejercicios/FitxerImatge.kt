package Tema2.Ejercicios

import java.io.File

class FitxerImatge(fEnt: File) {

    private var f: File = File("")   // No modifiqueu aquesta línia. El seu valor s'ha de modificar en el constructor

    init {
        // Constructor
        // Control d'existència del fitxer i control de l'extensió .bmp (traure missatges d'error)
        // En cas que tot siga correcte, inicialitzar f amb fEnt
        /*if ((fEnt.exists()) && (fEnt.extension = "bmp")) {
            f = fEnt
        } else {
            println("The file doesn't exists or is not a .bmp image")
        }*/
    }

    fun transformaNegatiu() {
        // Transformar a negatiiu i guardar en _n.bmp

    }

    fun transformaObscur() {
        // Transformar a una imatge més fosca i guardar en _o.bmp

    }

    /* Partvoluntària
    fun transformaBlancNegre() {
        // Transformar a una imatge en blanc i negre i guardar en _bn.bmp

    }
 */
}