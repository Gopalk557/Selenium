package testNg;

import org.testng.annotations.Test;

public class Demo1
{
    @Test(priority=2, dependsOnMethods="deleteUser")
    public void createUser()
    {
        System.out.println("createUser...user created successufuly");
    }

    @Test(priority=1, dependsOnMethods="createUser")
    public void deleteUser()
    {
        System.out.println("deleteUser...");
    }
}
