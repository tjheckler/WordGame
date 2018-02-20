package controllers;

import models.Words;
import play.mvc.Controller;
import play.mvc.Result;

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

        return ok(views.html.story.render(words));
    }
}
