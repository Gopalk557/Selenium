package testNg;

import org.testng.annotations.Test;

public class SkipMethodTest
{
    @Test(enabled=false)
    public void createUser()
    {
        System.out.println("createUser...");
    }

    @Test(invocationCount = 5,enabled=true)
    public void editUser()
    {
        System.out.println("editUser...");
    }

}
