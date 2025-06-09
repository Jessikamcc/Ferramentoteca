
package ferramentoteca;

import java.util.Date;

public class Emprestimo {
    
    private int id;
    private int usuarioId;
    private int ferramentaId;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String status;

    public Emprestimo(int id, int usuarioId, int ferramentaId, Date dataEmprestimo, Date dataDevolucao, String status) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.ferramentaId = ferramentaId;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getFerramentaId() {
        return ferramentaId;
    }

    public void setFerramentaId(int ferramentaId) {
        this.ferramentaId = ferramentaId;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
