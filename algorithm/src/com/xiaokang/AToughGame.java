package com.xiaokang;

public class AToughGame {
    /*
{1000,500}
{3,4}
Returns: 10.0
This game has 2 levels. Allen will beat level 0 with probability 1, and he will beat level 1 with probability 1/2. Allen will gain 3 units of gold for beating level 0, and 4 units of gold for beating level 1.

Here is an example how Allen could have played the game:

He completes level 0 and collects 3 gold.
He dies in level 1. He drops the 3 gold at the beginning of level 1. Treasure chest in level 0 is refilled to 3 gold.
He completes level 0 again and collects the new 3 gold.
As he reaches level 1, he collects the 3 gold he dropped when he first died.
Again, he dies in level 1. This time he drops 6 gold at the beginning of level 1. Treasure chest in level 0 is refilled again.
He completes level 0 for the third time and collects the new 3 gold.
As he reaches level 1, he collects the 6 gold he dropped when he last died. He now has 9 gold.
This time he completes level 1 and collects the 4 gold from its chest.
As Allen completes level 1, the game ends. He is currently carrying 13 gold.
Allen will win level 1 exactly once. It can be shown that on average Allen will play (and win) level 0 twice. Thus, the expected amount of gold he will have at the end is 2*3 + 4 = 10.

1)
{1000,1}
{3,4}
Returns: 3003.9999999999977
2)
{500,500,500,500,500}
{1,2,3,4,5}
Returns: 16.626830517153095
In this game there are 5 levels, and Allen can complete each of them with probability 1/2. Here is an example how Allen could have played this game:

He completes levels 0, 1, and 2, collecting 1+2+3 = 6 gold.
He then dies in level 3 and drops the 6 gold at the beginning of level 3.
Starting again, he completes levels 0, 1, 2, and 3. He will collect 1+2+3 gold for completing the first three levels, then 6 gold for reaching level 3, and finally 4 gold for completing level 3. Allen now has a total of 16 gold.
He then dies in level 4 and drops the 16 gold at the beginning of level 4.
Allen starts the game for the third time, completes level 0 and gains 1 gold.
This time, he dies in level 1. The 16 gold that was waiting in level 4 is now lost forever. Instead, Allen just drops the 1 gold he is currently carrying at the beginning of level 1.
In his fourth attempt Allen completes all five levels in a row. He ends the game with 1+2+3+4+5 gold collected when completing the levels, and the 1 extra gold that he collected at the beginning of level 1.
The probability of this particular playthrough is 1/(2^(16)).

3)
{250,750}
{1000,1}
Returns: 1067.6666666666667
4)
{916,932,927,988,958,996,944,968,917,939,960,965,960,998,920,990,915,972,995,916,902, 968,970,962,922,959,994,915,996,996,994,986,945,947,912,946,972,951,973,965,921,910, 938,975,942,950,900,983,960,998,982,980,902,974,952,938,900,962,920,931,964,974,953, 995,946,946,903,921,923,985,919,996,930,915,991,967,996,911,999,936,1000,962,970,929, 966,960,930,920,958,926,983}
{583,428,396,17,163,815,31,536,175,165,532,781,29,963,331,987,599,497,380,180,780,25, 931,607,784,613,468,140,488,604,401,912,204,785,697,173,451,849,714,914,650,652,338, 336,177,147,22,652,901,548,370,9,118,487,779,567,818,440,10,868,316,666,690,714,623, 269,501,649,324,773,173,54,391,745,504,578,81,627,319,301,16,899,658,586,604,83,520, 81,181,943,157}
Returns: 54204.93356505282
     */
    public double expectedGain(int[] prob, int[] value){
        int N = prob.length;
        int[] sum = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            sum[i + 1] = sum[i] + value[i];
        }
        double[] dieProb = new double[N];
        double live = 1;
        for (int i = 0; i < N; ++i) {
            dieProb[i] = live * (1000 - prob[i]) / 1000;
            live -= dieProb[i];
        }
        double[] exp = new double[N];
        for (int i = 0; i < N; ++i) {
            double other = 0;
            for (int j = 0; j < i; ++j) {
                other += exp[j] * dieProb[j];
            }
            exp[i] = (sum[i] + other) / (1 - dieProb[i]);
        }
        double ret = sum[N];
        for (int i = 0; i < N; ++i) {
            ret += exp[i] * dieProb[i];
        }
        return ret;
    }
}
