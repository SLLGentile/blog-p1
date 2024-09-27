package com.blog.blogfatec.controller;

import com.blog.blogfatec.model.BlogModel;
import com.blog.blogfatec.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postagens")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping
    public ResponseEntity<BlogModel> criarPostagem(@RequestBody BlogModel blogModel) {
        BlogModel novaPostagem = blogService.criarPostagem(blogModel);
        return ResponseEntity.ok(novaPostagem);
    }

    @GetMapping
    public ResponseEntity<List<BlogModel>> listarPostagens(@RequestParam(required = false) String autor) {
        if (autor != null) {
            return ResponseEntity.ok(blogService.obterPostagensPorAutor(autor));
        }
        return ResponseEntity.ok(blogService.listarPostagens());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlogModel> obterPostagemPorId(@PathVariable Long id) {
        BlogModel postagem = blogService.obterPostagemPorId(id);
        return postagem != null ? ResponseEntity.ok(postagem) : ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<BlogModel> atualizarPostagem(@RequestBody BlogModel blogModel) {
        BlogModel postagemAtualizada = blogService.atualizarPostagem(blogModel);
        return ResponseEntity.ok(postagemAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPostagem(@PathVariable Long id) {
        blogService.excluirPostagem(id);
        return ResponseEntity.noContent().build();
    }
}
