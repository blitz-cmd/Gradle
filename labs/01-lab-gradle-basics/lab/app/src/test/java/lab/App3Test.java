package lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class App3Test {
    @Test public void testApp3() throws Exception {
        Thread.sleep(1000);
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
