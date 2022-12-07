package projeto

class ContaPoupanca(numeroConta: Int) : ContaBancaria(numeroConta) {
    private var limite: Double = 500.0
    override fun sacar(valor: Double) {
        if(valor <= saldo) {
            saldo -= valor
            println("Saque efetuado com sucesso!")
        } else if (valor <= limite + saldo ) {
           if(valor <= limite) {
               saldo -= valor
               limite -= valor
           } else {
               saldo -= valor
               limite += saldo
           }
        } else {
            println("Valor de saque indisponivel")
        }
    }
    override fun depositar(valor: Double) {
        if(limite != 500.0) {
            val diferencaLimiteMaximo = 500 - limite
            limite += diferencaLimiteMaximo
            saldo += valor
            println("Depósito efetuado com sucesso!")
            } else if(valor > 0) {
            saldo += valor
            println("Depósito efetuado com sucesso!")
        } else {
            println("Valor inválido")
        }
    }

    override fun transferir(valor: Double, contaBancaria: ContaBancaria) {
        if (valor > 0 && saldo >= valor) {
            contaBancaria.transferir(valor, contaBancaria)
            println("Transferencia realizada com sucesso!")
        } else {
            println("Saldo insuficiente para realizar a transferência")
        }
    }

    override fun mostrarDados() {
        println("Conta Poupança:\n Numero: $numeroConta")
        println("Seu saldo atual é: $saldo")
        println("Seu cheque especial atualmente está no valor de: $limite")
    }
}
