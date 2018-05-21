package models;

public class Adjectives
{
    private String image;
    private String adjective;
    public Adjectives(String adjective,String image)
    {
        this.image = image;
        this.adjective = adjective;
    }
    public void getImage(String image)
    {
        this.image = image;
    }

    public String getAdjective()
    {
        return adjective;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public void setAdjective(String adjective)
    {
        this.adjective = adjective;
    }
}
