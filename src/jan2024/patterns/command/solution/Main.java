package jan2024.patterns.command.solution;

import jan2024.patterns.command.solution.app.*;
import jan2024.patterns.command.solution.fx.Button;
import jan2024.patterns.command.solution.fx.Command;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCommandCustomer(service);
        var button = new Button(command);
        button.click();

        CompositeCommand composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

    }
}
