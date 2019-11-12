package com.example.demo.service;

import com.example.demo.domain.Worker;
import com.example.demo.repo.Repo;
import com.example.demo.repo.WorkerRepos;

import java.util.List;

@org.springframework.stereotype.Service

public class Service {
    private Repo repo;

    public Service(Repo repo) {
        this.repo = repo;
    }

    public List<Worker> getAll() {
        return repo.getAll();
    }
    public void save(Worker worker){
        repo.save(worker);
    }
    public List<Worker> findById(int id){
        return repo.findById(id);
    }

}
