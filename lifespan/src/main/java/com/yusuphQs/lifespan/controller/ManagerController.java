package com.yusuphQs.lifespan.controller;

import com.yusuphQs.lifespan.entity.Manager;
import com.yusuphQs.lifespan.service.ManagerService;
import org.hibernate.mapping.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/manager_table")
public class ManagerController {

    private ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    //create
    @PostMapping
    public ResponseEntity<Manager> createManager(@ResponseBody Manager manager){
        return new ResponseEntity<>(managerService.createManager(manager), HttpStatus.CREATED);
    }

    //get all manager
    @GetMapping
    public List<Manager> getAllManager(){
        return managerService.getAllManger();

    }

    //get manager by id
    @GetMapping("{id}")
    public ResponseEntity<Manager> getManagerById(@PathVariable Long id){
        return new ResponseEntity<>(managerService.getManagerById(id), HttpStatus.OK);
    }
    //update
    @PutMapping("{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable Long, @ResponseBody Manager manager){
        return new ResponseEntity<>(managerService.updateManger(id, manager), HttpStatus.OK);
    }

    //delete
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteManager(@PathVariable Long id){
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }
}
