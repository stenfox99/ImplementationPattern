package builder;

import computer.Computer;

public abstract class ComputerBuiler {
    protected Computer computer;

    public Computer getComputer(){
        return this.computer;
    }

    public void createNewComputer(){
        computer = new Computer();
    }

    public abstract void buildSystemBlock();
    public abstract void buildDisplay();
    public abstract void buildManipulators();
}
