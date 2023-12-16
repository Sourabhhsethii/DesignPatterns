package com.dxsys.patterns.behavioural.nov2023.command;

import com.dxsys.patterns.behavioural.nov2023.command.fx.Button;

public class Cli {
    public static void main(String[] args) {
        var service = new CustomerService();
        var cmd = new AddCutomerCommand(service);
        var button = new Button(cmd);
        button.click();
    }
}
