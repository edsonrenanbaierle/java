/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_builder;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class String_builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Ho that is awesomel");
        Post p1 = new Post(sdf.parse("21/06/2016 13:05:44"), "Treaveling to Brazil", "I'm go to visit this country", 3);
        p1.addComment(c2);
        p1.addComment(c1);
        
        Comment c4 = new Comment("Good night");
        Comment c3 = new Comment("May the force be with you");
        Post p2 = new Post(sdf.parse("28/08/2016 13:05:44"), "Good nigh", "See you tomorrow", 6);
        p2.addComment(c3);
        p2.addComment(c4);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
    
}
