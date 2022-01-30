package nvc.bcit.icefactory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import nvc.bcit.icefactory.models.Factory;
import nvc.bcit.icefactory.services.FactoryService;

@Controller
public class MainController {
    @Autowired
    private FactoryService factoryService;
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/factory")
    public ModelAndView getFactories(){
        List<Factory> factories = factoryService.findAll();
        return new ModelAndView("factory", "factories", factories);
    }

    @GetMapping("/factory/{id}")
    public ModelAndView getFactory(@PathVariable int id){
        Factory factory = factoryService.getById(id);
        return new ModelAndView("factory-detail", "factory", factory);
    }
}