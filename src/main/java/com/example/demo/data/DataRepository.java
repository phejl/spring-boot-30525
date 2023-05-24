package com.example.demo.data;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.stream.Stream;

public interface DataRepository extends MongoRepository<Data, ObjectId>, DataRepositoryCustom {

    Data findByUid(String uid);

    @Query("{ 'uid': ?0 }")
    Stream<Data> findAllByUidAndStream(String uid);

}
