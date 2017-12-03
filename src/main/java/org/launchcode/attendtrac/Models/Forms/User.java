package org.launchcode.attendtrac.Models.Forms;


import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {

    @Id
    @GeneratedValue

    @NotNull
    @Size(min = 6, max = 10, message = "Username is required and must be 6-10 characters in length")
    private String username;

    @NotNull
    @Size(min = 6, max = 10, message = "Password is required and must be 6-10 characters in length")
    private String password;

    @Email
    private String email;

    public User() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
