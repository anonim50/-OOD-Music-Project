package musicConfig;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs = new ArrayList<Song>();

   public Playlist() {
       loadSongs();
        System.out.println("Playlist loaded.");
    }

    public void loadSongs() {
        songs.add(new Song("Jimmy - Hello world!", 240));
        songs.add(new Song("Dwin - LaLaLaLaLa", 320));
        songs.add(new Song("Desiigner - Panda", 420));
        songs.add(new Song("Ash - Feels", 285));
    }

    public List<Song> getSongs() {
        return songs;
    }

}
