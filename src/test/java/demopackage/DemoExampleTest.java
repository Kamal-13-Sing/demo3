package demopackage;

import org.junit.Assert;
import org.junit.Test;

public class DemoExampleTest {

    @Test
    public void addTest(){

        int actual = DemoExample.sum(5,3);
        System.out.println("Test");
        int expected = 8;


        Assert.assertEquals(expected, actual);

    }

}
