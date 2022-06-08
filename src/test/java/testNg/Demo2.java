package testNg;

import org.testng.annotations.Test;

public class Demo2
{
    @Test(priority = 2,invocationCount=2)
    public void createUser()
    {
        System.out.println("createUser...");
    }
    @Test(priority = 1, invocationCount=4)
    public void editUser(){
        System.out.println("editUser...");
    }


}
