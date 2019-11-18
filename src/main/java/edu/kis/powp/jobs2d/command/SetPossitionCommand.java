package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriver;

public class SetPossitionCommand implements DriverCommand {
    private int x;
    private int y;

    public SetPossitionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver dDriver) {
        dDriver.operateTo(x,y);
    }
}
