package ferramentoteca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emprestimo {

    private int id;
    private int usuarioId;
    private int ferramentaId;
    private String professorNome;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String status;

    public Emprestimo() {
    }

    public Emprestimo(int id, int usuarioId, int ferramentaId, String professorNome, Date dataEmprestimo, Date dataDevolucao, String status) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.ferramentaId = ferramentaId;
        this.professorNome = professorNome;
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

    public String getProfessorNome() {
        return professorNome;
    }

    public void setProfessorNome(String professorNome) {
        this.professorNome = professorNome;
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

    public String getDataDevolucaoFormatada() {
        if (dataDevolucao == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataDevolucao);
    }

    public String getResponsavel() {
        return professorNome != null ? professorNome : "";
    }

}
