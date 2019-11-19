package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPossitionCommand;

import edu.kis.powp.jobs2d.drivers.DriverManager;


public class CircleDrawer implements FigureOption {
    private ComplexCommand complexCommand = new ComplexCommand();
    private int radius = 185;

    @Override
    public DriverCommand getShape(DriverManager driverManager) {
        complexCommand.addCommand(new SetPossitionCommand(radius, 0));
        for (double i = 0.0; i < 360; i += 0.05) {

            Double y = Math.sin(i) * radius;
            Double x = Math.cos(i) * radius;
            complexCommand.addCommand(new OperateToCommand(x.intValue(), y.intValue()));
        }
        return complexCommand;
    }
}
