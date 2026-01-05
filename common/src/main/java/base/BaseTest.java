package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        // Setup común (logs, configs, env)
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        //cleanup common
    }

}
