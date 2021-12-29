package itprogramm.PhoneBook.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class List {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String last_name, first_name, type_number,phone_number, town, street, number_home;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getType_number() {
        return type_number;
    }

    public void setType_number(String type_number) {
        this.type_number = type_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber_home() {
        return number_home;
    }

    public void setNumber_home(String number_home) {
        this.number_home = number_home;
    }
}
