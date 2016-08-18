package com.chyld.controllers;

import com.chyld.models.Car;
import com.chyld.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping({"/cars"})
public class CarsController {
    private CarRepository repo;

    @Autowired
    public void setRepo(CarRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Iterable<Car> index(@RequestParam(name = "page", required = false, defaultValue = "0") int page){
        PageRequest pr = new PageRequest(page, 3);
        return repo.findAll(pr);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Car show(@PathVariable int id){
        return repo.findOne(id);
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public Car create(@RequestBody Car task){
        return repo.save(task);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        repo.delete(id);
    }

//    @RequestMapping(path = "/{id}/complete", method = RequestMethod.PATCH)
//    public Car complete(@PathVariable int id){
//        Car t = repo.findOne(id);
//        t.setIsComplete(!t.getIsComplete());
//        return repo.save(t);
//    }
}
