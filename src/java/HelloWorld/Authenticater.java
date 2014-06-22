/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HelloWorld;

/**
 *
 * @author Gage
 */
public interface Authenticater {

    /**
     * Checks if the entered information is a valid
     * @param username
     * @param password
     * @return
     */
    public boolean isValid(String username, String password);
}
