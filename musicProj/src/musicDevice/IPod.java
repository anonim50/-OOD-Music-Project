package musicDevice;

import musicInstrument.MusicActions;
import musicInstrument.Tunable;
import musicConfig.Playlist;

public class IPod extends ElectronicPlayer implements MusicActions, Tunable {

    private int batteryLevel;

    public IPod(int batteryLevel, Playlist myPlaylist, Integer volume) {
        this.batteryLevel = batteryLevel;
        this.myPlaylist = myPlaylist;
        this.volume=volume;
    }

    public boolean isMusicStreaming() {
        return !myPlaylist.getSongs().isEmpty();
    }

    @Override
    public void increaseVolume() {
        super.increaseVolume();
    }

    @Override
    public void decreaseVolume() {
        super.decreaseVolume();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void play() {
        if (batteryLevel <= 15) {
            stop();
            System.out.println("Please charge your IPod!");
        } else if (!isMusicStreaming()) {
            stop();
            System.out.println("Music not found.");
        } else {
            System.out.println("Enjoy your music.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }


    @Override
    public void tune() {
        System.out.println("Sound tunned effect.");
    }
}
