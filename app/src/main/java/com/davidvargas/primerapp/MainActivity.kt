package com.davidvargas.primerapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
    }

    fun main() {

        var miVariable = "Hola, soy una variable"
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //TIPOS DE VARIABLES

        //INT
        var miNumero: Int = 1000
        //LONG
        var miLong: Long = 1000000000000000000
        // FLOAT
        var miFloat: Float = 3.14f
        //DOUBLE
        var miDouble: Double = 3.114159265
        //CHAR
        var miChar: Char = 'k'
        //STRING
        var miString: String = "Hola, soy un String"
        //BOOLEANS
        var miBoolean: Boolean = true
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //VAR VS VAL

        //VAR:nos da la opcion de cambiar el valor de nuestra variable en un futuro
        var variable = 10
        variable = 15
        //VAL:nos da un valos definido e inmutable, no podremos cambiarlo en un futuro.
        val miVal = 10
        //miVal = 15 ERROR
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //NULL nada
        val espacio = null

        var nulo: String = "algo"
        //nulo = null  NO PODRA SER NULL YA QUE NO LE HEMOS DADO LA OPCION DE SER NULABLE

        //PODRA SER NULL CUANDO AGREGUEMOS EL SIMBOLO "?" QUE SIGNIFICA NULABLE, YA QUE LE HEMOS DADO LA OPCION DE SER NULABLE
        var nulable: String? = "algo"
        nulable = null
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //LOG O PRINTLN
        Log.d("","")
        Log.d("","")
        Log.d("   INDICATIVO", "Mensaje a mostrar")
        Log.d("","")
        Log.d("","")
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}