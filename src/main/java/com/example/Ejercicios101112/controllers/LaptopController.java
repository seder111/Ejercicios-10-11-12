package com.example.Ejercicios101112.controllers;

import com.example.Ejercicios101112.entities.Laptop;
import com.example.Ejercicios101112.repositories.LaptopRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private LaptopRepository laptopRepository;

//    public LaptopController() {
//
//    }

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @ApiOperation("Muestra todos los ordenadores de la base de datos.")
    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @ApiOperation("Muestra el ordenador por id")
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {

        Optional<Laptop> laptopOpt = laptopRepository.findById(id);

        if (laptopOpt.isPresent()) {
            return ResponseEntity.ok(laptopOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @ApiOperation("Crea un ordenador")
    @PostMapping("api/laptops")
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @ApiOperation("Modifica un ordenador mediante un id")
    @PutMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop, @PathVariable Long id) {
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);

        if (laptopOpt.isEmpty() || laptop.getId() != id) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(laptop);
    }

    @ApiOperation("Elimina un ordenador por id")
    @DeleteMapping("/api/laptops/{id}")
    public void delete(@PathVariable Long id) {
        laptopRepository.deleteById(id);
    }

    @ApiOperation("Elimina todos los ordenadores de la base de datos")
    @ApiIgnore
    @DeleteMapping("/api/laptops")
    public void deleteAll() {
        laptopRepository.deleteAll();
    }
}
