package com.xiaokang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello Topcoder algorithm!");

//        ABBADiv1 abbaDiv1 = new ABBADiv1();
//        System.out.println(abbaDiv1.canObtain("A","BABA"));

        ABBAReplace abbaReplace = new ABBAReplace();
        System.out.println(abbaReplace.countSteps("AABAA",17,47474747,1000000000));
    }
}
