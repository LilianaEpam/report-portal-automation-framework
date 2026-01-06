package base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @BeforeMethod(alwaysRun = true)
    protected void setUp() {
        log.info("----Test setup started");
        // Setup común (logs, configs, env)
    }

    @AfterMethod(alwaysRun = true)
    protected void tearDown(){
        log.info("----Test teardown finished");
        //cleanup common
    }

}
