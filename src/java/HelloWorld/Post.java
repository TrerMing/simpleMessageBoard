/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HelloWorld;

/**
 * A simple post class
 * @author Gage
 */
public class Post {
    
    private String username;
    private String body;
    private String date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    Post(String username, String body, String date) {
        this.username = username;
        this.body = body;
        this.date = date;
    }
}
