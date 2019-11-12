//package com.example.demo.service;
//
//import com.example.demo.domain.Worker;
//import com.example.demo.repo.WorkerRepos;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//
//public class WorkerService {
//
//    private final WorkerRepos repos;
//    public WorkerService(WorkerRepos repos) {
//
//        this.repos = repos;
//    }
//
//
//
//    public List<Worker> findAll() {
//        return (List<Worker>) repos.findAll();
//    }
//
//
////    public void save(Worker worker) {
////        repo.save(worker);
////    }
////
////    public void add(WorkerDto dto) {
////        var worker = new Worker(dto.getWorkerId(),dto.getRent(),0,0,0,0,0,0,0,0,0,0,0,0);
////        save(worker);
////    }
//    public void save(Worker worker){
//        repos.save(worker);
//    }
//
//
////    public void add(int rent, int janRent, int febRent, int marRent, int aprRent, int mayRent, int juneRent, int julyRent, int augRent, int sepRent, int octRent, int novRent, int decRent) {
////        repo.save(rent,janRent,febRent,marRent,aprRent,mayRent,juneRent,julyRent,augRent,sepRent,octRent,novRent,decRent);
////    }
//}
