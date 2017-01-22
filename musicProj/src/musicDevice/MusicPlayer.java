package musicDevice;

import musicConfig.Playlist;
import musicInstrument.MusicActions;

/**
 * Created by Catalin on 19.01.2017.
 */
public class MusicPlayer extends ElectronicPlayer implements MusicActions {

    public MusicPlayer(Playlist myPlaylist, Integer volume) {
        this.myPlaylist = myPlaylist;
        this.volume = volume;
    }

    public boolean isCassetteLoaded() {
        return !myPlaylist.getSongs().isEmpty();
    }

    @Override
    public void play() {
        if (!isCassetteLoaded()) {
            System.out.println("Insert cassette.");
        } else {
            System.out.println("Enjoy your music.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }

}
