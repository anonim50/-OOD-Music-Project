package musicDevice;

import musicConfig.Playlist;
import musicInstrument.MusicActions;

public abstract class ElectronicPlayer implements MusicActions {

    protected Playlist myPlaylist;

    protected Integer volume;

    protected void increaseVolume() {
        if (volume.equals(100)) {
            System.out.println("[100] is maximum.");
        } else {
            volume += 20;
        }
    }

    protected void decreaseVolume() {
        if (volume.equals(0)) {
            System.out.println("[0] is minimum.");
        } else {
            volume -= 20;
        }
    }

    protected void pause() {
        System.out.println("Pause.");
    }
}
