package projeto

class Relatorio(val contaBancaria: ContaBancaria) {

    fun gerarRelatorio(){
       contaBancaria.mostrarDados()
    }
}