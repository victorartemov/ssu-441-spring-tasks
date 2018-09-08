import model.C;
import model.E;
import model.F;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        C c = (C)context.getBean("c");
        c.sayHiFromD();

        E e = (E)context.getBean("e");
        e.sayBye();

        //F f = (F) context.getBean("f");

        context.close();
    }
}
