package tests;

import org.junit.Assert;
import org.junit.Test;

public class SecondTest {

    @Test
    public void test2(){
        String name = "Guilherme";
        Assert.assertEquals("Guilherme", name);
    }
}
