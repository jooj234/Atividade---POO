public class Banco {
    public static void main(String[] args) {
        //ArrayList<ContaBancaria> cliente;

        ContaPoupanca cliente1 = new ContaPoupanca("Nelson", 123,5,10);
        ContaEspecial cliente2 = new ContaEspecial("Eduardo", 345,400);

        //cliente.add(cliente1);

        //SACAR
        cliente1.sacar(400);
        cliente2.sacar(400);
        System.out.println("Cliente " + cliente1.getNomeCliente() + " possui saldo: " + cliente1.getSaldo());
        System.out.println("Cliente " + cliente2.getNomeCliente() + " possui saldo: " + cliente2.getSaldo());

        //DEPOSITAR
        cliente1.depositar(400);
        cliente2.depositar(400);
        System.out.println("Cliente " + cliente1.getNomeCliente() + " possui saldo: " + cliente1.getSaldo());
        System.out.println("Cliente " + cliente2.getNomeCliente() + " possui saldo: " + cliente2.getSaldo());

        //RENDIMENTO
        cliente1.calcularNovoSaldo();

        //DADOS
        System.out.println("Nome: " + cliente1.getNomeCliente() + "\nConta: " + cliente1.getNumeroConta() + "\nSaldo: " + cliente1.getSaldo()
                + "\nTaxa de rendimento: "+cliente1.getTaxaDeRendimento());
        System.out.println("Nome: " + cliente2.getNomeCliente() + "\nConta: " + cliente2.getNumeroConta() + "\nSaldo: " + cliente2.getSaldo()
                + "\nLimite: "+cliente2.getLimite());
    }
}