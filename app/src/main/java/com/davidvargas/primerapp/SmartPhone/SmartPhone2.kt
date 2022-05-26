package com.davidvargas.primerapp.SmartPhone

abstract class SmartPhone2(private var fabricante2: String, private var modelo2: String) {

    public override fun toString(): String {
        return "Fabricado por $fabricante2, modelo $modelo2"
    }



}