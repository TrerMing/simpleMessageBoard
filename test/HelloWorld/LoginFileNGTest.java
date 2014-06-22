/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.io.IOException;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Gage
 */
public class LoginFileNGTest {

    public LoginFileNGTest() {
    }

    /**
     * Test of isValid method, of class LoginFile.
     */
    @Test
    public void testIsValid() {
        Authenticater auth;
        
        try {
            auth = new LoginFile("logins.txt");
            
            assertTrue(auth.isValid("admin", "hardPassword"));
            assertTrue(auth.isValid("easy", "password"));
            
            assertFalse(auth.isValid("easy", "hardPassword"));
            assertFalse(auth.isValid("easy", "WRONG_PASSWORD"));
            assertFalse(auth.isValid("WRONG_USERNAME", "WRONG_PASSWORD"));
            
        } catch (IOException ex) {
            assertFalse(true, "File logins.txt couldn't be read!");
        }

    }

}
