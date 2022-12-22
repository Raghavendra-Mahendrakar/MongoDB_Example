package example.MongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import example.MongoDB.Entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
