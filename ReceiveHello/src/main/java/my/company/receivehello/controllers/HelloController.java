package my.company.receivehello.controllers;

import lombok.RequiredArgsConstructor;
import my.company.receivehello.service.HelloService;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableRabbit
@Component//todo что это???
@RequiredArgsConstructor
@RestController
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/")
    String getCount(){//todo где модификатор???
        return "С Вами поздоровались " + helloService.getCount() + " раз";
    }
}
