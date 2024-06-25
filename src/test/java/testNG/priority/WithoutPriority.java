package testNG.priority;

import org.testng.annotations.Test;

public class WithoutPriority {

    @Test
    public void testScriptD(){
        System.out.println("Test Script D");
    }

    @Test
    public void testScriptF(){
        System.out.println("Test Script F");
    }

    @Test
    public void testScriptB(){
        System.out.println("Test Script B");
    }

    @Test
    public void testScriptE(){
        System.out.println("Test Script E");
    }

    @Test
    public void testScriptA(){
        System.out.println("Test Script A");
    }

    @Test
    public void testScriptC(){
        System.out.println("Test Script C");
    }
}
