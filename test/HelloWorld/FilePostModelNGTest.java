/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.TestNGAntTask;
import org.testng.annotations.Test;

/**
 *
 * @author Gage
 */
public class FilePostModelNGTest {

    public FilePostModelNGTest() {
    }

    /**
     * Test of getPosts method, of class FilePostModel.
     */
    @Test
    public void testGetPosts() {
        try {
            
            PostModel posts = new FilePostModel("src/testPosts.txt");
            ArrayList<Post> postsArray = posts.getPosts();

            assertNotNull(postsArray);

            assertEquals(postsArray.get(0).getUsername(), "admin");
            assertEquals(postsArray.get(1).getUsername(), "easy");
            
            assertEquals(postsArray.get(0).getDate(), "today");
            assertEquals(postsArray.get(1).getDate(), "yesterday");

            assertEquals(postsArray.get(0).getBody(),
                    "this is my message\n"
                    + "that has multiple lines\n");

            assertEquals(postsArray.get(1).getBody(),
                    "this is a test post\n");

        } catch (IOException ex) {
            Assert.fail("Failed to read file posts.txt");
        }
    }

    /**
     * Test of addPost method, of class FilePostModel.
     */
    @Test
    public void testAddPost() {
        Random rand = new Random();
        try {
            PostModel posts = new FilePostModel("testAddingPosts.txt");
            String username = rand.nextInt(10) + "";
            String body = rand.nextInt(10) + "";
            String date = rand.nextInt(10) + "";
            
            posts.addPost(new Post(username, body, date));
            
            ArrayList<Post> postsArr = posts.getPosts();
            
            Post p = postsArr.get(postsArr.size()-1);
            
            assertEquals(p.getUsername(), username);
            assertEquals(p.getDate(), date);
            assertEquals(p.getBody(), body + "\n");
            
        } catch (IOException ex) {
            fail("File failed to be made!");
        }
        
    }

}
