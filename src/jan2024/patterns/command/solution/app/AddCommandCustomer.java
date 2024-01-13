package jan2024.patterns.command.solution.app;

import jan2024.patterns.command.solution.fx.Command;

public class AddCommandCustomer implements Command {

    private CustomerService service;

    public AddCommandCustomer(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
