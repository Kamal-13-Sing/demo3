package demopackage;

import org.junit.Assert;
import org.junit.Test;

public class DemoExampleTest {

    @Test
    public void addTest(){

        int actual = DemoExample.sum(5,3);

        int expected = 8;

        Assert.assertEquals(expected, actual);

    }

}
