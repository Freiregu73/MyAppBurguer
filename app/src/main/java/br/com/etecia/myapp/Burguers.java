package br.com.etecia.myapp;

public class Burguers {
    private String titulo;
    private String descricao;
    private String preco;
    private int imgBurguer;

    public Burguers(String titulo, String descricao, String preco, int imgBurguer) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.imgBurguer = imgBurguer;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getImgBurguer() {
        return imgBurguer;
    }

    public void setImgBurguer(int imgBurguer) {
        this.imgBurguer = imgBurguer;
    }
}
