package pl.infoshare.lukasz;

import junit.framework.TestCase;

import static org.junit.Assert.assertNotEquals;

public class ThisIsAProblemTest extends TestCase {

    public void testNameMeOne() throws Exception {
        ThisIsAProblem nameMe;
        nameMe = new ThisIsAProblem("John", "Doe");

        assertEquals("Verifying First name. Object returned should contain the firstname: John",
                "John",
                nameMe.getFirstName());

        assertEquals("Verifying Last name. Object returned should contain the lastname: Doe",
                "Doe",
                nameMe.getLastName());

        assertNotEquals("Verifying full name. Object returned should contain full name: John Doe",
                "JohnDoe",
                nameMe.getFullName());

        assertEquals("Verifying full name. Object returned should contain full name: John Doe",
                "John Doe",
                nameMe.getFullName());
    }
}
