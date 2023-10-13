package mysql_rest.accessingdatamysql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public  class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String email;
    protected  User() {}

    public User( String title, String price) {
        this.name = title;
        this.email = price;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Products{" + "id=" + id + ", title='" + name + '\'' + ", price=" + email + '}';
    }

}