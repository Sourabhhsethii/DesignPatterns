package com.dxsys.basic;

public class Main {

    public static void main(String[] args) {
	// write your code here
     /*   User user = new User("Sourabh Sethi", 3);
        user.sayHello();;

        TaxCalculator calculator = getCalulator();
        calculator.calculateTax();*/



      /*  var account = new Account();
        account.setBalance(-1);

        account.deposit(10);
        account.withDraw(5);

        System.out.println(account.getBalance());*/

       /* var mailservice = new MailService();
        mailservice.sendEmail();*/

        // TextBox
        // Button
        // CheckBox


        // enable()
        //foucus()
        // setPostions()

      /*  var textBox = new  Textbox();
        textBox.enable();*/

        drawUiControl(new Chekcbok());
        drawUiControl(new Textbox());

    }

    public static void drawUiControl(UIControl ctrl){
        ctrl.draws();
    }

    public static TaxCalculator getCalulator(){
        return new TaxCalculator2019();
    }
}
