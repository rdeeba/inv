package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {

  @RequestMapping(method = RequestMethod.GET, path = "/hello")
  public String sayHello() {
    return "Hello there!";
  }

  public static void main(String[] args) {
    SpringApplication.run(Controller.class, args);
  }
}
