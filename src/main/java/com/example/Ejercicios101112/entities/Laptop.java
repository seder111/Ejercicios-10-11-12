package com.example.Ejercicios101112.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ApiModel("Entidad Ordenador")
@Entity
public class Laptop {

    @ApiParam("Clave primaria de tipo Long")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ApiModelProperty("Atributo de marca del ordenador")
    private String brand;
    private Integer storage;
    private Integer ram;
    private String operatingSystem;
    private String GraphicCard;
    private String processor;
    private String color;
    private Double screenSize;
    private Double weight;

    public Laptop() {
    }

    public Laptop(Long id, String brand, Integer storage, Integer ram, String operatingSystem, String graphicCard, String processor, String color, Double screenSize, Double weight) {
        this.id = id;
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        GraphicCard = graphicCard;
        this.processor = processor;
        this.color = color;
        this.screenSize = screenSize;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getGraphicCard() {
        return GraphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        GraphicCard = graphicCard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
