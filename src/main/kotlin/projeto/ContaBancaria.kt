package projeto

abstract class ContaBancaria(open val numeroConta: Int) {

    internal var saldo: Double = 0.0
    abstract fun sacar(valor: Double)
    abstract fun depositar(valor: Double)
    abstract fun transferir(valor: Double, contaBancaria: ContaBancaria)

    open fun mostrarDados(){
    }
}