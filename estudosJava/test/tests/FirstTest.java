package tests;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void test1(){
        Client client = new Client();
        client.addName("Guilherme");
        Assert.assertEquals("Guilherme", client.getName());
    }

}