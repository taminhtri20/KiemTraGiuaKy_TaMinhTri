package org.example.demo4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @NotBlank(message = "vui long nhap ten")
    private String name;
//    @NotBlank(message = "vui long nhap gioi tinh")
    private String gender;
//    @NotBlank(message = "vui long nhap ngay")
    private String date;
//    @NotBlank(message = "vui long nhap dia chi")
    private String address;
//    @NotBlank(message = "vui long nhap so dien thoai")
//    @Min(value = 0, message = "vui long nhap lon hon 0")
    private int nummberPhone;
//    @NotBlank(message = "vui long nhap email")
    private String email;
//    @NotBlank(message = "vui long nhap phong")
    private String department;
//    @NotBlank(message = "vui long nhap chuc vu")
    private String position;
//    @NotBlank(message = "vui long nhap luong")
//    @Min(value = 0, message = "Vui long nhap lon hon 0")
    private int wage;
//    @NotBlank(message = "vui long nhap ngay lam viec")
    private String DateStartWork;
//    @NotBlank(message = "vui long nhap tinh trang lam viec")
    private String statusWork;
//    @NotBlank(message = "vui long nhap thong tin")
    private String InsuranceInformation;
    public Staff(){}

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNummberPhone() {
        return nummberPhone;
    }

    public void setNummberPhone(int nummberPhone) {
        this.nummberPhone = nummberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getDateStartWork() {
        return DateStartWork;
    }

    public void setDateStartWork(String dateStartWork) {
        DateStartWork = dateStartWork;
    }

    public String getStatusWork() {
        return statusWork;
    }

    public void setStatusWork(String statusWork) {
        this.statusWork = statusWork;
    }

    public String getInsuranceInformation() {
        return InsuranceInformation;
    }

    public void setInsuranceInformation(String insuranceInformation) {
        InsuranceInformation = insuranceInformation;
    }
}