package app;

import com.bean.MyFriend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
public class RestApiApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RestApiApplication.class, args);
        MyFriend myFriend = context.getBean(MyFriend.class);
        myFriend.showOutfit();
    }
}