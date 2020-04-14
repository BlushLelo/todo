package dominio;

public class Tarefa {

    private String descricao;
    private boolean completa;

    public Tarefa(String descricao, boolean completa) {
        this.descricao = descricao;
        this.completa = completa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}
