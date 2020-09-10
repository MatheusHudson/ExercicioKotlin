package br.tripeAula.com

class Tripe(
        var dobrado: Boolean,
        var alturaMinima: Double,
        var alturaMaxima: Double,
        var alturaAtual: Double

) {

    fun definirAltura(novaAltura: Double) {
        if (novaAltura >= alturaMinima && novaAltura <= alturaMaxima) {
            alturaAtual = novaAltura
            println("Altura alterada com sucesso!")
        } else {
            println("Altura invalida!")
        }

    }


    fun dobrar() {
        if (!dobrado) {
            dobrado = true;
            println(" Tripe dobrado com sucesso!")
        } else {
            println("Tripé já está dobrado")
        }

    }

    fun desdobrar() {
        if (dobrado) {
            println(" Tripe desdobrado com sucesso!")
            dobrado = false;
        } else {
            println("Tripé já está desdobrado")
        }

    }


    fun guarda() :Boolean {
        if(alturaAtual == alturaMinima && dobrado){
            println("Tripé pronto para ser guardado !")
            return true;
        } else {
            println("Tripé não esta pronto para ser guardado, defina a altura para minima e o dobre")
            return false;
        }
    }

    fun prontoParaGuardar() {
        if(guarda()) {
            println("Tripé pronto para guarda")
        } else {
            println("Tripé não está pronto para guarda")
        }
    }

    fun usar(): Boolean {
        if(!dobrado &&alturaAtual > (alturaMaxima/2) ) {
            println("Tripé pronto para uso!")
            return true;
        } else {
            println("Tripé não está pronto para uso")
            return false;
        }
    }

    fun prontoParaUsar() {
        if(usar()) {
            println("Tripé pronto para uso!")
        } else {
            println("Tripé não está pronto para uso")
        }
    }
}