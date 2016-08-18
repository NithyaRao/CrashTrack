//package com.chyld.controllers;
//
//import com.chyld.models.ClaimsCars;
//import com.chyld.repositories.ClaimCarRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin
//@RequestMapping({"/claims_cars"})
//public class ClaimsCarsController {
//    private ClaimCarRepository repo;
//
//    @Autowired
//    public void setRepo(ClaimCarRepository repo) {
//        this.repo = repo;
//    }
//
//    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
//    public Iterable<ClaimsCars> index(@RequestParam(name = "page", required = false, defaultValue = "0") int page){
//        PageRequest pr = new PageRequest(page, 3);
//        return repo.findAll(pr);
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    public ClaimsCars show(@PathVariable int id){
//        return repo.findOne(id);
//    }
//
//    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
//    public ClaimsCars create(@RequestBody ClaimsCars task){
//        return repo.save(task);
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable int id){
//        repo.delete(id);
//    }
//
////    @RequestMapping(path = "/{id}/complete", method = RequestMethod.PATCH)
////    public ClaimsCars complete(@PathVariable int id){
////        ClaimsCars t = repo.findOne(id);
////        t.setIsComplete(!t.getIsComplete());
////        return repo.save(t);
////    }
//}
