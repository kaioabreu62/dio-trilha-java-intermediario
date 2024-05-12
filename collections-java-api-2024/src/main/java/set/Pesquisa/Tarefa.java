package main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean verificaTarefa;

    public Tarefa(String descricao, boolean verificaTarefa) {
        this.descricao = descricao;
        this.verificaTarefa = verificaTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setVerificaTarefa(boolean verificaTarefa) {
        this.verificaTarefa = verificaTarefa;
    }

    public boolean isVerificaTarefa() {
        return verificaTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", verificaTarefa=" + verificaTarefa +
                '}';
    }
}
