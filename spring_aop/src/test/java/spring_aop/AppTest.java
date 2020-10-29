package spring_aop;

//import static org.junit.Assert.assertTrue;
//
//import org.junit.Test;

import com.cheng.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest 
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service= (UserService) context.getBean("userService");
        //动态代理
        service.add();

        service.delete();

    }
}
