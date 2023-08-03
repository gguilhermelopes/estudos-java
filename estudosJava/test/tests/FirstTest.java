package tests;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void test1(){
        String name = "Guilherme";
        Assert.assertEquals("Guilherme", name);
    }

}