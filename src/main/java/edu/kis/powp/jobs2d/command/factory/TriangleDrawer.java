package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPossitionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriangleDrawer implements FigureOption {
    ComplexCommand complexCommand = new ComplexCommand();
    @Override
    public DriverCommand getShape(DriverManager driverManager) {
        complexCommand.addCommand(new SetPossitionCommand(100, 100));
        complexCommand.addCommand(new OperateToCommand( 100, 100));
        complexCommand.addCommand(new OperateToCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(-100, 100));
        complexCommand.addCommand(new OperateToCommand(100, 100));
        return complexCommand;
    }
}
