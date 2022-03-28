package com.socoloti.jpa.service;

import com.socoloti.jpa.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
}
