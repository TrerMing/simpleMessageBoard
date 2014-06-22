/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HelloWorld;

import java.util.ArrayList;

/**
 * A simple interface for posts
 * @author Gage
 */
public interface PostModel {
    ArrayList<Post> getPosts();
    void addPost(Post post);
}
