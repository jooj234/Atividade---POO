public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;
    private double taxaDeRendimento;

    //GET E SET
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        if(diaDeRendimento < 0){
            System.out.println("Dia inválido");
        }
        else{
            this.diaDeRendimento = diaDeRendimento;
        }
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        if(taxaDeRendimento < 0){
            System.out.println("Taxa inválida");
        }
        else{
            this.taxaDeRendimento = taxaDeRendimento;
        }
    }

    //CONSTRUTOR


    public ContaPoupanca(String nomeCliente, int numeroConta, int diaDeRendimento, double taxaDeRendimento) {
        super(nomeCliente, numeroConta);
        setDiaDeRendimento(diaDeRendimento);
        setTaxaDeRendimento(taxaDeRendimento);
    }

    //METODOS
    public void sacar(float valor){
        if(valor > getSaldo()){
            System.out.println("Saque inválido");
        }
        else{
            setSaldo(getSaldo() - valor);
        }
    }
    public void calcularNovoSaldo(){
        float novoSaldo = 0;
        for(int i=0; i<getDiaDeRendimento(); i++){
            novoSaldo = (float) (getSaldo() + (getSaldo()*getTaxaDeRendimento()));
        }
        if(novoSaldo < 0){
            System.out.println("Saldo inválido");
        }
        else{
            setSaldo(novoSaldo);
        }
    }
}