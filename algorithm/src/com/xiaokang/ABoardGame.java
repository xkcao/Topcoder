package com.xiaokang;

public class ABoardGame {
    /*
{".....A", "......", "..A...", "...B..", "......", "......"}
Returns: "Alice"
Both Alice and Bob have 1 piece in region 1, so they are tied there. In region 2, they have no pieces at all, so a tie again. Finally, in region 3 Alice has 1 piece, while Bob has none. So Alice is the winner of this game.
1)
{"AAAA", "A.BA", "A..A", "AAAA"}
Returns: "Bob"
Even though Alice has 12 pieces and Bob just one, this one piece is enough for him to win.
2)
{"..", ".."}
Returns: "Draw"
The board can be entirely empty.
3)
{"BBB..BAB...B.B", ".AAAAAAAAAAAA.", "AA.AA.AB..A.AB", "..........B.AB", ".A..BBAB.A.BAB", ".AB.B.......A.", ".A..A.AB.A..AB", ".ABAA.BA...BA.", "BAAAB.....ABA.", ".A....B..A..B.", "B...B....B..A.", "BA.B..A.ABA.A.", "BAAAA.AAAAA.A.", "B.B.B.BB.B...."}
Returns: "Alice"
4)
{"..A..AAA..AA", "ABABB..AAAAA", "ABBBBBBBBBA.", "AABBBABABBAA", "...BABABABBA", "B.BA..A.BBA.", "AA.A..B.AB.B", "..BA.B.AABAA", "..ABABBBABA.", ".ABB.BBBBBAA", "ABAAA.AA.A.A", "A..AAA.AAA.A"}
Returns: "Bob"
5)
{"B..ABAABBB", "B.........", "A..A.AA..B", "A.BBBAA..A", "B.AAAAB...", "A..BBBBB.A", "B..ABAABBA", "A......B.B", "B......A.A", "BA.AABBB.A"}
Returns: "Draw"
     */
    public String whoWins(String[] board){
        for(int region=1;region<= board.length/2;region++){
            int numA = getRegionCharNum(board,region,'A');
            int numB = getRegionCharNum(board,region,'B');
            if(numA>numB) return "Alice";
            if(numA<numB) return "Bob";
        }

        return "Draw";
    }

    int getRegionCharNum(String[] board, int region, char c){
        int num=0;
        int upRow = board.length/2 - region;
        int downRow = board.length/2-1+region;

        for(int i=0;i<board.length;i++){
            //border rows
            if(i==upRow || i==downRow){
                for(int j= upRow;j<=downRow;j++){
                    if(board[i].charAt(j)==c){
                        num ++;
                    }
                }
            }
            //middle rows
            if(i>upRow && i<downRow){
                if(board[i].charAt(upRow)==c) num++;
                if(board[i].charAt(downRow)==c) num++;
            }
        }

        return num;
    }
}
