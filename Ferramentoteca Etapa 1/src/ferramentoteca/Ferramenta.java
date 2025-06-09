
package ferramentoteca;

import java.sql.Date;

public class Ferramenta {
    private int id;
    private String nome;
    private String estado; 
    private String localizacao;
    private String motivoDesativacao;
    private java.sql.Date previsaoRetorno;

    public Ferramenta(int id, String nome, String estado, String localizacao, String motivoDesativacao, Date previsaoRetorno) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.localizacao = localizacao;
        this.motivoDesativacao = motivoDesativacao;
        this.previsaoRetorno = previsaoRetorno;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getMotivoDesativacao() {
        return motivoDesativacao;
    }

    public void setMotivoDesativacao(String motivoDesativacao) {
        this.motivoDesativacao = motivoDesativacao;
    }

    public Date getPrevisaoRetorno() {
        return previsaoRetorno;
    }

    public void setPrevisaoRetorno(Date previsaoRetorno) {
        this.previsaoRetorno = previsaoRetorno;
    }
    
}
