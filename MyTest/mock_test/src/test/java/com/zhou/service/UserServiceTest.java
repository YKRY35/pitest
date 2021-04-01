package com.zhou.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({com.zhou.service.UserService.class})
public class UserServiceTest {

    UserService userService;

//    @Before
//    public void before(){
////        userService = new UserService();
//
//        userService = PowerMockito.spy(new UserService());
//        PowerMockito.when(userService.getNum(100)).thenReturn(100);
//    }

    public void subt(){
        new Thread(){
            @Override
            public void run(){
                while(true){

                }
            }
        }.start();
    }

    @Test
    public void testGetNum() throws Exception {
        userService = PowerMockito.spy(new UserService());
        PowerMockito.when(userService.getNum(100)).thenReturn(100);
        assertEquals(userService.getNum(0), 1);

//        subt();
    }

    @Test
    public void testGetNum2(){
        userService = PowerMockito.spy(new UserService());
        PowerMockito.when(userService.getNum(200)).thenReturn(300);
        assertEquals(userService.getNum(2), 3);

//        subt();
    }

    @Test
    public void testGetNum3(){
        userService = PowerMockito.spy(new UserService());
        PowerMockito.when(userService.getNum(100)).thenReturn(100);
        assertEquals(userService.getNum(3), 4);

//        subt();
    }
}