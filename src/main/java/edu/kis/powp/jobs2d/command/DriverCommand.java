package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriver;

public interface DriverCommand {
    void execute(Job2dDriver dDriver);
}
