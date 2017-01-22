package person;

public class BassGuitarist extends Guitarist {

    public BassGuitarist(String name) {
        this.name = name;
        System.out.println("[" + name + "] I'm ready!");
    }

    @Override
    public void playInstrument() {
        System.out.println("\t [BASS]\uD83C\uDFB5" + "\u266A" + "\uD83C\uDFB5" + "\u266A...");
        g.play();
    }

    @Override
    public void stopPlaying() {
        g.stop();
    }
}
