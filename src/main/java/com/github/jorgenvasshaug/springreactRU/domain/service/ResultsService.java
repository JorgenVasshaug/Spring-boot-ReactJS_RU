package com.github.jorgenvasshaug.springreactRU.domain.service;

import com.github.jorgenvasshaug.springreactRU.domain.entity.randomuser.Result;
import com.github.jorgenvasshaug.springreactRU.domain.repository.ResultsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultsService {

    private final ResultsRepository resultsRepository;

    public ResultsService(ResultsRepository resultsRepository) {
        this.resultsRepository = resultsRepository;
    }

    public Iterable<Result> list() {
        return resultsRepository.findAll();
    }

    public Result save(Result result) {
        return resultsRepository.save(result);
    }

    public void save(List<Result> results) {
        resultsRepository.saveAll(results);
    }
}
