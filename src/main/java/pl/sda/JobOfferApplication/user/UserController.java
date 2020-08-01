package pl.sda.JobOfferApplication.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.JobOfferApplication.user.model.UserInput;
import pl.sda.JobOfferApplication.user.model.UserOutput;

import javax.websocket.server.PathParam;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<UserOutput>> getAllUsers() {

        final UserOutput userOutput = new UserOutput("f5c9cc41","Adam", "adam123", "23123123");

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Collections.singletonList(userOutput));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserOutput> getUserById(@PathVariable(value = "id") String id) {

        System.out.println(id);
        final UserOutput userOutput = new UserOutput("f5c9cc41-273d-4f55-9774-182a75b73929","Adam", "adam123", "23123123");

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userOutput);
    }

    @PostMapping
    public ResponseEntity<Void> postUser(@RequestBody UserInput userInput){

        System.out.println(userInput);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }


}
