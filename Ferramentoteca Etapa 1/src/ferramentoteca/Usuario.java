package ferramentoteca;

public class Usuario {

    private int id;
    private String nome;
    private String senha;
    private String tipo;
    private int limiteEmprestimo;
    
    public Usuario() {
      
    }

    public Usuario (int id, String nome, String senha, String tipo, int limiteEmprestimo) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(int limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    

}
