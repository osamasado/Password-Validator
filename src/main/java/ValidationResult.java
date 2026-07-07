import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    private final List<String> reasons = new ArrayList<>();

    public void addReason(String reason) {
        reasons.add(reason);
    }

    public boolean isValid() {
        return reasons.isEmpty();
    }

    public List<String> getReasons() {
        return reasons;
    }
}
