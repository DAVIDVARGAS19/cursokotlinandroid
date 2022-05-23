package com.davidvargas.primerapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        Log.d("", "")
        Log.d("", "")
        Log.d("   INDICATIVO", "Mensaje a mostrar")
        Log.d("", "")
        Log.d("", "")

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //OPERACIONES ARITMETICAS

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERACIONES ARITMETICAS
        Log.d("","")
        Log.d("OPERACIONES ARITMETICAS","")
        Log.d("","")

        var x: Int = 23
        val y: Int = 5
        var resultado: Int

        resultado = x + y
        Log.d("   SUMA", "X + Y es igual a: $resultado")

        resultado = x - y
        Log.d("   RESTA", "X - Y es igual a: $resultado")

        resultado = x * y
        Log.d("   MULTIPLICACION", "X * Y es igual a: $resultado")

        resultado = x / y
        Log.d("   DIVISION", "X / Y es igual a: $resultado")

        resultado = x % y
        Log.d("   RESTO", "X % Y es igual a: $resultado")

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADOR ASIGNACION
        Log.d("","")
        Log.d(" OPERADOR ASIGNACION","")
        Log.d("","")

        /****************************************************
         * SUMA                    A += B     A = A + B
         * RESTA                   A -= B     A = A - B
         * MULTIPLICACION          A *= B     A = A * B
         * DIVISION                A /= B     A = A / B
         * RESTO DE DIVISION       A %= B     A = A % B
         ****************************************************/

        x = 23

        //x = x + 5

        x += 5
        Log.d("   SUMA ASIGNACION", "X es igual a: $x")
        x -= 5
        Log.d("   RESTA ASIGNACION", "X es igual a: $x")
        x *= 5
        Log.d("   MULTIPLI ASIGNACION", "X es igual a: $x")
        x /= 5
        Log.d("   DIVISION ASIGNACION", "X es igual a: $x")
        x %= 5
        Log.d("   RESTO DIV ASIGNACION", "X es igual a: $x")

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADOR CONCATENAR
        Log.d("","")
        Log.d(" CONCATENAR","")
        Log.d("","")

        val texto: String = "Mi nombre es: "
        val nombre:String = "David"

        Log.d("  CONCATENAR 1",texto + nombre + " y vivo en Envigado")
        Log.d("","")
        Log.d("  CONCATENAR 2","$texto $nombre  y vivo en Envigado")
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADOR ICREMENTO DECREMENTO
        Log.d("","")
        Log.d(" INCREMENTO","")
        Log.d("","")

        var numero: Int = 23
        Log.d("   INCREMENTO","El resultafo es" + ++numero)//SIGUE VALIENDO 23
        Log.d("   INCREMENTO","El resultafo es" + numero)
        Log.d("   INCREMENTO","El resultafo es" + numero++)

        Log.d("","")
        Log.d(" DECREMENTO","")
        Log.d("","")

        numero = 23
        Log.d("   DECREMENTO","El resultafo es" + --numero)//SIGUE VALIENDO 23
        Log.d("   DECREMENTO","El resultafo es" + numero)
        Log.d("   DECREMENTO","El resultafo es" + numero--)

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADORES DE COMPARACION
        Log.d("","")
        Log.d(" COMPARACION","")
        Log.d("","")
        /*************************************
         * < MENOR QUE
         * > MAYOR QUE
         * <= MENOR O IGUAL QUE
         * >= MAYOR O IGUAL QUE
         * == IGUAL QUE
         * != DIFERENTE QUE
         *
         * NOS DEVUELVE true O false
         */

        var a : Int = 5
        var b : Int = 6

        Log.d("   MENOR QUE","a < b: " + (a<b))
        Log.d("   MAYOR QUE","a > b: " + (a>b))
        Log.d("   MENOR O IGUAL QUE","a <= b: " + (a<=b))
        Log.d("   MAYOR O IGUAL QUE","a >= b: " + (a>=b))
        Log.d("   IGUAL QUE","a == b: " + (a==b))
        Log.d("   DIFERENTE A","a !=b: " + (a!=b))

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //OPERADORES LOGICOS

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //IF ELSE


        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //WHEN


        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //FOR


        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //WHILE


        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //DO WHILE


        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //BREAK Y CONTINUE


        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}