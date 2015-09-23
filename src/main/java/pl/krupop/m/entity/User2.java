package pl.krupop.m.entity;

import pl.krupop.m.dto.UserDto;

public class User2 {

    private String username;
    private String email;

    public User2(UserDto userDto) {
        this.setUsername(userDto.getUsername());
        this.setEmail(userDto.getEmail());
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
