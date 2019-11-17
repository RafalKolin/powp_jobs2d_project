package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public interface Jobs2dDriver {
void setPosition(int x, int y);
void operateTo(int x, int y);
}

