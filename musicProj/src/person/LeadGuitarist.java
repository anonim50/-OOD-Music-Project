package person;

public class LeadGuitarist extends Guitarist {


    public LeadGuitarist(String name) {
        this.name = name;
        System.out.println("[" + name + "] I'm ready!");
    }

    @Override
    public void playInstrument() {
        System.out.println("\t [LEAD]\uD83C\uDFB5" + "\u266A" + "\uD83C\uDFB5" + "\u266A...");
        g.play();
    }

    @Override
    public void stopPlaying() {
        g.stop();
    }
}
