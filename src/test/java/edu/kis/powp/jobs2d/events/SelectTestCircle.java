package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.factory.CircleDrawer;
import edu.kis.powp.jobs2d.command.factory.FigureOption;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCircle implements ActionListener {
    private DriverManager driverManager;

    public SelectTestCircle(DriverManager driverManager) {
        this.driverManager = driverManager;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        FigureOption figureOption = new CircleDrawer();
            figureOption.getShape(driverManager).execute(driverManager.getCurrentDriver());

    }

}
