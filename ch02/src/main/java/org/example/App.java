package org.example;

import org.example.Service.ArticleService;
import org.example.config.AppConfig;
import org.example.sub1.Greeting;
import org.example.sub1.Hello;
import org.example.sub1.Welcome;
import org.example.sub2.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 날짜: 2026-06-15
 * 내용 : 2장 스프링 IoC/DI 실습
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Hello hello = new Hello();
        hello.show();

        Welcome welcome = new Welcome();
        welcome.show();

        Greeting greeting = new Greeting();
        greeting.show();

        //Ioc/DI 방식(제어의 역전)


        //스프링 컨테이너
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //주입하기
        Hello hellobean = context.getBean(Hello.class);
        hellobean.show();

        Welcome welcomebean = (Welcome) context.getBean("w");
        welcomebean.show();

        Greeting greetingbean = (Greeting) context.getBean("g");
        greetingbean.show();

        //종합 실습
        Computer dell = (Computer) context.getBean("dell");
        dell.show();

        //AOP 실습

        ArticleService service = context.getBean(ArticleService.class);

        service.register();
        service.getArticle(null);
        service.getArticleAll();
        service.modify();

    }
}
