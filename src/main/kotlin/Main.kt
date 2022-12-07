import projeto.Banco
import projeto.ContaCorrente
import projeto.ContaPoupanca
import projeto.Relatorio

fun main() {

    val contaCorrente = ContaCorrente(numeroConta = 123456)
    val contaPoupanca = ContaPoupanca(numeroConta = 12345)
    val contaCorrente2 = ContaCorrente(numeroConta = 1234567)
    val relatorioCorrente = Relatorio(contaCorrente)
    val relatorioPoupanca = Relatorio(contaPoupanca)
    val banco = Banco()

    contaPoupanca.sacar(100.0)
    relatorioPoupanca.gerarRelatorio()
    println()
    contaPoupanca.depositar(700.0)
    relatorioPoupanca.gerarRelatorio()
    contaPoupanca.sacar(900.0)
    relatorioPoupanca.gerarRelatorio()
    println()
    contaPoupanca.depositar(400.0)
    relatorioPoupanca.gerarRelatorio()
    println()
    contaPoupanca.depositar(400.0)
    relatorioPoupanca.gerarRelatorio()
    println()
    contaPoupanca.sacar(600.0)
    relatorioPoupanca.gerarRelatorio()
    println()
    contaPoupanca.sacar(50.0)
    relatorioPoupanca.gerarRelatorio()
    println()
    contaPoupanca.depositar(151.0)
    relatorioPoupanca.gerarRelatorio()
    println()

}