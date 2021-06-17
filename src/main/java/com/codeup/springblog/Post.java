package com.codeup.springblog;

import com.codeup.springblog.models.PostImage;
import com.codeup.springblog.models.User;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Posts")
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 255, nullable = false)
    private String body;

    @OneToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostImage> images;

    public Post() {}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post(long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body, User user, List<PostImage> images) {
        this.title = title;
        this.body = body;
        this.user = user;
        this.images = images;
    }
        public Post(long id, String title, String body, User user, List<PostImage> images) {
            this.id = id;
            this.title = title;
            this.body = body;
            this.user = user;
            this.images = images;
        }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PostImage> getImages() {
        return images;
    }
    public void setImages(List<PostImage> images) {
        this.images = images;
    }
}