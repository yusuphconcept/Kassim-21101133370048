package com.yusuphQs.lifespan.service;

import com.yusuphQs.lifespan.entity.Manager;
import org.hibernate.mapping.List;

public interface ManagerService {
    //create
    Manager createManager(Manager manager);
    //get all
    List<Manager> getAllManger();
    //get by id
    Manager getManagerById(Long id);
    //update
    Manager updateManger(Long id, Manager manager);
    //delete
    void deleteManager(Long id);
}
