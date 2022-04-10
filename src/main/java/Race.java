import java.util.ArrayList;
import java.util.Arrays;

// Список этапов (препятствий)
public class Race {
    private ArrayList<Stage> stages;// лист для хранения

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}