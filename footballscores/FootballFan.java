package footballscores;

public class FootballFan implements ScoreListener {
    @Override
    public void scoreChange(ScoreEvent event) {
        System.out.println("live result: " + event.getScore());
    }
}
