package com.gerson.crudProgramacion.controllers;

import com.gerson.crudProgramacion.dto.UserDTO;
import com.gerson.crudProgramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/guardar")
    public ResponseEntity<UserDTO> saveUserController(UserDTO obj){
        return ResponseEntity.ok(userService.saveUser(obj));
    }
    @GetMapping("/Listar")
    public ResponseEntity<List<UserDTO>>getAllUserController(){
        return ResponseEntity.ok(userService.getUsers());
    }
}