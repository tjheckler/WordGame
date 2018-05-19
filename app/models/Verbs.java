package models;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Verbs
{
    private Image image;
    private String verb;
    public Verbs(String verb,Image image)
    {
        this.image = image;
        this.verb = verb;
    }
    public Image getImage(String fileName)
    {
        try {
            return ImageIO.read(getClass().getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getVerb()
    {
        return verb;
    }

    public void setImage(Image image)
    {
        this.image = image;
    }

    public void setVerb(String verb)
    {
        this.verb = verb;
    }
}
