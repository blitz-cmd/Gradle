package lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class App2Test {
    @Test public void testApp2() throws Exception {
        Thread.sleep(4000);
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
