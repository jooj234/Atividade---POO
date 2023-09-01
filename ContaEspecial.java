public class ContaEspecial extends ContaBancaria {
    private float limite;

    //GET E SET

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite < 0) {
            System.out.println("Limite inválido");
        } else {
            this.limite = limite;
        }
    }
    //CONSTRUTOR


    public ContaEspecial(String nomeCliente, int numeroConta, float limite) {
        super(nomeCliente, numeroConta);
        setLimite(limite);
    }

    //METODOS
    public void sacar(float saque){
        if(getSaldo()-saque < -limite){
            System.out.println("Ultrapassou o limite");
        }
        else{
            setSaldo(getSaldo() - saque);
        }
    }
}