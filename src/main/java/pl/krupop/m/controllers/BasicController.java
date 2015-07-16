package pl.krupop.m.controllers;

import java.util.UUID;

import javax.xml.ws.http.HTTPException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pl.krupop.m.entity.Account;
import pl.krupop.m.exceptions.AccountExistsException;

@RestController
public class BasicController {

	private static final Logger logger = LoggerFactory.getLogger(BasicController.class);

	@RequestMapping(value = "/uuids", method = RequestMethod.GET)
	@ResponseBody
	public UUID getRandomUUID() {
		return UUID.randomUUID();
	}

	@RequestMapping(value = "/accounts", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void createAccount(@RequestBody Account account) throws HTTPException {
		if (account.getPassword().length() > 5) {
			logger.info("Creating account with login: {} / password: {}", account.getLogin(), account.getPassword());
		} else {
			logger.error("Password too short, ignoring {}", HttpStatus.BAD_REQUEST.value());
			throw new AccountExistsException("Password too short");
		}
	}

}
