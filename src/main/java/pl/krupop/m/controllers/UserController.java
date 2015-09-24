package pl.krupop.m.controllers;

import javax.xml.ws.http.HTTPException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pl.krupop.m.entity.User;
import pl.krupop.m.entity.User2;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createUser(@RequestBody @Validated User user) throws HTTPException {
        if (user.hasPassword()) {
            logger.info("Creating new user: {}", user);
        } else {
            User2 user2 = new User2(user.getUsername(), user.getEmail());
            logger.info("Creating new user2: {}", user2);
        }
    }

}
