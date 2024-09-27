package com.blog.blogfatec.model;

//import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

//@Entity
public class BlogModel implements Serializable {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String conteudo;
    private String autor;
    //@ElementCollection
    private List<String> tags;
    private int dataPublicacao;
    private Long idUsuario;


    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getdataPublicacao() {
        return dataPublicacao;
    }

    public void setdataPublicacao(int dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}

