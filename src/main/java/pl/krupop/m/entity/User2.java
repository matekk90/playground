package pl.krupop.m.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
public class User2 {


    @NotNull
    @Size(min = 5)
    private String username;

    @NotNull
    @Email
    @Size(min = 5)
    private String email;

    public User2(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
