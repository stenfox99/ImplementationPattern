package builder;

public class CheapComputerBuilder extends ComputerBuiler {
    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Everest");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("CRT");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("mouse+keyboard");
    }
}
