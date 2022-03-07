package com.kanad.springbootmongodbdocker.repository;

import com.kanad.springbootmongodbdocker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {
}
