package models;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Adjectives
{
    private Image image;
    private String adjective;
    public Adjectives(String adjective,Image image)
    {
        this.image = image;
        this.adjective = adjective;
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

    public String getAdjective()
    {
        return adjective;
    }

    public void setImage(Image image)
    {
        this.image = image;
    }

    public void setAdjective(String adjective)
    {
        this.adjective = adjective;
    }
}
