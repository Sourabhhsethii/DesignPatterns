package com.dxsys.basic;

import com.dxsys.basic.gui.CheckBox;
import com.dxsys.basic.gui.Textbox;
import com.dxsys.basic.gui.UIControl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * Basic Class Example !!!
         */
        User user = new User("Sourabh Sethi", 3);
        user.sayHello();;

        /**
         * Interface Example!!!
         * Programing towards Interface -> Loose Coupling
         * Instead of Concreate Classes -> new Keywords !! Disastrous application.
         */
        TaxCalculator calculator = getCalulator2020();
        calculator.calculateTax();


        /**
         * Encapsulation Example!!! Encapsulation in Actions. Hiding the state of the application inside the class.
         * Encapsulated -> Class{Attributes + Behaviors}
         */
        var account = new Account();
        account.setBalance(10);
        account.deposit(10);
        account.withDraw(5);
        System.out.println(account.getBalance());

        /**
         * Abstraction in acctions.
         * sendEmail is responsible for too many things
         * 1.) connect();
         * 2.) authenticate();
         * 3.) System.out.println("send mail");
         * 4.) disconnect();
         *
         * By making all other methods private, we are reducing complexity from the user.
         * Facade Patter is  also like that.
         * Client only needs to work with sendEmail() Method.
         */
        var mailservice = new MailService();
        mailservice.sendEmail();

        /**
         * Lets make a GUI Framework!
         * It has.
         * TextBox
         * Button
         * CheckBox
         *
         * we should be able to enable (), focus(), setPostions() all these functionality in TextBox,Button,CheckBox  !!!!
         *
         * Lets See Inheritance In Action...
         * Base call (UI Control) will have -> enable (), focus(), setPostions() & TextBox, Button, CheckBox will inherit properties from Base Classes.
         *
         */
        var textBox = new  Textbox();
        textBox.enable();

        /**
         * Polymorphism in action Here!!!
         * Object can take any different form at run time!!
         **/
        drawUiControl(new CheckBox());
        drawUiControl(new Textbox());

    }

    /**
     * Polymorphism is action Here!!!
     * No Implementation -> At Runtime we will decide concrete class of UIControl -> CheckBox || Textbox
     * @param ctrl
     */
    public static void drawUiControl(UIControl ctrl){
        ctrl.draws();
    }

    public static TaxCalculator getCalulator2019(){
        return new TaxCalculator2019();
    }

    public static TaxCalculator getCalulator2020(){
        return new TaxCalculator2020();
    }
}
