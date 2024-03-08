package org.example.demo5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @NotBlank(message = "Vui long nhap ten")
    private String name;
//    @NotBlank(message = "Vui long nhap nhan hang")
    private String brand;
//    @NotBlank(message = "Vui long nhap loai")
    private String kind;
//    @NotBlank(message = "Vui long nhap ubuntu")
    private String ubuntu;
//    @NotBlank(message = "Vui long nhap thong tin")
    private String information;
//    @NotBlank(message = "Vui long nhap thong cpu")
    private String CPU;
//    @NotBlank(message = "Vui long nhap ram")
    private String Ram;
//    @NotBlank(message = "Vui long nhap card")
    private String Card;
//    @NotBlank(message = "Vui long nhap grapes")
    private String Grapes;
//    @NotBlank(message = "Vui long nhap man hinh")
    private String screen;
//    @NotBlank(message = "Vui long nhap cost")
    private String cost;
//    @NotBlank(message = "Vui long nhap date")
    private String date;
//    @NotBlank(message = "Vui long nhap tinh trang")
    private String status;
//    @NotBlank(message = "Vui long nhap mo ta")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getUbuntu() {
        return ubuntu;
    }

    public void setUbuntu(String ubuntu) {
        this.ubuntu = ubuntu;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public String getGrapes() {
        return Grapes;
    }

    public void setGrapes(String grapes) {
        Grapes = grapes;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Computer() {
    }

}