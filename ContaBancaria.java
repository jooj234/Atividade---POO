public abstract class ContaBancaria {
    private String nomeCliente;
    private int numeroConta;
    protected float saldo;

    // GET E SET
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if(nomeCliente == null){
            System.out.println("nome do cliente não informado");
            this.nomeCliente = "Cliente não informado";
        }
        else {
            if (nomeCliente.equals(" ")) {
                System.out.println("nome do cliente não informado");
                this.nomeCliente = "Cliente não informado";
            } else {
                this.nomeCliente = nomeCliente;
            }
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if(numeroConta < 0){
            System.out.println("numero da conta não informado");
        }
        else {
            this.numeroConta = numeroConta;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    protected void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //CONSTRUTOR

    public ContaBancaria(String nomeCliente, int numeroConta) {
        setNomeCliente(nomeCliente);
        setNumeroConta(numeroConta);
        this.saldo = 0;
    }

    // METODOS

    abstract void sacar(float valor);

    public void depositar(float valor){
        if(valor <= 0){
            System.out.println("Deposito inválido");
        }
        else{
            this.saldo = getSaldo() + valor;
        }
    }
}