import musicConfig.Playlist;
import musicDevice.IPod;

/**
 * Created by Catalin on 22.01.2017.
 */
public class Concert {
    public static void main(String[] args) {
        Playlist bandPlaylist = new Playlist();
        IPod nano = new IPod(99, bandPlaylist, 100);
        nano.play();
        nano.tune();
        nano.decreaseVolume();

        Band ACDC = new Band();
        ACDC.b.playInstrument();
        ACDC.d.playInstrument();
        ACDC.r.playInstrument();
        ACDC.l.playInstrument();

        nano.pause();
        nano.stop();

        ACDC.d.stopPlaying();
        ACDC.b.stopPlaying();
        ACDC.r.stopPlaying();
        ACDC.l.stopPlaying();
    }
}
