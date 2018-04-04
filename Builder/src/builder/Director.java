package builder;

import computer.Computer;

public class Director {
    private ComputerBuiler computerBuilder;

    public void setComputerBuiler(ComputerBuiler computerBuiler){
        this.computerBuilder = computerBuiler;
    }

    public Computer getComputer(){
        return computerBuilder.getComputer();
    }

    public void constructComputer(){
        computerBuilder.createNewComputer();
        computerBuilder.buildSystemBlock();
        computerBuilder.buildDisplay();
        computerBuilder.buildManipulators();
    }
}
