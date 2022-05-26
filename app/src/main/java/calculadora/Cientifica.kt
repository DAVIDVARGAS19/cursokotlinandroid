package calculadora

import calculadora.Calculadora

class Cientifica() : Calculadora() {


    fun multiplicacion(a: Int, b: Int): Int {
        return a * b
    }

    fun division(a: Int, b: Int): Int {
        return (a / b)
    }
}