package resume.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import resume.job.domain.UserDTO;
import resume.job.repository.UserService;

import java.io.IOException;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ModelAndView users(){
        ModelAndView mav = new ModelAndView("signUp");
        return mav;
    }

    @PostMapping("/users")
    public ResponseEntity<UserDTO> createUser(@ModelAttribute UserDTO userDTO) throws IOException {

        UserDTO createUserDTO = userService.createUser(userDTO);
        return new ResponseEntity<>(createUserDTO, HttpStatus.CREATED);
    }
}
