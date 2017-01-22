package musicDevice;


import musicConfig.Playlist;
import musicInstrument.MusicActions;

public class CDPlayer extends ElectronicPlayer implements MusicActions {

    public CDPlayer(Playlist myPlaylist, Integer volume) {
        this.myPlaylist = myPlaylist;
        this.volume = volume;
    }

    public boolean isCdLoaded() {
        return !myPlaylist.getSongs().isEmpty();
    }

    @Override
    public void play() {
        if (!isCdLoaded()) {
            System.out.println("Insert CD.");
        } else {
            System.out.println("Enjoy your music.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }

}
