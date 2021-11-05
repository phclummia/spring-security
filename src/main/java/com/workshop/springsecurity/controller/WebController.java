package com.workshop.springsecurity.controller;

import com.workshop.springsecurity.data.model.CustomerEntity;
import com.workshop.springsecurity.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final CustomerService service;

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return "redirect:/";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {
        Iterable<CustomerEntity> customers = service.getAll();
        model.addAttribute("customers", customers);
        model.addAttribute("username", principal.getName());
        return "customers";
    }
}
