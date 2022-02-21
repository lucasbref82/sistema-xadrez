package br.com.projetos.comments;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post p1 = new Post(dateFormat.parse("21/06/2018 13:05:44"), "Traveling to New Zeland", "I'm going to visit this wonderful country !", 12);
        Comment comment = new Comment("Have a nice trip !");
        Comment comment1 = new Comment("Wow that's awesome");
        p1.addComment(comment);
        p1.addComment(comment1);
        Post p2 = new Post(dateFormat.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow !", 5);
        comment = new Comment("Good night!");
        comment1 = new Comment("May the Force be with you");
        p2.addComment(comment);
        p2.addComment(comment1);
        System.out.println(p1);
        System.out.println();
        System.out.println();
        System.out.println(p2);
    }
}
