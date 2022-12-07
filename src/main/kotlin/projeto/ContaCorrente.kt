package projeto

class ContaCorrente(numeroConta: Int) : ContaBancaria(numeroConta) {
    private val taxaDeOperacao: Double = 2.50

    override fun sacar(valor: Double) {
        if (valor + taxaDeOperacao <= saldo) {
            saldo -= valor + taxaDeOperacao
            println("Saque efetuado com sucesso!")
        } else {
            println("Saldo indisponível")
        }
    }

    override fun depositar(valor: Double){
        if (valor - taxaDeOperacao > 0) {
            saldo += valor - taxaDeOperacao
            println("Deposito efetuado com sucesso!")
        } else {
            println("Valor de depósito inválido")
        }
    }

    override fun transferir(valor: Double, contaBancaria: ContaBancaria) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor)
            contaBancaria.depositar(valor)
            println("Transferencia realizada com sucesso!")
        } else {
            println("Saldo insuficiente para transferência")
        }
    }

    override fun mostrarDados() {
        println("Conta Corrente:\n Numero: $numeroConta")
        println("Seu saldo atual é: $saldo")
    }

    override fun toString(): String {
        return ""
    }
}