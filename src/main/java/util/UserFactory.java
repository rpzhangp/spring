package util;

import com.rushuni.service.impl.UserServiceImpl;

/**
 * @program: spring-demo-di-01
 * @description
 * @author: 彭于晏
 * @create: 2021-07-15 23:58
 **/
public class UserFactory {
    public  static UserServiceImpl getUserService(){
        return new UserServiceImpl();
    }
}
