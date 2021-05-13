package pt.ulusofona.ecati.deisi.licenciatura.cm2021.grupo6.ui.utils

import android.app.DatePickerDialog
import java.io.File
import java.util.*

class TesteCovid (
    var local: String = "",
    var data: String = "DD/MM/YYYY",
    var resultadoTesteCovid: Boolean = false,
    val fotoPath: String = "/drawable/teste_negativo",
    val foto: File= File(fotoPath)){

    override fun toString(): String {
        return "TesteCovid(local='$local', data='$data', resultadoTesteCovid=$resultadoTesteCovid, fotoPath='$fotoPath', foto=$foto)"
    }
}