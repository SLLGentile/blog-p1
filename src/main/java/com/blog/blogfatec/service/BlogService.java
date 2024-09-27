package com.blog.blogfatec.service;

import com.blog.blogfatec.model.BlogModel;
import com.blog.blogfatec.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {
    private static List<BlogModel> blogs = new ArrayList<BlogModel>();

    @Autowired
    private BlogRepository blogRepository;

    public BlogService(){
        BlogFake();
}

public void BlogFake(){
    BlogModel blog = new BlogModel();
    blog.setConteudo("Inédito");
    blog.setId(1L);
    blog.setTitulo("Lagoa Azul");
    blog.setdataPublicacao(10);
    blog.setAutor("Joao das Couves");
    blogs.add(blog);
}

    public BlogModel criarPostagem(BlogModel blogModel) {
        return blogRepository.save(blogModel);
    }

    public List<BlogModel> listarPostagens() {
        return blogRepository.findAll();
    }

    
    public BlogModel obterPostagemPorId(Long id) {
        return blogRepository.findById(id);
    }
    

    public List<BlogModel> obterPostagensPorAutor(String autor) {
        return blogRepository.findByAutor(autor);
    }

    public BlogModel atualizarPostagem(BlogModel blogModel) {
        return blogRepository.save(blogModel);
    }

    public void excluirPostagem(Long id) {
        blogRepository.deleteById(id);
    }
}
