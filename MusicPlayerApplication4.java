class Song
{
    String title; //title of the song
    double duration; //duration of the song

    public Song(String title, double duration)
    {
        //constructor to initialize
        this.title = title;
        this.duration = duration;
    }

    public String getTitle()
    {
        //function to return song title
        return title;
    }

    public double getDuration()
    {
        //function to return song duration
        return duration;
    }

    @Override
    public String toString()
    {
        //Function to return properties of the song
        return "Song{" + "title : " + title + " , duration : " + duration + "}";
    }
}
