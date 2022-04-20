package clean.code.design_patterns.requirements;

import java.util.List;

public class Nurse extends Employee {

    public Nurse(String name) {
        super(name);
    }

    @Override
    void update(String s) {
        List<String> surg = getSurgeries();
        surg.add(s);
        setSurgeries(surg);
    }
}
