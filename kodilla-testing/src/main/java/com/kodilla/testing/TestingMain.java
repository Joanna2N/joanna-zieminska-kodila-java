package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result2 = simpleUser.getUsername();

        if (result2.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

      //    tu umieść kolejny test ->
        Calculator calculator = new Calculator();

        int result = calculator.addAToB(6, 5);

        if (result == 11) {
            System.out.println("calculator add test OK");
        } else {
            System.out.println("calculator add Error!");
        }

        int result1 = calculator.subtractAFromB(16, 35);

        if (result1 == 19) {
            System.out.println("calculator substract test OK");
        } else {
            System.out.println("calculator substract Error!");
        }
    }
}
