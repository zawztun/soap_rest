package mysql_rest.accessingdatamysql.controller;

import mysql_rest.accessingdatamysql.model.User;
import mysql_rest.accessingdatamysql.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
  @Autowired
  private UserRepository userRepository;

  @PostMapping(path = "/add")
  public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {

      return "added";
  }

    @GetMapping(path = "/add")
    public @ResponseBody String getUsers() {
        return "Saved";
    }
}
