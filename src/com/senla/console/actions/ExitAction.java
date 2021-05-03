package com.senla.console.actions;

import com.senla.init.IAdministrator;

public class ExitAction implements IAction {

    @Override
    public void execute(IAdministrator administrator) {
        System.out.println("Process terminated");
        System.exit(0);
    }
}
