package LowLevelDesign.DesignSplitwise.User;
import LowLevelDesign.DesignSplitwise.UserExpenseBalanceSheet;

public class User {

    String userId;
    String userName;

    String userEmail;

    String userPhoneNumber;
    UserExpenseBalanceSheet userExpenseBalanceSheet;


    public User(String userId, String userName, String userEmail, String userPhoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getUserId() {
        return userId;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }
}
