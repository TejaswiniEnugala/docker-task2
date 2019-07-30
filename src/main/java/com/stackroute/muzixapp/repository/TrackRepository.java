package com.stackroute.muzixapp.repository;

import com.stackroute.muzixapp.domain.Track;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
/*
    @Query("SELECT t FROM Track t WHERE t.name = ?1")
    List<Track> getTrackbyName(String name);*/
}