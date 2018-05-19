package models;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Nouns
{
    private Image image;
    private String noun;

    public Nouns(String noun,Image image)
    {
        this.image = image;
        this.noun = noun;
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

    public String getNoun()
    {
        return noun;
    }

    public void setImage(Image image)
    {
        this.image = image;
    }

    public void setNoun(String noun)
    {
        this.noun = noun;
    }
}
