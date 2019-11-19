package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> driverCommandList = new ArrayList();

    @Override
    public String toString() {
        return "ComplexCommand{" +
                "driverCommandList=" + driverCommandList +
                '}';
    }


    @Override
    public void addCommand(DriverCommand driverCommand) {
        driverCommandList.add(driverCommand);
    }

    @Override
    public void execute(Job2dDriver driver) {
        driverCommandList.forEach(driverCommand -> driverCommand.execute(driver));
    }
}
