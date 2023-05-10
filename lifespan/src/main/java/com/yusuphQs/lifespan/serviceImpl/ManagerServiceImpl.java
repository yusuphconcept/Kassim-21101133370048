package com.yusuphQs.lifespan.serviceImpl;

import com.yusuphQs.lifespan.entity.Manager;
import com.yusuphQs.lifespan.exception.ManagerException;
import com.yusuphQs.lifespan.repository.ManagerRepository;
import com.yusuphQs.lifespan.service.ManagerService;
import org.hibernate.mapping.List;

public class ManagerServiceImpl implements ManagerService {

    private ManagerRepository managerRepository;

    public ManagerServiceImpl(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @java.lang.Override
    public Manager createManager(Manager manager) {
        return managerRepository.save(manager);
    }

    @java.lang.Override
    public List<Manager> getAllManger() {
        return managerRepository.findAll();
    }

    @java.lang.Override
    public Manager getManagerById(Long id) {
        Manager manager = managerRepository.findById(id)
                .orElseThrow(()->new ManagerException("Not found"));
        return manager;
    }

    @java.lang.Override
    public Manager updateManger(Long id, Manager manager) {
        Manager manager1 = managerRepository.findById(id)
                .orElseThrow(()->new ManagerException("Not found"));

        manager1.setManagerID(manager.getManagerID());
        manager1.setFirstname(manager.getFirstname());
        manager1.setLastname(manager.getLastname());

        Manager updateManager = managerRepository.save(manager1);
    return updateManager;
    }

    @java.lang.Override
    public void deleteManager(Long id) {
        Manager manager = managerRepository.findById(id)
                .orElseThrow(()->new ManagerException("Not found"));
        managerRepository.delete(manager);

    }
}
