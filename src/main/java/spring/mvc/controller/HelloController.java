package spring.mvc.controller;

/**
 * Created by Денис on 28.02.2015.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.mvc.entity.ClientEntity;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
     public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC - Hello World");
        ClientEntity clientEntity = new ClientEntity("Denis", "Makarov", "+380(67)6138426", "Kyiv Lenina 68", "denm2000@gmail.com", null);
        model.put("client", clientEntity);
        return "hello";

    }
    @RequestMapping(value = "/bye",method = RequestMethod.GET)
    public String printBye(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC - Have a nice day !!!");
        return "bye";

    }

//    @RequestMapping(value = "/service",method = RequestMethod.GET)
//    public String service(ModelMap model) {
//
//        model.addAttribute("message", "Spring 3 MVC - !!!");
//        return "service";
//
//    }
}