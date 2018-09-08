package model;

import lombok.Data;

@Data
public abstract class C {
    protected abstract D createD();

    public void sayHiFromD() {
        createD().sayHi();
    }
}
