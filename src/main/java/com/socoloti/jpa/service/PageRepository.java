package com.socoloti.jpa.service;

import com.socoloti.jpa.model.Book;
import com.socoloti.jpa.model.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PageRepository extends PagingAndSortingRepository<Page, Long> {
    List<Page> findByBook(Book book, Sort sort);
}
