package domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */

public class GithubComment{
    public String url;
    public String html_url;
    public String issue_url;
    public int id;
    public String node_id;
    public User user;
    public Date created_at;
    public Date updated_at;
    public String author_association;
    public String body;
    public Reactions reactions;
}

