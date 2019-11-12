package com.example.demo.controller;

import com.example.demo.domain.Worker;

import com.example.demo.repo.WorkerRepos;

import com.example.demo.service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/")

public class WorkerController {

    private final Service service;


    public WorkerController(Service service) {
        this.service = service;


    }


    @GetMapping("/")
    public String getAll(Model model) throws IOException {
        model.addAttribute("workers", service.getAll());
        return "main";
    }

    @GetMapping("/rentCalc")
    public String rentCalc(Model model){
        model.addAttribute("workers",service.getAll());
        return "rentCalc";
    }

    @GetMapping("/stocks")
    public String getAllStoks(Model model) {
        return "stocks";
    }

    @GetMapping("/add")
    public String addWorker() {
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Worker worker) {
        service.save(worker);
        return "redirect:/";
    }
    @GetMapping("/worker/{id}")
    public String workerPage(@RequestParam int id,
                             Model model){

        model.addAttribute("worker",service.findById(id));
        return"worker";
    }
}
