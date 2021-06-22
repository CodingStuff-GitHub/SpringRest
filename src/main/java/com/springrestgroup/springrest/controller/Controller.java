package com.springrestgroup.springrest.controller;

import com.springrestgroup.springrest.entities.Load;
import com.springrestgroup.springrest.services.LoadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    public final LoadService loadService;

    public Controller(LoadService loadService) {
        this.loadService = loadService;
    }

    //Homepage +
    @GetMapping("/home")
    public String home() {
        return "This is HomePage";
    }

    //Get All Loads +
    @GetMapping("/loads")
    public List<Load> GetLoad() {
        return this.loadService.GetLoad();
    }

    @GetMapping("loads/{id}")
    public Load GetLoad(@PathVariable String id) {
        return this.loadService.GetLoad(Integer.parseInt(id));
    }

    //Add a new load +
    @PostMapping("/loads")
    public Load addLoad(@RequestBody Load load) {
        return this.loadService.addLoad(load);
    }

    //Update load +
    @PutMapping("/loads")
    public Load updateLoad(@RequestBody Load load) {
        return this.loadService.updateLoad(load);
    }

    //Delete load
    @DeleteMapping("loads/{id}")
    public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String id) {
        try {
            this.loadService.deleteLoad(Integer.parseInt(id));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
