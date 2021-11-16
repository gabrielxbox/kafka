package api.kafka.domen;

public class MoreSimpleModel {
    private String ttle;
    private String descricao;


    public MoreSimpleModel() {
    }

    public MoreSimpleModel(String ttle, String descricao) {
        this.ttle = ttle;
        this.descricao = descricao;
    }

    public String getTtle() {
        return ttle;
    }

    public void setTtle(String ttle) {
        this.ttle = ttle;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "MoreSimpleModel{" +
                "ttle='" + ttle + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
