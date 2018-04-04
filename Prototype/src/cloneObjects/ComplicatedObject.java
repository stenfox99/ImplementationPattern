package cloneObjects;

import interfaces.Copyable;

public class ComplicatedObject implements Copyable {
    private Type type;

    public enum Type{
        ONE,TWO
    }

    @Override
    public ComplicatedObject copy() {
        return new ComplicatedObject();
    }

    public void setType(Type type){
        this.type = type;
    }
}
