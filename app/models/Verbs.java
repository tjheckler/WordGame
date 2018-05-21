package models;

public class Verbs
{
    private String image;
    private String verb;
    public Verbs(String verb,String  image)
    {
        this.image = image;
        this.verb = verb;
    }
    public void getImage(String image)
    {
        this.image = image;
    }

    public String getVerb()
    {
        return verb;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public void setVerb(String verb)
    {
        this.verb = verb;
    }
}
