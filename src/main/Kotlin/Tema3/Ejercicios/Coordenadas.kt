package Tema3.Ejercicios

import java.io.Serializable

class Coordenadas (var latitud: Double, var longitud: Double): Serializable{
    companion object {
        private const val serialVersionUID: Long = 1
    }
}