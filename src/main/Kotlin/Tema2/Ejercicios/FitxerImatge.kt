package Tema2.Ejercicios

import java.io.File

class FitxerImatge(fEnt: File) {
    var f: File = File("src/main/resources/Penyagolosa.bmp")   // No modifiqueu aquesta línia. El seu valor s'ha de modificar en el constructor

    init {
        // Constructor
        // Control d'existència del fitxer i control de l'extensió .bmp (traure missatges d'error)
        // En cas que tot siga correcte, inicialitzar f amb fEnt

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