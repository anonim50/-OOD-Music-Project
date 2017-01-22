package musicInstrument;

/**
 * Created by Catalin on 18.01.2017.
 */
public class Guitar extends Instrument {

    public String adjustStrings() {
        return "Guitar was adjusted.";
    }

    @Override
    public void play() {
        adjustStrings();
        playing = true;
    }

    @Override
    public void stop() {
        playing = false;
    }
}
