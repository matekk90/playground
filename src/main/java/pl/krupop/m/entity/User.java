package pl.krupop.m.entity;

import pl.krupop.m.dto.UserDto;

public class User {

    private String username;
    private String email;
    private String password;

    public User(UserDto userDto) {
        this.setUsername(userDto.getUsername());
        this.setEmail(userDto.getEmail());
        this.setPassword(userDto.getPassword());
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

    public void setPassword(String password) {
        this.password = password;
    }

}
