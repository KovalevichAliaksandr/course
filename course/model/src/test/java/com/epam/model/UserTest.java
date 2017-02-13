package com.epam.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alex on 13.2.17.
 */
public class UserTest {

    @Test
    public void getUserId() throws Exception {
        User user=new User();
        user.setUserId(10);
        Assert.assertEquals(10,user.getUserId(),0);

    }

    @Test
    public void getLogin() throws Exception {

    }

    @Test
    public void getPassword() throws Exception {

    }


    @Test
    public void getDescription() throws Exception {

    }
}