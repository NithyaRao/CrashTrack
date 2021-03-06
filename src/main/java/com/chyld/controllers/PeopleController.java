package com.chyld.controllers;

import com.chyld.models.Person;
import com.chyld.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping({"/people"})
public class PeopleController {
    private PersonRepository repo;

    @Autowired
    public void setRepo(PersonRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Iterable<Person> index(@RequestParam(name = "page", required = false, defaultValue = "0") int page){
        PageRequest pr = new PageRequest(page, 3);
        return repo.findAll(pr);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Person show(@PathVariable int id){
        return repo.findOne(id);
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public Person create(@RequestBody Person person){
        return repo.save(person);
    }

//    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
//    public Person show(@PathVariable Person person){
//        return repo.save(person);
//    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        repo.delete(id);
    }

//    @RequestMapping(path = "/{id}/complete", method = RequestMethod.PATCH)
//    public Person complete(@PathVariable int id){
//        Person t = repo.findOne(id);
//        t.setIsComplete(!t.getIsComplete());
//        return repo.save(t);
//    }
}
