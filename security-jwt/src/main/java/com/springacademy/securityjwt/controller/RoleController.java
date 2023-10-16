package com.springacademy.securityjwt.controller;

import com.springacademy.securityjwt.entity.Role;
import com.springacademy.securityjwt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping({"/create-new-role"})
    public Role createNewRole(@RequestBody Role role){
        return roleService.createNewRole(role);
    }
}
