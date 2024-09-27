package com.blog.blogfatec.repository;

import com.blog.blogfatec.model.BlogModel;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository //extends JpaRepository<BlogModel, Long>
 {
    List<BlogModel> findByAutor(String autor);
    BlogModel save(BlogModel blogModel);
    List<BlogModel> findAll();
    BlogModel findById(Long id);
    void deleteById(Long id);
}
