package com.example.SpringInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Use Case 1: Basic GET Request
//    Use GET Request Method
//- Use CURL to demonstrate the REST API Call
//- curl localhost:8080/hello -w "\n"
//    http://localhost:8080/hello
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Use Case 2: GET Request with Query Parameter
//    Use GET Request Method and pass name as
//    query parameter
//- Use CURL to demonstrate the REST API Call
//- curl localhost:8080/hello/query?name=Mark
//-w "\n"
//    http://localhost:8080/hello/query?name=Bhoovan
    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

}
