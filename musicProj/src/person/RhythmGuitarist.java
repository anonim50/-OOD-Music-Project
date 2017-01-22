package person;

/**
 * Created by Catalin on 19.01.2017.
 */
public class RhythmGuitarist extends Guitarist {

    public RhythmGuitarist(String name) {
        this.name = name;
        System.out.println("[" + name + "] I'm ready!");
    }

    @Override
    public void playInstrument() {
        System.out.println("\t [RHYTHM]\uD83C\uDFB5" + "\u266A" + "\uD83C\uDFB5" + "\u266A...");
        g.play();
    }

    @Override
    public void stopPlaying() {
        g.stop();
    }
}
