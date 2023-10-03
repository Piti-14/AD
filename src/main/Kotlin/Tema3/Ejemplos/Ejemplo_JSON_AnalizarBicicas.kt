package Tema3.Ejemplos

//Hem agafat l'array, d'ell hem agafat el primer objecte i d'ell l'array. I hem utilitzat un bucle for, per a tots els valors de l'array

import org.json.JSONTokener
import org.json.JSONObject
import org.json.JSONArray
import java.io.FileReader

fun main(args: Array<String>) {

    val r_json = FileReader("Bicicas.json")

    val arrel = JSONTokener(r_json).nextValue() as JSONArray

    val estacions = arrel.getJSONObject(0).getJSONArray("ocupacion")

    for (e in estacions){
        val est = e as JSONObject
        println("" + e.get("id") + ".- " + e.get("punto") + " (" + e.get("ocupados") + "/" + e.get("puestos") + ")")
    }
}