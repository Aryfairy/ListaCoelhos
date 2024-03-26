package br.com.etecia.listacoelhos;

public class Coelhos {
    private String nome;
    private int image;
    private String descricao;
    private Double avaliacao;

    public Coelhos(String nome, int image, String descricao, Double avaliacao) {
        this.nome = nome;
        this.image = image;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public Double getAvaliacao(){
        return avaliacao;
    }
    public void setAvaliacao(Double avaliacao){
        this.avaliacao = avaliacao;
    }

}

