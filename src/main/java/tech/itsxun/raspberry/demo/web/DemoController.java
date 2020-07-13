package tech.itsxun.raspberry.demo.web;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/ping")
    public String ping(String echo) {
        return StringUtils.isEmpty(echo) ? "OK" : echo;
    }

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        GenericApplicationContext app = new GenericApplicationContext();
        
    }
}