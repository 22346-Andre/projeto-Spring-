package com.andre.api.rest.Controller;


import com.andre.api.rest.Models.User;
import com.andre.api.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;




    @GetMapping(value = "/")
    public String getPage(){

        return "Welcome";
    }

    @GetMapping(value = "/users")
    public List<User>   getUsers(){
        return userRepo.findAll();
    }
    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "saved....";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user ){
        User updateUser = userRepo.findById(id).get();
        updateUser.setPrimeiroNome(user.getPrimeiroNome());
        updateUser.setLastName(user.getLastName());
        updateUser.setOccupation(user.getOccupation());
        updateUser.setAge(user.getAge());
        userRepo.save(updateUser);
        return "Atualizado...";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "delete user with the id: "+id;



    }



}
