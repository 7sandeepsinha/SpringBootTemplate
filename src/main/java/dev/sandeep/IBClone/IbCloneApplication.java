package dev.sandeep.IBClone;

import dev.sandeep.IBClone.beans.User;
import dev.sandeep.IBClone.utils.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IbCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbCloneApplication.class, args);
		User user = new User("Sandeep" , Constants.Gender.MALE);
		System.out.println(user.getName());
	}

}
