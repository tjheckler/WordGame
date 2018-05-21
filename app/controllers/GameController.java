package controllers;

import models.Adjectives;
import models.Nouns;
import models.Places;
import models.Words;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.*;



public class GameController extends Controller
{
    public Result getStart()
    {
        return ok(views.html.start.render());
    }

    public Result getFirstStory()
    {
        Words words = new Words();
        words.setPlace1("Parking Lot");
        words.setAdjective1("fuzzy");
        words.setNoun1("toy");
        words.setNoun2("ocean");
        words.setVerbPastTense1("saved");
        words.setPlace2(" the back yard");

        return ok(views.html.story.render(words));
    }
    public Result getSecondStory()
    {
        Words words = new Words();
        words.setPlace1("Beach");
        words.setAdjective1("crazy");
        words.setNoun1("sea shell");
        words.setNoun2("bar");
        words.setVerbPastTense1("punched");
        words.setPlace2("the house");

        return ok(views.html.story.render(words));
    }
    public Result getThirdStory()
{
    Words words = new Words();
    words.setPlace1("School");
    words.setAdjective1("fun");
    words.setNoun1("cord");
    words.setNoun2("classroom");
    words.setVerbPastTense1("found");
    words.setPlace2("works");

    return ok(views.html.story.render(words));
}
    public Result getRandomStory()
    {
        Words words = new Words();


        List places = new LinkedList();
        places.add("Beach");
        places.add("School");
        places.add("Office");
        places.add("Home");
        places.add("City");
        places.add("Woods");
        places.add("Country");
        List nouns = new LinkedList();
        nouns.add("trunk");
        nouns.add("hole");
        nouns.add("floor");
        nouns.add("fan");
        nouns.add("bed");
        nouns.add("bag");
        nouns.add("box");

        List verbs = new LinkedList();
        verbs.add("had found");
        verbs.add("had broken");
        verbs.add("saved");
        verbs.add("shamed");
        verbs.add("cut");
        verbs.add("forgotten");
        verbs.add("forgiven");

         List adjectives = new LinkedList();
        adjectives.add("creepy");
        adjectives.add("restful");
        adjectives.add("immense");
        adjectives.add("helpful");
        adjectives.add("pleasant");
        adjectives.add("mysterious");
        adjectives.add("tranquil");


        Collections.shuffle(places);
        Collections.shuffle(adjectives);
        Collections.shuffle(nouns);
        Collections.shuffle(verbs);
        words.setPlace1(((LinkedList) places).getFirst().toString());
        words.getPlaces().remove(((LinkedList) adjectives).poll());
        words.setAdjective1(((LinkedList) adjectives).getFirst().toString());
        words.getAdjectives().remove(((LinkedList) adjectives).poll());
        words.setNoun1(((LinkedList) nouns).getFirst().toString());
        words.getNouns().remove(((LinkedList) nouns).poll());
        words.setNoun2(((LinkedList) nouns).getFirst().toString());
        words.getNouns().remove(((LinkedList) nouns).poll());
        words.setVerbPastTense1(((LinkedList) verbs).getFirst().toString());
        words.getVerbs().remove(((LinkedList) verbs).poll());
        words.setPlace2(((LinkedList) places).getLast().toString());
        words.getPlaces().remove(((LinkedList) places).poll());

        return ok(views.html.story.render(words));
    }
}
