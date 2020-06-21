package dev.sandeep.IBClone.controllers;

import dev.sandeep.IBClone.beans.User;
import dev.sandeep.IBClone.dto.ResponseDto;
import dev.sandeep.IBClone.services.UserServices;
import dev.sandeep.IBClone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(Constants.USERS_END_POINT)
public class UserController {

    //autowiring from field
    @Autowired
    UserServices userServices;

    //Autowiring from constructor
    /*@Autowired
    UserController(UserServices userServices){
        this.userServices = userServices;
    }*/
    @PostMapping
    public User createUser(@RequestBody User user){
        return userServices.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(name = "id") UUID id){
       /* User serviceResponse = userServices.getUser(id);
        if(serviceResponse == null){
            return new ResponseDto(HttpStatus.NOT_FOUND,serviceResponse);
        }
        return new ResponseDto(HttpStatus.FOUND, serviceResponse);*/
        return  userServices.getUser(id);
    }
}
