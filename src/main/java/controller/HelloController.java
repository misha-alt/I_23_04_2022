package controller;

import lessen.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/")
    public String hellowWorld(){
        return "Hello, World";
    }
/**/
    @ResponseBody
    @RequestMapping("/user")
    public String HelloName(@RequestParam("name") String name){

        return this.helloService.sayHallo(name);
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
