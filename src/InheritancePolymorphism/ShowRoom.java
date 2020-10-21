package InheritancePolymorphism;

public class ShowRoom {
    void volume()
    {
        System.out.println("Showroom volume");
    }

    void channels()
    {
        System.out.println("Showroom channels");
    }

    void settings()
    {
        System.out.println("Showroom settings");
    }

}


class Samsang extends ShowRoom
{
    void volume()
    {
        System.out.println("Samsang volume");
    }

    void channels()
    {
        System.out.println("Samsang channels");
    }

    void settings()
    {
        System.out.println("Samsang settings");
    }
}

class LG extends ShowRoom
{
    void volume()
    {
        System.out.println("LG volume");
    }

    void channels()
    {
        System.out.println("LG channels");
    }

    void settings()
    {
        System.out.println("LG settings");
    }
}

class Onida extends ShowRoom
{

    void volume()
    {
        System.out.println("Onida volume");
    }

    void channels()
    {
        System.out.println("Onida channels");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }
}

class TextOverriding
{
    public static void main(String[] args) {

        ShowRoom showRoom = new ShowRoom();
        showRoom.channels();
        showRoom.settings();
        showRoom.volume();

        showRoom = new Onida();
        showRoom.channels();
        showRoom.settings();
        showRoom.volume();

        showRoom = new LG();

        showRoom.channels();
        showRoom.settings();
        showRoom.volume();

        showRoom = new Samsang();
        showRoom.channels();
        showRoom.settings();
        showRoom.volume();
    }
}