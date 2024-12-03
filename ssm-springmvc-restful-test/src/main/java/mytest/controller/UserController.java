package mytest.controller;

import mytest.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2024/12/2 18:28
 * @Created by cxx
 */
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("page")
    public List<User> page(@RequestParam(required = false, value = "1") int page,
                           @RequestParam(required = false, defaultValue = "1") int size) {
        System.out.println("page=" + page + "," + "size=" + size);
        return null;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return user;
    }

    @GetMapping("{id}")
    public User detail(@PathVariable Integer id) {
        return null;
    }

    @PutMapping
    public User uptate(@RequestBody User user) {
        return user;
    }

    @DeleteMapping("{id}")
    public User delete(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("search")
    public List<User> search(String keywork, @RequestParam(required = false, defaultValue = "1") Integer page,
                             @RequestParam(required = false, defaultValue = "10") Integer size) {
        return null;
    }


}
