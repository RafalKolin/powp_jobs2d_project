package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> driverCommandList = new ArrayList();

    public ComplexCommand(List<DriverCommand> driverCommands) {
        this.driverCommandList = driverCommands;
    }

    @Override
    public String toString() {
        return "ComplexCommand{" +
                "driverCommandList=" + driverCommandList +
                '}';
    }

    @Override
    public void execute(Job2dDriver dDriver) {
        driverCommandList.forEach(driverCommand -> driverCommand.execute(dDriver));
    }

    @Override
    public void addCommand(DriverCommand command) {
        driverCommandList.add(command);
    }

}
