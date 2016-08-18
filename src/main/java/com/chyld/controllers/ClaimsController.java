package com.chyld.controllers;

import com.chyld.models.Claim;
import com.chyld.repositories.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping({"/claims"})
public class ClaimsController {
    private ClaimRepository repo;

    @Autowired
    public void setRepo(ClaimRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Iterable<Claim> index(@RequestParam(name = "page", required = false, defaultValue = "0") int page){
        PageRequest pr = new PageRequest(page, 3);
        return repo.findAll(pr);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Claim show(@PathVariable int id){
        return repo.findOne(id);
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public Claim create(@RequestBody Claim task){
        return repo.save(task);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        repo.delete(id);
    }

//    @RequestMapping(path = "/{id}/complete", method = RequestMethod.PATCH)
//    public Claim complete(@PathVariable int id){
//        Claim t = repo.findOne(id);
//        t.setIsComplete(!t.getIsComplete());
//        return repo.save(t);
//    }
}
