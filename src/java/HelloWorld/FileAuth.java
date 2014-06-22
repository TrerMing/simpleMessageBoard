/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gage
 */
public class FileAuth implements Authenticater {

    public HashMap<String, String> logins;

    public FileAuth(String filename) throws FileNotFoundException, IOException {
        logins = new HashMap<>();
        String env = System.getenv("OPENSHIFT_DATA_DIR");
        
        String path = this.getClass().getResource("").getPath();
        BufferedReader reader = new BufferedReader(new FileReader(path + filename));
        String line = reader.readLine();
        String[] temp;

        while (line != null) {
            temp = line.split(" | ");
            logins.put(temp[0], temp[2]);
            line = reader.readLine();
        }

    }

    FileAuth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isValid(String username, String password) {

        return logins.containsKey(username)
                && logins.get(username).equals(password);
    }

}
