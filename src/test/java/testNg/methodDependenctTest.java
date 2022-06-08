package testNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class methodDependenctTest
{
    @Test(priority=3)
    public void createUser()
    {
        System.out.println("createUser...user created successfully");
        Assert.fail();
    }
    @Test(priority=1, dependsOnMethods="createUser")
    public void deleteUser()
    {
        System.out.println("deleteUser...");
    }
}
