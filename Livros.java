public class Livros {
    private String titulo;
    private String nomeAutor;
    private int anoPubli;
    private int numPag;
    private String status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null){
            System.out.println("Sem título");
            this.titulo = "sem titulo";
        }
        else{
            if(titulo.equals(" ")){
                System.out.println("Sem título");
                this.titulo = "sem titulo";
            }
            else{
                this.titulo = titulo;
            }
        }
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        if(nomeAutor == null){
            System.out.println("autor não informado");
            this.nomeAutor = "autor não informado";
        }
        else {
            if (nomeAutor.equals(" ")) {
                System.out.println("autor não informado");
                this.nomeAutor = "autor não informado";
            } else {
                this.nomeAutor = nomeAutor;
            }
        }
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        if(numPag < 150 || numPag > 1000){
            System.out.println("quantidade inválida");
        }
        else{
            this.numPag = numPag;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String attStatus) {
        this.status = attStatus;
    }

    public Livros(String titulo, String nomeAutor, int anoPubli, int numPag) {
        setTitulo(titulo);
        setNomeAutor(nomeAutor);
        setAnoPubli(anoPubli);
        setNumPag(numPag);
        setStatus("Disponivel");
    }
}