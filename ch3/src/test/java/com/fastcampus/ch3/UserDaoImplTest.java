package com.fastcampus.ch3;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDaoImplTest extends TestCase {

    @Autowired
    UserDao userDao;

    public void testDeleteUser() {
    }

    public void testSelectUser() {
    }

    public void testInsertUser() {
    }

    public void testUpdateUser() {
        User user = new User("asdf", "1234", "abc", "aaa@aaaaa.com", new Date(), "fb", new Date());
        int rowCnt = userDao.insertUser(user);
        assertTrue(rowCnt == 1);
    }
}