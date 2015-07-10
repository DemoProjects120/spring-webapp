package com.rootnext.webapp.services;

import java.io.Serializable;

/**
 * Created by sanjoy on 7/10/15.
 */
public class TestService implements Serializable {

    private Integer itemId;


    public TestService(Integer number){
        itemId = number;
    }

    public void testLog(){
        System.out.println("Service: Game On from id : " + itemId);
    }

    public String getMessage(){

        return "this is a test";
    }
}
