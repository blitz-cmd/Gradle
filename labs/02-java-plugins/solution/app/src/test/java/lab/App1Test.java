package lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class App1Test {
    @Test public void testApp1() throws Exception {
        Thread.sleep(5000);
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
