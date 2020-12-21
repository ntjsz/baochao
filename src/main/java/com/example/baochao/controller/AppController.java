package com.example.baochao.controller;

import com.example.baochao.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/database")
public class AppController {

    @Autowired
    private DatabaseService databaseService;

    @RequestMapping("/refresh")
    public void refreshDataBase() {
        databaseService.refresh();
    }
}
