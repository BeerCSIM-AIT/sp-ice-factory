package nvc.bcit.icefactory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.models.Factory;
import nvc.bcit.icefactory.repository.FactoryRepository;

@Service
public class FactoryService {
    @Autowired
    private FactoryRepository factoryRepository;

    public List<Factory> findAll(){
        return factoryRepository.findAll();
    }

    public Factory getById(int id){
        return factoryRepository.getById(id);
    }

}
