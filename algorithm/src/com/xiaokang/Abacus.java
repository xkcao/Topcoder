package com.xiaokang;

public class Abacus {
    /*
0)
{"ooo---oooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "oo---ooooooo", "---ooooooooo"}
5
Returns: {"ooo---oooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "o---oooooooo", "ooooo---oooo" }
When we add 5 to the original, it is necessary to "carry" 1 to the next thread up. This shows the arithmetic 699979 + 5 = 699984
1)
{"ooo---oooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "oo---ooooooo", "---ooooooooo"}
21
Returns: {"oo---ooooooo", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---" }
This shows 699979 + 21 = 700000
2)
{"ooooooooo---", "---ooooooooo", "ooooooooo---", "---ooooooooo", "oo---ooooooo", "---ooooooooo"}
100000
Returns: {"oooooooo---o", "---ooooooooo", "ooooooooo---", "---ooooooooo", "oo---ooooooo", "---ooooooooo" }
3)
{"o---oooooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo" }
1
Returns: {"---ooooooooo", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---" }
     */
    public String[] add(String[] original, int val){
        int num1 = abacusToNumber(original);
        int num2 = num1 + val;

        return numToAbacus(num2);
    }

    String[] numToAbacus(int num){
        String[] abacus = new String[6];

        for(int i=5;i>=0;i--){
            int digit = num/((int)Math.pow(10,i));
            num -= digit*Math.pow(10,i);

            abacus[5-i]= digitToLine(digit);
        }

        return  abacus;
    }

    String digitToLine(int digit){

        return "o".repeat(Math.max(0, 9 - digit)) +
                "-".repeat(3) +
                "o".repeat(Math.max(0, digit));
    }

    int abacusToNumber (String[] original){
        int num=0;
        for(int i=0;i<original.length;i++){
            num+= lineToNumber(original[i])*Math.pow(10,5-i);
        }

        return  num;
    }

    int lineToNumber(String line){
        int leftBeads=0;
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)!='-') {
                leftBeads++;
            }
            else{
                break;
            }
        }

        return (9-leftBeads);
    }
}
