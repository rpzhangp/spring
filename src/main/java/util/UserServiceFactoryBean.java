package util;

import com.rushuni.mapper.impl.UserMapperImpl;
import com.rushuni.service.UserService;
import com.rushuni.service.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @program: spring-demo-di-01
 * @description
 * @author: 彭于晏
 * @create: 2021-07-18 00:37
 *
 **/
public class UserServiceFactoryBean implements FactoryBean<UserService> {
    /***
     *
     * @return
     * @throws Exception
     */
    @Override
    public UserService getObject() throws Exception {
        UserServiceImpl userService=new UserServiceImpl();
        userService.setUserMapper(new UserMapperImpl());
        userService.setUserName("zhangpei");
        return userService;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
