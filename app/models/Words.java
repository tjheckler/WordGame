package models;

import java.util.LinkedList;
import java.util.List;

public class Words
{

    private String image;
    private String place1;
    private String adjective1;
    private String noun1;
    private String noun2;
    private String verbPastTense1;
    private String place2;
    private List<Nouns> nouns = new LinkedList<>();
    private List<Verbs> verbs = new LinkedList<>();
    private List<Adjectives> adjectives = new LinkedList<>();
    private List<Places> places = new LinkedList<>();

    public List<Nouns> getNouns()
    {

        return nouns;
    }

    public List<Places> getPlaces()
    {

        return places;
    }

    public List<Verbs> getVerbs()
    {

        return verbs;
    }

    public List<Adjectives> getAdjectives()
    {

        return adjectives;
    }

    public String getNoun2()
    {
        return noun2;
    }

    public void setNoun2(String noun2)
    {
        this.noun2 = noun2;
    }

    public String getVerbPastTense1()
    {
        return verbPastTense1;
    }

    public void setVerbPastTense1(String verbPastTense1)
    {
        this.verbPastTense1 = verbPastTense1;
    }

    public String getPlace2()
    {
        return place2;
    }

    public void setPlace2(String place2)
    {
        this.place2 = place2;
    }

    public String getPlace1()
    {
        return place1;
    }

    public void setPlace1(String place1)
    {
        this.place1 = place1;
    }

    public String getNoun1()
    {
        return noun1;
    }

    public void setNoun1(String noun1)
    {
        this.noun1 = noun1;
    }

    public String getAdjective1()

    {
        return adjective1;
    }

    public void setAdjective1(String adjective1)
    {
        this.adjective1 = adjective1;
    }


}
