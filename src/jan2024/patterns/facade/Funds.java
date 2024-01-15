package jan2024.patterns.facade;

public class Funds {

    private static Integer threshHoldAmount = 500;

    boolean checkFunds(String user,Integer amount){
        boolean isFundsApproved = false;
        if(checkUserDetails(user)){
            if(amount>threshHoldAmount){
                isFundsApproved = true;
            }
        }
        return isFundsApproved;
    }

   private boolean checkUserDetails(String user){
        boolean isUserAuthenticated = false;
        if(user.equalsIgnoreCase("sourabh")){
            isUserAuthenticated = true;
        }
        return isUserAuthenticated;
    }
}
