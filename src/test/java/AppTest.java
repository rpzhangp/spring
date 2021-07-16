import com.rushuni.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-demo-di-01
 * @description
 * @author: 彭于晏
 * @create: 2021-07-15 22:06
 **/
public class AppTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService)applicationContext.getBean("userService");
        System.out.println(userService);
    }
    /**测试静态工厂*/
    @Test
    public void teststaticFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService)applicationContext.getBean("userService2");
        System.out.println("userService2="+userService);
    }
    @Test
    public void testSetterDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService=(UserService)applicationContext.getBean("userService");
        userService.query();
    }
    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService=(UserService)applicationContext.getBean("userService2");
        userService.query();
    }

}
