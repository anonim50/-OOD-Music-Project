package musicInstrument;

/**
 * Created by Catalin on 18.01.2017.
 */
public class Drumset extends Instrument implements Tunable {
    @Override
    public void play() {
        playing = true;
        tune();
    }

    @Override
    public void stop() {
        playing = false;
    }

    @Override
    public void tune() {
        System.out.println("Tunning drum done.");
    }
}
