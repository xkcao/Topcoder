package com.xiaokang;

public class ASCIISum {
    /*
0)
3
Returns: 465
We have:
f(1) = 49, f(49) = 109, f(109) = 154, and f(154) = 154
f(2) = 50, f(50) = 101, f(101) = 146, f(146) = 155, and f(155) = 155
f(3) = 51, f(51) = 102, f(102) = 147, f(147) = 156, and f(156) = 156
Hence, the sum final(1) + final(2) + final(3) equals 154 + 155 + 156.
1)
6
Returns: 930
We now also have final(4) = 157, final(5) = 158, and final(6) = 150.
2)
10
Returns: 1543
The next few values are final(7) = 151, final(8) = 152, final(9) = 153, and final(10) = 157.
3)
999999999999
Returns: 454936082
     */
    public  int total(long N){
        long sum=0;
        for(long i=1;i<=N;i++) sum+=finalF(i);

        return (int)(sum%((long)(Math.pow(10,9)+7)));
    }

    long finalF(long N){
        long num = N;
        long fNum=f(num);

        while (num!=fNum){
            num = fNum;
            fNum = f(num);
        }

        return fNum;
    }

    long f(long N){
        String str = String.valueOf(N);
        long result = 0;
        for(int i=0;i<str.length();i++){
            result += str.charAt(i);
        }

        return result;
    }
}
