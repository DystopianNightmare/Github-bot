package domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reactions{
    public String url;
    public int total_count;
    @JsonProperty("+1")
    public int plus1;
    @JsonProperty("-1")
    public int minus1;
    public int laugh;
    public int hooray;
    public int confused;
    public int heart;
    public int rocket;
    public int eyes;
}