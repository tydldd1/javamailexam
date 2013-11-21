package com.util.mail;

import java.util.Timer;

/**
 * Description:
 * User: NanChengRu
 * Date: 13-11-20
 * Time: 下午9:23
 * JDK: 1.6
 * version: 1.0
 */
public class Test {
    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new SendMailTask(),1000,5000);
    }

}
