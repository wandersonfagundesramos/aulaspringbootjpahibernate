package wanderson.projetospringbootjpahibernate.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wanderson.projetospringbootjpahibernate.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "wanderson", "wanderson@gmail.com", "971491700", "1234");
		return ResponseEntity.ok().body(u);
	}
}