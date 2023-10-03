package Tema3.Ejercicios

import java.io.Serializable

class Ruta (var nom: String, var desnivell: Int, var desnivellAcumulat: Int, var llistaDePunts: MutableList<PuntGEO>): Serializable {
    companion object {
        private const val serialVersionUID: Long = 1
    }

    fun addPunt(p: PuntGEO){
        llistaDePunts.add(p)
    }

    fun getPunt(i: Int): PuntGEO{
        return llistaDePunts.get(i)
    }

    fun getPuntNom(i: Int): String {
        return llistaDePunts.get(i).nom
    }

    fun getPuntLatitud(i: Int): Double {
        return llistaDePunts.get(i).coord.latitud
    }

    fun getPuntLongitud(i: Int): Double {
        return llistaDePunts.get(i).coord.longitud
    }

    fun size(): Int {
        return llistaDePunts.size
    }

    fun mostrarRuta() {
        // Aquest és el mètode que heu d'implementar vosaltres
        var ruta = "Ruta: " + nom + "\nDesnivell: " + desnivell + "\nDesnivell acumulat: " + desnivellAcumulat + "\nTé " + size() + " punts\n"
        var i = 1
        for (p in 0 .. size() - 1) {
            ruta += "Punt " + i + ": " + getPuntNom(p) + " (" + getPuntLatitud(p) + ", " + getPuntLongitud(p) + ")\n"
            i++
        }

        println(ruta)
    }
}