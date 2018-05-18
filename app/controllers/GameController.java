package controllers;

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
        List nouns = new LinkedList();
        nouns.add("man");
        nouns.add("mountain");
        nouns.add("state");
        nouns.add("ocean");
        nouns.add("bed");
        nouns.add("cat");
        nouns.add("country");

        List verbs = new LinkedList();
        verbs.add("become");
        verbs.add("had broken");
        verbs.add("brought");
        verbs.add("chosen");
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

// finish variables below
        Collections.shuffle(adjectives);
        Collections.shuffle(nouns);
        Collections.shuffle(verbs);
        words.setAdjective1(((LinkedList) adjectives).getFirst().toString());
        words.setNoun1(((LinkedList) nouns).getFirst().toString());
        words.setVerbPastTense1(((LinkedList) nouns).getFirst().toString());
        return ok(views.html.story.render(words));
    }
}
