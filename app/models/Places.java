package models;

public class Places
{

    private String image;
    private String place;
    Places placeItem = new Places(place,image);
    public String getImage()
    {
        return image;
    }

    public Places getPlaceItem()
    {
        return placeItem;
    }



    public Places(String place,String image)
    {
        this.image = image;
        this.place = place;
    }
    public void getImage(String image)
    {
        this.image = image;
    }
    public String getPlace()
    {
        return place;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }
}
