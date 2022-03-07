package com.kanad.springbootmongodbdocker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "books")
public class Book {

    @Id
    private Integer id;
    private String name;
    private String authorName;
}
