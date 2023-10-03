package Tema3.Ejercicios

import java.io.DataInputStream
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun main() {
    val file = DataInputStream(FileInputStream("Rutes.dat"))
    val obj = ObjectOutputStream(FileOutputStream("Rutes.obj"))

    while (file.available() > 0) {
        var nom = file.readUTF()
        var desnivell = file.readInt()
        var desnivellAcumulat = file.readInt()
        var llistaPunts = ArrayList<PuntGEO>()

        var size = file.readInt()
        for (i in 0 .. (size - 1)) {
            var puntNom = file.readUTF()
            var latitud = file.readDouble()
            var longitud = file.readDouble()

            var coord = Coordenadas(latitud, longitud)
            var puntGEO = PuntGEO(puntNom, coord)

            llistaPunts.add(puntGEO)
        }

        var ruta = Ruta(nom, desnivell, desnivellAcumulat, llistaPunts)
        ruta.mostrarRuta()

        obj.writeObject(ruta)
    }
}