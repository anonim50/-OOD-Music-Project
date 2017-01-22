package person;

import musicInstrument.Drumset;

/**
 * Created by Catalin on 19.01.2017.
 */
public class Drummer extends Artist {

    Drumset d= new Drumset();
    public Drummer(String name) {
        this.name = name;
        System.out.println("["+name+"] I'm ready!");
    }

    @Override
    public void playInstrument() {
        System.out.println("\t [DRUM]\uD83C\uDFB5"+"\u266A"+"\uD83C\uDFB5"+"\u266A...");

        d.play();
    }

    @Override
    public void stopPlaying() {
        d.stop();
    }
}
