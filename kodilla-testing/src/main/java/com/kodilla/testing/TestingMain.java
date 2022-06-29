package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

      //    tu umieść kolejny test ->
        Calculator calculator = new Calculator();

        int result1 = Calculator.addAToB(6, 5);

        if (result1.equals("11")) {
            System.out.println("calculator test OK");
        }

    }
}
