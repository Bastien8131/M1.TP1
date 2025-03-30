package utcapitole.miage.tp1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestRestController {

    @RequestMapping("/world")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/person/{name}")
    public String helloPerson(@PathVariable String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "", params = { "name" })
    public String helloWorld(@RequestParam("name") String name) {
        return "Hello " + name;
    }
}
