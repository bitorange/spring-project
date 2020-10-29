import com.cheng.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring_xml.xml");
        Person person=(Person) context.getBean("person");
        person.getPet().shout();
    }
}
