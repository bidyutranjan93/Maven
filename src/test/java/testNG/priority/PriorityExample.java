package testNG.priority;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 2)
    public void testScriptD(){
        System.out.println("Test Script D");
    }

    @Test(priority = 1)
    public void testScriptF(){
        System.out.println("Test Script F");
    }

    @Test(priority = 3)
    public void testScriptB(){
        System.out.println("Test Script B");
    }

    @Test(priority = 'a')
    public void testScriptE(){
        System.out.println("Test Script E");
    }

    @Test
    public void testScriptA(){
        System.out.println("Test Script A");
    }

    @Test(priority = -6)
    public void testScriptC(){
        System.out.println("Test Script C");
    }
}
