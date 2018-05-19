package models;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Places
{

    private Image image;
    private String place;
    Places placeItem = new Places(place,image);
    public Image getImage()
    {
        return image;
    }

    public Places getPlaceItem()
    {
        return placeItem;
    }



    public Places(String place,Image image)
    {
        this.image = image;
        this.place = place;
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
    public String getPlace()
    {
        return place;
    }

    public void setImage(Image image)
    {
        this.image = image;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }
}
