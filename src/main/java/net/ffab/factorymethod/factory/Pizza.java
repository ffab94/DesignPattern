package net.ffab.factorymethod.factory;

public abstract class Pizza {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract void cuire();
    public abstract void emballer();
    public abstract void preparer();
    public abstract void couper();
}
