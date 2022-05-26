package com.davidvargas.primerapp

import com.davidvargas.primerapp.SmartPhone.SmartPhone1
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.davidvargas.primerapp.calculadora.Cientifica

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variables()                       //ACCESO A LA FUNCION VARIABLES
        operacionesAritmeticas()          //ACCESO A LA FUNCION OPERACIONES ARITMETICAS
        operadoresLogicos()               //ACCESO A LA FUNCION OPERADORES LOGICOS
        arrays()                          //ACCESO A LA FUNCION ARRAYS
        POO()                             //ACCESO A LA FUNCION POO
    }

    private fun variables() {

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //TIPOS DE VARIABLES

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        var miVariable = "Hola, soy una variable"

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
        Log.d(" LOG", "")
        Log.d("", "")
        Log.d("", "")
        Log.d("   INDICATIVO", "Mensaje a mostrar")
        Log.d("", "")
        Log.d("", "")
    }                //FUNCION VARIABLES

    private fun operacionesAritmeticas() {
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //OPERACIONES ARITMETICAS

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERACIONES ARITMETICAS
        Log.d("", "")
        Log.d(" OPERACION ARITMETICA", "")
        Log.d("", "")

        var x: Int = 23
        val y: Int = 5
        var resultado: Int = 0

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
        Log.d("", "")
        Log.d(" OPERADOR ASIGNACION", "")
        Log.d("", "")

        /****************************************************
         * SUMA                    A += B     A = A + B
         * RESTA                   A -= B     A = A - B
         * MULTIPLICACION          A *= B     A = A * B
         * DIVISION                A /= B     A = A / B
         * RESTO DE DIVISION       A %= B     A = A % B
         ****************************************************/

        x = 23
        Log.d("x", "23")
        Log.d("", "")
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
        Log.d("", "")
        Log.d(" CONCATENAR", "")
        Log.d("", "")

        val texto: String = "Mi nombre es: "
        val nombre: String = "David"

        Log.d("   CONCATENAR 1", texto + nombre + " y vivo en Envigado")
        Log.d("", "")
        Log.d("   CONCATENAR 2", "$texto $nombre  y vivo en Envigado")
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADOR ICREMENTO DECREMENTO
        Log.d("", "")
        Log.d(" INCREMENTO", "")
        Log.d("", "")

        var numero: Int = 23
        Log.d("   INCREMENTO", "El resultafo es" + ++numero)//SIGUE VALIENDO 23
        Log.d("   INCREMENTO", "El resultafo es" + numero)
        Log.d("   INCREMENTO", "El resultafo es" + numero++)

        Log.d("", "")
        Log.d(" DECREMENTO", "")
        Log.d("", "")

        numero = 23
        Log.d("   DECREMENTO", "El resultafo es" + --numero)//SIGUE VALIENDO 23
        Log.d("   DECREMENTO", "El resultafo es" + numero)
        Log.d("   DECREMENTO", "El resultafo es" + numero--)

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADORES DE COMPARACION
        Log.d("", "")
        Log.d(" COMPARACION", "")
        Log.d("", "")
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

        var a: Int = 5
        var b: Int = 6

        Log.d("   MENOR QUE", "a < b: " + (a < b))
        Log.d("   MAYOR QUE", "a > b: " + (a > b))
        Log.d("   MENOR O IGUAL QUE", "a <= b: " + (a <= b))
        Log.d("   MAYOR O IGUAL QUE", "a >= b: " + (a >= b))
        Log.d("   IGUAL QUE", "a == b: " + (a == b))
        Log.d("   DIFERENTE A", "a !=b: " + (a != b))

    }   //FUNCION OPERACIONES ARITMETICAS

    private fun operadoresLogicos() {
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //OPERADORES LOGICOS

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //IF ELSE
        Log.d("", "")
        Log.d(" IF ELSE", "")
        Log.d("", "")

        var a = 5
        if ((a % 2) == 0) {
            Log.d("   IF", "El numero: " + a + "es par.")
        } else {
            Log.d("   ELSE", "El numero: " + a + "es impar.")
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //WHEN
        Log.d("", "")
        Log.d(" WHEN", "")
        Log.d("", "")

        a = 78

        when (a) {
            1 -> Log.d("   FORMA 1", "El numero a es igual a 1")
            2 -> Log.d("   FORMA 1", "El numero a es igual a 2")
            3 -> Log.d("   FORMA 1", "El numero a es igual a 3")
            4 -> Log.d("   FORMA 1", "El numero a es igual a 4")
            else -> Log.d("   FORMA else", "El numero a no esta comprendida entre 1 y 4")
        }

        when (a) {
            in 1..4 -> Log.d("   FORMA 2", "El numero a esta comprendida entre 1 y 4")
            else -> {
                Log.d("   FORMA else", "El numero a no esta comprendida entre 1 y 4")
            }
        }

        when (a) {
            1, 2, 3, 4 -> Log.d("   FORMA 3", "El numero a esta comprendida entre 1 y 4")
            else -> {
                Log.d("   FORMA 3", "El numero a no esta comprendida entre 1 y 4")
            }
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //FOR
        Log.d("", "")
        Log.d(" FOR", "")
        Log.d("", "")

        for (numero in 30..40) {
            Log.d("   FOR", "El valor es: $numero")
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //WHILE
        Log.d("", "")
        Log.d(" WHILE", "")
        Log.d("", "")

        var contador: Int = 1
        while (contador <= 10) {
            Log.d("   WHILE", "El valos es: $contador")
            contador++
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //DO WHILE
        Log.d("", "")
        Log.d(" DO WHILE", "")
        Log.d("", "")

        contador = 15
        do {
            Log.d("   DO WHILE", "El valor es: $contador")
        } while (contador <= 10)
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //BREAK Y CONTINUE
        Log.d("", "")
        Log.d(" BREAK Y CONTINUE", "")
        Log.d("", "")

        //BREAK
        contador = 1
        while (contador <= 10) {
            Log.d("   BREAK", "El valos es: $contador")
            contador++
            if (contador == 5) {
                break
            }
        }
        //CONTINUE
        contador = 1
        while (contador <= 10) {
            Log.d("   BREAK", "El valos es: $contador")
            contador++
            if (contador == 5) {
                continue
            }
            Log.d("   CONTINUE", "El valor es: $contador")
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////////////

    }        //FUNCION OPERADORES LOGICOS

    private fun arrays() {

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //ARRAY

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        Log.d("", "")
        Log.d(" ARRAY", "")
        Log.d("", "")
        val canalesTV = arrayOf("La 1", "La 2", "Antena 3", "cuatro", "Tele 5", "Sexta")
        Log.d("  ARRAY", "La primera cadena de TV es: ${canalesTV[0]}")
        Log.d("  ARRAY", "La segunda cadena de TV es: ${canalesTV[1]}")
        Log.d("  ARRAY", "La tercera cadena de TV es: ${canalesTV[2]}")
        canalesTV.set(2, "A3")
        Log.d("  CAMBIO OBJETO ARRAY", "La tercera cadena de TV es: ${canalesTV[2]}")
        Log.d("  CANTIDAD ARRAY", "El numero de cadenas es: ${canalesTV.size}")

        for (canalTV in canalesTV) {
            Log.d("  ARRAY", canalTV)
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //ARRAYLIST

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        Log.d("", "")
        Log.d(" ARRAYLIST", "")
        Log.d("", "")

        val arrayListCanalesTV = ArrayList<String>()
        arrayListCanalesTV.add("La 1")
        arrayListCanalesTV.add("La 2")
        arrayListCanalesTV.add("A3")

        Log.d("   ARRAYLIST", "El canal numero 2 es: ${arrayListCanalesTV[1]}")
        arrayListCanalesTV.set(1, "Mi canal favorito")
        arrayListCanalesTV.remove("A3")

        Log.d("   CANTIDAD ARRAYLIST", "Numero de canales: ${arrayListCanalesTV.size}")

        if (arrayListCanalesTV.contains("A3")) {
            Log.d("   ENCONTAR ARRAYLIST", "Tu TV puede ver A3")
        } else {
            Log.d("   ENCONTAR ARRAYLIST", "Tu TV no puede ver A3")
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //HASHMAP

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        Log.d("", "")
        Log.d(" HASH MAP", "")
        Log.d("", "")
        val hashMapCanalesTV = HashMap<Int, String>()
        hashMapCanalesTV.put(1, "La 1")
        hashMapCanalesTV.put(2, "La 2")
        hashMapCanalesTV.put(3, "La A3")
        Log.d("   HASH MAP", "${hashMapCanalesTV[2]}")
        hashMapCanalesTV.put(2, "No se ve este canal")

        for (claves in hashMapCanalesTV.keys) {
            Log.d("   HASHMAP", "${hashMapCanalesTV[claves]}")
        }
    }                   //FUNCION OPERADORES LOGICOS

    private fun POO() {

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //POO

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        Log.d("", "")
        Log.d(" POO", "")

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //CLASES

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        Log.d("", "")
        Log.d(" CLASES", "")
        Log.d("", "")

        SmartPhone1("", "")                  //CLASE 1

        var smartPhone1 = SmartPhone1("SAMSUNG", " A31")
        var smartPhone2 = SmartPhone1("LG", " Lk-200")

        Log.d("   CLASES", "$smartPhone1")
        Log.d("   CLASES", "$smartPhone2")

        smartPhone1.fabricante1 = "GALAXY"

        Log.d("   CLASES", "$smartPhone1")
        Log.d("   CLASES", "$smartPhone2")

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //MODIFICADORES DE VISIBILIDAD

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        * SE LE AGREGO UNOS PARAMETROS DE VISIBILIDAD
        * PRIVATE
        * ABSTRACT
        * PUBLIC
        * PROTECTED
        * OPEN
        * */

        /*ESTOS MODIFICADORES NOS PERMITEN ACCEDER O NO A CLASES, FUNCIONES, VARIABLES, Y DEMAS TIPOS DE DATOS.
        *
        *
        * ELIMINAR "//"  PARA OBSERVAR LOS CAMBIOS
        *
        * */

        //SmartPhone2("", "")                  //CLASE 2

        Log.d("", "")
        Log.d(" VISIBILIDAD", "PARA OBSERVAR CAMBIOS ACCEDA AL MAIN")
        Log.d("", "")

        // val smartPhone3 = SmartPhone2("XIAOMI", " POCO X3")
        // val smartPhone4 = SmartPhone2("IPHONE", " 12 PRO MAX")

        Log.d("   VISIBILIDAD", "$smartPhone1")
        Log.d("   VISIBILIDAD", "$smartPhone2")
        //Log.d("   VISIBILIDAD", "$smartPhone3")
        //Log.d("   VISIBILIDAD", "$smartPhone4")

        smartPhone1.fabricante1 = "GALAXY"
        smartPhone2.fabricante1 = "ZTE"
        //smartPhone3.fabricante2 = "REDMI"
        //smartPhone4.fabricante2 = "APPLE"

        Log.d("", "")
        Log.d(" CAMBIO DE DATOS", "")
        Log.d("", "")

        Log.d("   VISIBILIDAD", "$smartPhone1")
        Log.d("   VISIBILIDAD", "$smartPhone2")
        //Log.d("   VISIBILIDAD", "$smartPhone3")
        //Log.d("   VISIBILIDAD", "$smartPhone4")
        Log.d("", "")

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //HERENCIA

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        Log.d("", "")
        Log.d(" HERANCIA DE CLASES", "")
        Log.d("", "")


        Log.d(
            "           ",
            "SE CREAN 2 CLASES LLAMADAS \"Cientifica\" QUE HEREDA DE \"Calculadora\", LA CUAL TIENE\n"
        )
        Log.d(
            "           ",
            "ATRIBUTOS QUE SON A Y B LAS CUALES SON NUMEROS ENTEROS PARA PERMITIR LA EJECUCION DE\n"
        )
        Log.d("           ", "LAS FUNCIONES QUE LA CONSTRUYEN.")


        val calCientifica = Cientifica()

        Log.d(" HERENCIA", " Valor suma: ${calCientifica.suma(4, 8)}")
        Log.d(" HERENCIA", " Valor resta: ${calCientifica.resta(4, 8)}")
        Log.d(" HERENCIA", " Valor multiplicacion: ${calCientifica.multiplicacion(4, 8)}")


    }
}