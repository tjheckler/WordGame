package models;

public class Nouns
{
    private String image;
    private String noun;

    public Nouns(String noun,String image)
    {
        this.image = image;
        this.noun = noun;
    }
    public void getImage(String image)
    {
       this.image = image;
    }

    public String getNoun()
    {
        return noun;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public void setNoun(String noun)
    {
        this.noun = noun;
    }
}
