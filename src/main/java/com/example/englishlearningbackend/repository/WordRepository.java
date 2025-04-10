package com.example.englishlearningbackend.repository;

import com.example.englishlearningbackend.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

    @Query("SELECT w FROM Word w LEFT JOIN FETCH w.meanings LEFT JOIN FETCH w.sentenceMappings WHERE w.word = :word")
    Word findWordWithDetails(String word);
}
