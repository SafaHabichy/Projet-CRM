package com.example.ProjetCrm;

public class ClientDTO {

    private Long id;
    private String companyname;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String zipcode;
    private String city;
    private String country;
    private ClientState state;

    public ClientDTO() {
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.companyname = entity.getCompanyname();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.email = entity.getEmail();
        this.phone = entity.getPhone();
        this.address = entity.getAddress();
        this.zipcode = entity.getZipcode();
        this.city = entity.getCity();
        this.country = entity.getCountry();
        this.state = entity.getState();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ClientState getState() {
        return state;
    }

    public void setState(ClientState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", companyname='" + companyname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state=" + state +
                '}';
    }
}
