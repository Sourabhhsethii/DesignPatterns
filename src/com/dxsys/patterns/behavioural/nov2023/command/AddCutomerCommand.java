package com.dxsys.patterns.behavioural.nov2023.command;

import com.dxsys.patterns.behavioural.nov2023.command.fx.Command;

public class AddCutomerCommand implements Command {

    private CustomerService customerService;

    public AddCutomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
      customerService.addCustomer();
    }
}
