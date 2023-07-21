import java.util.*;

public class Album
{
    String name;//name of the album
    String artist;//name of the artist
    ArrayList<Song> songs; //Array list structure to contain the Song objects (songs)

    public Album(String name, String artist, ArrayList<Song> songs)
    {
        //Constructor to initialize
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Song findSong(String title)
    {
        //function to check if a song already exists in the album
        for (Song checkedSong : songs)
        {
            if (checkedSong.getTitle().equals(title))
            {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration)
    {
        //Function to add a new song to the album
        if (findSong(title) == null)
        {
            songs.add(new Song(title,duration));
            System.out.println(title + "successfully added to the album");
            return true;
        }
        else
        {
            System.out.println("Song with name " + title + "already exists in the list");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList)
    {
        //function to add album song to a playlist with track number
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size())
        {
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a song with tracknumber "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList)
    {
        for(Song checkedSong : this.songs)
        {
            if (checkedSong.getTitle().equals(title))
            {
                PlayList.add(checkedSong);
                return true;
            }
        }
        System.out.println(title + "song does not exist in the album");
        return false;
    }
}
