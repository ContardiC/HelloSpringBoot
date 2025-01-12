package it.spacecoding.api_mood_mate.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// REST API
@RestController
public class HelloWorldController {
    // /hello-world

    // @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
    @GetMapping(path="hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
    // Path Parameters
    // /user/{id}/todos/{id} => /user/1/todos/101
    @GetMapping(path = "/hello-world/path-variable/{name}")
        public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s", name));
    }
    
}
