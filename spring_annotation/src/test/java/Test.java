import com.cheng.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("annotation.xml");
        Person p=(Person) context.getBean("person");

        p.getCat().shout();
        p.getDog().shout();

    }
}
