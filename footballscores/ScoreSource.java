package footballscores;

import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();
    private String liveScore;

    public void addListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String liveScore) {
        this.liveScore = liveScore;
        notifyListeners(new ScoreEvent(liveScore));
    }

    private void notifyListeners(ScoreEvent event) {
        for (ScoreListener listener : listeners) {
            listener.scoreChange(event);
        }
    }
}
