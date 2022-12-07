package projeto

class Banco {

    private val mutableList = mutableListOf<ContaBancaria>()
    private val lista = mutableList
    fun inserir(contaBancaria: ContaBancaria) {
        mutableList.add(contaBancaria)
    }
    fun remover(contaBancaria: ContaBancaria) {
        mutableList.remove(contaBancaria)
    }
    fun procurarConta(contaBancaria: Int) {
        for(find in lista) {
            if(find.numeroConta == contaBancaria) {
               return println("Conta com o número  ${find.numeroConta} encontrada!")
            } else {
                println("Conta não encontrada")
            }
        }
    }
}