package co.simplon.p25.crud.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.crud.dtos.PersonCreate;
import co.simplon.p25.crud.dtos.PersonUpdate;
import co.simplon.p25.crud.services.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
	this.service = service;
    }

    @PostMapping
    public void create(@RequestBody PersonCreate inputs) {
	service.create(inputs);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
	    @RequestBody PersonUpdate inputs) {
	service.update(id, inputs);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }
}
