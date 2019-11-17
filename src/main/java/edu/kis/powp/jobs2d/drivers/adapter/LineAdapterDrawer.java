package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Jobs2dDriver {
    private int drawX = 0;
    private int drawY = 0;
    private DrawPanelController controller;


    public LineDrawerAdapter() {
        super();
        this.controller = DrawerFeature.getDrawerController();
    }


    @Override
    public void setPosition(int x, int y) {
        this.drawX = x;
        this.drawY = y;

    }

    @Override
    public void operateTo(int x, int y) {
        ILine specialLine = LineFactory.getSpecialLine();
        specialLine.setStartCoordinates(drawX, drawY);
        specialLine.setEndCoordinates(x, y);
        this.setPosition(x,y);
        controller.drawLine(specialLine);
    }

    @Override
    public String toString() {
        return "LineDrawerAdapter{" +
                "controller=" + controller +
                '}';
    }
}
