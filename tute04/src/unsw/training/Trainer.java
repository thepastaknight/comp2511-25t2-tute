package unsw.training;

import java.time.LocalDate;
import java.util.List;

/**
 * A trainer that runs in person seminars.
 * 
 * @author Robert Clifton-Everest
 */
public class Trainer {
    private String name;
    private String room;

    private List<Seminar> seminars;

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public LocalDate bookTrainer(String employee, List<LocalDate> availability) {
        for (Seminar seminar : seminars) {
            for (LocalDate available : availability) {
                if (seminar.bookSeminar(employee, available)) {
                    return available;
                }
            }
        }
        return null;
    }
}
