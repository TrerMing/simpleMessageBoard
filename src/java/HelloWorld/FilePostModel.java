/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gage
 */
public class FilePostModel implements PostModel {

    String filename;

    public FilePostModel(String filename) throws FileNotFoundException, IOException {
        
        this.filename = filename;

    }

    /**
     * This will get all the posts from a file
     *
     * @return
     */
    @Override
    public ArrayList<Post> getPosts() {
        BufferedReader reader = null;
        ArrayList<Post> Posts = new ArrayList<>();
        String username = null;
        String body = null;
        String date = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();

            while (line != null) {

                switch (line) {
                    case "BEGIN":
                        username = reader.readLine();
                        date = reader.readLine();
                        body = "";
                        break;

                    case "END":
                        if (username != null) {
                            Posts.add(new Post(username, body, date));
                        }
                        break;

                    default:
                        body += line + "\n";
                        break;
                }

                line = reader.readLine();
            }

            reader.close();

        } catch (FileNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        } 
        
        return Posts;
    }

    /**
     * This will add a post to a file
     *
     * @param post
     */
    @Override
    public void addPost(Post post) {
        try {
            try (PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(filename, true))) // The true means append
            ) {
                out.println("BEGIN");
                out.println(post.getUsername());
                out.println(post.getDate());
                out.println(post.getBody());
                out.println("END");
            }

        } catch (IOException e) {
            throw new Error("File Failed to append");
        }

    }

}
