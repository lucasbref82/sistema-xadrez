package br.com.projetos.comments;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> commentList = new ArrayList<>();

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Post() {
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {

        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void addComment(Comment comment){
        commentList.add(comment);
    }

    public void removeComment(Comment comment){
        commentList.remove(comment);
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(title + "\n");
        builder.append(likes + " Likes - ");
        builder.append(moment + "\n");
        builder.append("Comments: \n");
        for (Comment comment : commentList) {
          builder.append(comment.getText() + "\n");
        }
        return builder.toString();
    }




}
