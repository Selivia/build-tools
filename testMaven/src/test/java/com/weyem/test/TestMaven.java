package com.weyem.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Selivia on 2016-2-27.
 */
public class TestMaven
{
    @Test
    public void method_1()
    {
        Integer num1 = 6;
        Integer num2 = 6;
        Assert.assertEquals("�����ֲ�һ��",num1,num2);
    }
    @Test
    public void method_2()
    {
        Date date = new Date();
        Assert.assertNotNull("����NUllֵ",date);
    }
}
