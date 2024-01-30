package com.omunoz.graphqltest;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

//    @QueryMapping
//    public Book bookById(@Argument String id){
//        return Book.getById(id);
//    }

    @QueryMapping(name = "bookById")
    public Book findBookById(@Argument(name = "id") String bookId){
        return Book.getById(bookId);
    }

//    @SchemaMapping
//    public Author author(Book book){
//        return Author.getById(book.authorId());
//    }

    @SchemaMapping(field = "author")
    public Author findAuthor(Book book){
        return Author.getById(book.authorId());
    }

}
