import java.util.Arrays;

public class Crossword {
    public static void main(String[] args) {
        char[][] crossword = {
                {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                {'+', '-', '-', '-', '-', '-', '+', '+', '+', '+'},
                {'+', '-', '+', '+', '+', '-', '+', '+', '+', '+'},
                {'+', '-', '+', '+', '+', '-', '+', '+', '+', '+'},
                {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'},
                {'+', '+', '-', '-', '-', '-', '-', '-', '+', '+'},
                {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'},
                {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'}
        };
        String[] words = {"LONDON", "DELHI", "ICELAND", "ANKARA"};
        crossWordPlay(crossword,words,0,0);
    }
    static void crossWordPlay(char [][] crossword,String word[],int pos,int posin )
    {
        if(pos>word.length)
        {
            printCrossWord(crossword);
        }
        for(int i=0;i< crossword.length;i++)
        {
            for(int j=0;j<crossword[0].length;j++)
            {
                if(crossword[i][j]=='-')
                {
                    crossword[i][j]=word[pos].charAt(posin);
                    if(posin+1>word[pos].length())
                    {
                        crossWordPlay(crossword,word,pos+1,0);
                    }
                    else
                    {
                        crossWordPlay(crossword,word,pos,posin+1);

                    }
                    crossword[i][j]='-';

                }
            }

        }
    }
    static void printCrossWord(char [][] crossword)
    {
        for(char [] cross:crossword)
        {
            System.out.println(Arrays.toString(cross));
        }
    }
}
