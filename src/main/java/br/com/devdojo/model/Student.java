package br.com.devdojo.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;
@Entity
public class Student  extends AbstractEntity{
    @NotEmpty (message = "O campo nome do estudante \u00E9 obrigat\u00F3rio")
    private String name;
    @NotEmpty
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name) {
        this.name = name;
    }
    public Student(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
