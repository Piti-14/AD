package Tema3.Ejercicios

import java.io.Serializable

class PuntGEO (var nom: String, var coord: Coordenadas): Serializable {
    companion object {
        private const val serialVersionUID: Long = 1
    }
}