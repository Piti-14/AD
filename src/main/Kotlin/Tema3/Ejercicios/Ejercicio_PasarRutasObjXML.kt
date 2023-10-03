package Tema3.Ejercicios

import java.io.EOFException
import java.io.FileInputStream
import java.io.ObjectInputStream
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

fun main() {
    val file = ObjectInputStream(FileInputStream("Rutes.obj"))
    val fileXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()
    val root = fileXML.createElement("rutes")
    fileXML.appendChild(root)

    try {
        while (true) {
            val ruta = file.readObject() as Ruta
            val rutaXML = fileXML.createElement("ruta")

            val nom = fileXML.createElement("nom")
            nom.setTextContent(ruta.nom)
            rutaXML.appendChild(nom)

            val desnivell = fileXML.createElement("desnivell")
            desnivell.setTextContent(ruta.desnivell.toString())
            rutaXML.appendChild(desnivell)

            val desnivellAcumulat = fileXML.createElement("desnivellAcumulat")
            desnivellAcumulat.setTextContent(ruta.desnivellAcumulat.toString())
            rutaXML.appendChild(desnivellAcumulat)

            val punts = fileXML.createElement("punts")

            for (i in 0 .. ruta.size() - 1) {
                val punt = fileXML.createElement("punt")
                punt.setAttribute("num", (i + 1).toString())

                val puntNom = fileXML.createElement("nom")
                puntNom.setTextContent(ruta.getPuntNom(i))
                punt.appendChild(puntNom)

                val puntLat = fileXML.createElement("latitud")
                puntLat.setTextContent(ruta.getPuntLatitud(i).toString())
                punt.appendChild(puntLat)

                val puntLon = fileXML.createElement("longitud")
                puntLon.setTextContent(ruta.getPuntLongitud(i).toString())
                punt.appendChild(puntLon)

                punts.appendChild(punt)
            }

            rutaXML.appendChild(punts)
            root.appendChild(rutaXML)
        }
    } catch (e: EOFException) {
        file.close()
    }

    val transformToXML = TransformerFactory.newInstance().newTransformer()

    transformToXML.setOutputProperty(OutputKeys.INDENT, "yes")
    transformToXML.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2")

    transformToXML.transform(DOMSource(fileXML), StreamResult("Rutes.xml"))
}
