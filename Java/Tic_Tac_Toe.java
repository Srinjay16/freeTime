import java.util.Scanner;
import java.io.*;
public class Tic_Tac_Toe{
    static int m, e;
    static char c, d, j, t, x, b, g, h, k;
    static boolean f, a;
    static String y, na, me;
    static char cr[][] = new char[3][3], s[] = new char[9];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Scanner sc = new Scanner(System.in);
    Tic_Tac_Toe(){
        for (m = 0; m < 3; m++)
            for (e = 0; e < 3; e++)
                cr[m][e] = '-';}
    public static void main(String args[]) throws IOException, InterruptedException{
        j = '0'; a = true;
        System.out.println("\t\t\t\t\t\t\tWelcome to the Game of Tic-Tac-Toe");
        Thread.sleep(1800);
        System.out.print('\u000C');
        while (true){   
            new Tic_Tac_Toe().game();
            while (true){
                System.out.println("1. Play Again\n2. Exit\nEnter your choice:");
                x = sc.next().charAt(0);
                if (x == '1' || x == '2')
                    break;
                else
                    System.out.println("Enter proper choice!!");}
            Thread.sleep(1000);
            System.out.print('\u000C');
            if (x == '2'){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\tThanks for playing!!");
                Thread.sleep(2000);
                System.out.print('\u000C' + "\t");
                System.exit(0);}}}
    private void game() throws IOException, InterruptedException{
        System.out.println("The rules:");
        System.out.println("1. You will have to give your turn every time until the game gets over.");
        System.out.println("2. The numbering of the pattern of the checkboard is:\n\n1   2   3\n4   5   6\n7   8   9\n");
        System.out.println("3. If you win the toss, you'll get the first turn, else computer will get the first chance\n\nWishing you the best!!\n");
        while (true){
            System.out.println("Game type: \n1. Human vs Computer\n2. Human vs Human\nEnter your choice:");                
            k = sc.next().charAt(0);
            if (k == '1' || k == '2')
                break;}
        Thread.sleep(1000);
        System.out.print('\u000C');
        if (k == '1'){
            System.out.println("Enter your name:");
            na = br.readLine();}
        else{
            System.out.println("Enter 1st user's name:");
            na = br.readLine();
            System.out.println("\nEnter 2nd user's name:");
            me = br.readLine();
            me = me.trim();}
        na = na.trim();
        System.out.println();
        while (true){
            System.out.println(na + ", enter your symbol:  X   or   O");
            c = sc.next().charAt(0);
            if (c == 'X' || c == 'x' || c == 'O' || c == 'o'){
                c = Character.toUpperCase(c);
                break;}}
        d = (c == 'X')? 'O' : 'X';
        while (true){
            System.out.println("\nToss: \n1. Heads\n2. Tails\n" + na + ", enter your choice:");
            g = sc.next().charAt(0);
            if (g == '1' || g == '2')
                break;}
        h = (char)(49 + (int)(Math.random() * 2));
        Thread.sleep(1000);
        System.out.print('\u000C');
        if (h == g)
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t" + na + ", you have won the Toss!!");
        else{
            if (k == '2')
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t" + me + ", you have won the Toss!!");
            else
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\tComputer has won the Toss!!");}
        Thread.sleep(1300);
        System.out.print('\u000C');
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\tLet's play!!");
        Thread.sleep(1300);
        System.out.print('\u000C');
        m = 0;
        while (true){                
            result(cr);
            if (h == g){
                user(na);
                b = j;
                replace(j, cr, c);}
            else{
                if (k == '1'){
                    Thread.sleep(800);
                    System.out.println("Computer's turn!!");
                    Thread.sleep(800);
                    System.out.println("\nComputer has played!!");
                    computer();}
                else{
                    Thread.sleep(800);
                    user(me);
                    b = j;}
                replace(j, cr, d);}
            Thread.sleep(1200);
            System.out.print('\u000C');
            result(cr);
            a = check(cr, c, d, k);
            if (a == false)
                break;
            if (m == 9){
                System.out.println("Game over!!\nMatch drawn!!\n");
                break;}
            if (h == g){
                if (k == '1'){
                    Thread.sleep(800);
                    System.out.println("Computer's turn!!");
                    Thread.sleep(800);
                    System.out.println("\nComputer has played!!");
                    computer();}
                else{
                    Thread.sleep(800);
                    user(me);
                    b = j;}
                replace(j, cr, d);}
            else{
                user(na);
                b = j;
                replace(j, cr, c);}
            Thread.sleep(1200);
            System.out.print('\u000C');
            result(cr);
            a = check(cr, c, d, k);
            if (a == false)
                break;
            if (m == 9){
                System.out.println("Match drawn!!!!\nGame over\n");
                break;}
            System.out.print('\u000C');
            if (t == 'n')
                break;}}
    private static void user(String n){
        while (true){
            f = true;
            while (true){
                System.out.println(n + ", it's your turn!! Enter the position:");
                y = sc.next();
                if (y.length() < 2){
                    j = y.charAt(0);
                    if (Character.isDigit(j))
                        if (j >= '1' && j <= '9')
                            break;}
                System.out.println("Enter proper position!!");}
            for (e = 0; e < m; e++)
                if (s[e] == j){
                    f = false;
                    System.out.println("The position " + j + " is already taken!!");
                    break;}
            if (f == true){
                s[m++] = j;
                break;}}}
    private static void computer(){
        while (true){
            a = true;
            if (cr[0][0] == d && cr[1][1] == d && cr[2][2] == '-'){
                j = '9';
                a = false;}
            else if (cr[0][0] == d && cr[1][0] == d && cr[2][0] == '-'){
                j = '7';
                a = false;}
            else if (cr[0][0] == d && cr[0][1] == d && cr[0][2] == '-'){
                j = '3';
                a = false;}
            else if (cr[0][0] == d && cr[2][2] == d && cr[1][1] == '-'){
                j = '5';
                a = false;}
            else if (cr[0][0] == d && cr[2][0] == d && cr[1][0] == '-'){
                j = '4';
                a = false;}
            else if (cr[0][0] == d && cr[0][2] == d && cr[0][1] == '-'){
                j = '2';
                a = false;}
            else if (cr[0][0] == d && cr[0][1] == d && cr[0][2] == '-'){
                j = '3';
                a = false;}
            else if (cr[0][1] == d && cr[1][1] == d && cr[2][1] == '-'){
                j = '8';
                a = false;}
            else if (cr[0][1] == d && cr[2][1] == d && cr[1][1] == '-'){
                j = '5';
                a = false;}
            else if (cr[0][2] == d && cr[0][1] == d && cr[0][0] == '-'){
                j = '1';
                a = false;}
            else if (cr[0][2] == d && cr[0][1] == d && cr[0][0] == '-'){
                j = '1';
                a = false;}
            else if (cr[0][0] == d && cr[0][2] == d && cr[0][1] == '-'){
                j = '2';
                a = false;}
            else if (cr[0][2] == d && cr[2][0] == d && cr[1][1] == '-'){
                j = '5';
                a = false;}
            else if (cr[0][2] == d && cr[2][2] == d && cr[1][2] == '-'){
                j = '6';
                a = false;}
            else if (cr[0][2] == d && cr[1][1] == d && cr[2][0] == '-'){
                j = '7';
                a = false;}
            else if (cr[0][2] == d && cr[1][2] == d && cr[2][2] == '-'){
                j = '9';
                a = false;}
            else if (cr[0][0] == d && cr[1][0] == d && cr[2][0] == '-'){
                j = '7';
                a = false;}
            else if (cr[1][0] == d && cr[1][2] == d && cr[1][1] == '-'){
                j = '5';
                a = false;}
            else if (cr[1][1] == d && cr[1][0] == d && cr[1][2] == '-'){
                j = '6';
                a = false;}
            else if (cr[2][0] == d && cr[1][0] == d && cr[0][0] == '-'){
                j = '1';
                a = false;}
            else if (cr[2][2] == d && cr[1][1] == d && cr[0][0] == '-'){
                j = '1';
                a = false;}
            else if (cr[2][1] == d && cr[1][1] == d && cr[0][1] == '-'){
                j = '2';
                a = false;}
            else if (cr[2][0] == d && cr[1][1] == d && cr[0][2] == '-'){
                j = '3';
                a = false;}
            else if (cr[1][1] == d && cr[1][2] == d && cr[1][0] == '-'){
                j = '4';
                a = false;}
            else if (cr[1][1] == d && cr[1][0] == d && cr[1][2] == '-'){
                j = '6';
                a = false;}
            else if (cr[0][2] == d && cr[1][1] == d && cr[2][0] == '-'){   
                j = '7';
                a = false;}
            else if (cr[0][1] == d && cr[1][1] == d && cr[2][1] == '-'){
                j = '8';
                a = false;}
            else if (cr[0][0] == d && cr[1][1] == d && cr[2][2] == '-'){
                j = '9';
                a = false;}
            else if (cr[0][2] == d && cr[1][2] == d && cr[2][2] == '-'){
                j = '9';
                a = false;}
            else if (cr[1][0] == d && cr[1][2] == d && cr[1][1] == '-'){
                j = '5';
                a = false;}
            else if (cr[1][1] == d && cr[1][2] == d && cr[1][0] == '-'){
                j = '4';
                a = false;}
            else if (cr[2][2] == d && cr[1][2] == d && cr[0][2] == '-'){
                j = '3';
                a = false;}
            else if (cr[2][0] == d && cr[1][0] == d && cr[0][0] == '-'){
                j = '1';
                a = false;}
            else if (cr[0][0] == d && cr[2][0] == d && cr[1][0] == '-'){
                j = '4';
                a = false;}
            else if (cr[2][0] == d && cr[1][1] == d && cr[0][2] == '-'){
                j = '3';
                a = false;}
            else if (cr[0][2] == d && cr[2][0] == d && cr[1][1] == '-'){
                j = '5';
                a = false;}
            else if (cr[2][0] == d && cr[2][2] == d && cr[2][1] == '-'){
                j = '8';
                a = false;}
            else if (cr[2][1] == d && cr[2][0] == d && cr[2][2] == '-'){
                j = '9';
                a = false;}
            else if (cr[2][1] == d && cr[1][1] == d && cr[0][1] == '-'){
                j = '2';
                a = false;}
            else if (cr[0][1] == d && cr[2][1] == d && cr[1][1] == '-'){
                j = '5';
                a = false;}
            else if (cr[2][1] == d && cr[2][0] == d && cr[2][2] == '-'){
                j = '9';
                a = false;}
            else if (cr[2][1] == d && cr[2][2] == d && cr[2][0] == '-'){
                j = '7';
                a = false;}
            else if (cr[2][2] == d && cr[1][1] == d && cr[0][0] == '-'){
                j = '1';
                a = false;}
            else if (cr[2][2] == d && cr[1][2] == d && cr[0][2] == '-'){
                j = '3';
                a = false;}
            else if (cr[0][0] == d && cr[2][2] == d && cr[1][1] == '-'){
                j = '5';
                a = false;}
            else if (cr[0][2] == d && cr[2][2] == d && cr[1][2] == '-'){
                j = '6';
                a = false;}
            else if (cr[2][1] == d && cr[2][2] == d && cr[2][0] == '-'){
                j = '7';
                a = false;}
            else if (cr[2][0] == d && cr[2][2] == d && cr[2][1] == '-'){
                j = '8';
                a = false;}
            if (a == true){
                if (cr[0][0] == c && cr[1][1] == c && cr[2][2] == '-'){
                    j = '9';
                    a = false;}
                else if (cr[0][0] == c && cr[1][0] == c && cr[2][0] == '-'){
                    j = '7';
                    a = false;}
                else if (cr[0][0] == c && cr[0][1] == c && cr[0][2] == '-'){
                    j = '3';
                    a = false;}
                else if (cr[0][0] == c && cr[2][2] == c && cr[1][1] == '-'){
                    j = '5';
                    a = false;}
                else if (cr[0][0] == c && cr[2][0] == c && cr[1][0] == '-'){
                    j = '4';
                    a = false;}
                else if (cr[0][0] == c && cr[0][2] == c && cr[0][1] == '-'){
                    j = '2';
                    a = false;}
                else if (cr[0][0] == c && cr[0][1] == c && cr[0][2] == '-'){
                    j = '3';
                    a = false;}
                else if (cr[0][1] == c && cr[1][1] == c && cr[2][1] == '-'){
                    j = '8';
                    a = false;}
                else if (cr[0][1] == c && cr[2][1] == c && cr[1][1] == '-'){
                    j = '5';
                    a = false;}
                else if (cr[0][2] == c && cr[0][1] == c && cr[0][0] == '-'){
                    j = '1';
                    a = false;}
                else if (cr[0][2] == c && cr[0][1] == c && cr[0][0] == '-'){
                    j = '1';
                    a = false;}
                else if (cr[0][0] == c && cr[0][2] == c && cr[0][1] == '-'){
                    j = '2';
                    a = false;}
                else if (cr[0][2] == c && cr[2][0] == c && cr[1][1] == '-'){
                    j = '5';
                    a = false;}
                else if (cr[0][2] == c && cr[2][2] == c && cr[1][2] == '-'){
                    j = '6';
                    a = false;}
                else if (cr[0][2] == c && cr[1][1] == c && cr[2][0] == '-'){
                    j = '7';
                    a = false;}
                else if (cr[0][2] == c && cr[1][2] == c && cr[2][2] == '-'){
                    j = '9';
                    a = false;}
                else if (cr[0][0] == c && cr[1][0] == c && cr[2][0] == '-'){
                    j = '7';
                    a = false;}
                else if (cr[1][0] == c && cr[1][2] == c && cr[1][1] == '-'){
                    j = '5';
                    a = false;}
                else if (cr[1][1] == c && cr[1][0] == c && cr[1][2] == '-'){
                    j = '6';
                    a = false;}
                else if (cr[2][0] == c && cr[1][0] == c && cr[0][0] == '-'){
                    j = '1';
                    a = false;}
                else if (cr[2][2] == c && cr[1][1] == c && cr[0][0] == '-'){
                    j = '1';
                    a = false;}
                else if (cr[2][1] == c && cr[1][1] == c && cr[0][1] == '-'){
                    j = '2';
                    a = false;}
                else if (cr[2][0] == c && cr[1][1] == c && cr[0][2] == '-'){
                    j = '3';
                    a = false;}
                else if (cr[1][1] == c && cr[1][2] == c && cr[1][0] == '-'){
                    j = '4';
                    a = false;}
                else if (cr[1][1] == c && cr[1][0] == c && cr[1][2] == '-'){
                    j = '6';
                    a = false;}
                else if (cr[0][2] == c && cr[1][1] == c && cr[2][0] == '-'){   
                    j = '7';
                    a = false;}
                else if (cr[0][1] == c && cr[1][1] == c && cr[2][1] == '-'){
                    j = '8';
                    a = false;}
                else if (cr[0][0] == c && cr[1][1] == c && cr[2][2] == '-'){
                    j = '9';
                    a = false;}
                else if (cr[0][2] == c && cr[1][2] == c && cr[2][2] == '-'){
                    j = '9';
                    a = false;}
                else if (cr[1][0] == c && cr[1][2] == c && cr[1][1] == '-'){
                    j = '5';
                    a = false;}
                else if (cr[1][1] == c && cr[1][2] == c && cr[1][0] == '-'){
                    j = '4';
                    a = false;}
                else if (cr[2][2] == c && cr[1][2] == c && cr[0][2] == '-'){
                    j = '3';
                    a = false;}
                else if (cr[2][0] == c && cr[1][0] == c && cr[0][0] == '-'){
                    j = '1';
                    a = false;}
                else if (cr[0][0] == c && cr[2][0] == c && cr[1][0] == '-'){
                    j = '4';
                    a = false;}
                else if (cr[2][0] == c && cr[1][1] == c && cr[0][2] == '-'){
                    j = '3';
                    a = false;}
                else if (cr[0][2] == c && cr[2][0] == c && cr[1][1] == '-'){
                    j = '5';
                    a = false;}
                else if (cr[2][0] == c && cr[2][2] == c && cr[2][1] == '-'){
                    j = '8';
                    a = false;}
                else if (cr[2][1] == c && cr[2][0] == c && cr[2][2] == '-'){
                    j = '9';
                    a = false;}
                else if (cr[2][1] == c && cr[1][1] == c && cr[0][1] == '-'){
                    j = '2';
                    a = false;}
                else if (cr[0][1] == c && cr[2][1] == c && cr[1][1] == '-'){
                    j = '5';
                    a = false;}
                else if (cr[2][1] == c && cr[2][0] == c && cr[2][2] == '-'){
                    j = '9';
                    a = false;}
                else if (cr[2][1] == c && cr[2][2] == c && cr[2][0] == '-'){
                    j = '7';
                    a = false;}
                else if (cr[2][2] == c && cr[1][1] == c && cr[0][0] == '-'){
                    j = '1';
                    a = false;}
                else if (cr[2][2] == c && cr[1][2] == c && cr[0][2] == '-'){
                    j = '3';
                    a = false;}
                else if (cr[0][0] == c && cr[2][2] == c && cr[1][1] == '-'){
                    j = '5';
                    a = false;}
                else if (cr[0][2] == c && cr[2][2] == c && cr[1][2] == '-'){
                    j = '6';
                    a = false;}
                else if (cr[2][1] == c && cr[2][2] == c && cr[2][0] == '-'){
                    j = '7';
                    a = false;}
                else if (cr[2][0] == c && cr[2][2] == c && cr[2][1] == '-'){
                    j = '8';
                    a = false;}}
            if (a == true)
                j = (char)(49 + (int)(Math.random() * 10));
            f = true;
            for (e = 0; e < m; e++)
                if (s[e] == j){
                    f = false;
                    break;}
            if (f == true && j <= '9'){
                s[m++] = j;
                break;
            }}}
    private static void replace(char j, char cr[][], char d){
        int f = 49;
        for (int m = 0; m < 3; m++)
            for (int c = 0; c < 3; c++)
                if ((f++) == j){
                    cr[m][c] = d;
                    break;}
        System.out.println();}
    private static void result(char cr[][]){
        int c = 0, m;
        System.out.println("The checkboard:");
        for (; c < 3; c++){
            for (m = 0; m < 3; m++)
                System.out.print(cr[c][m] + "   ");
            System.out.println();}
        System.out.println();}
    private static boolean check(char cr[][], int c, int d, char l){
        int s, t, x = 0, m = 1; char e = '0'; boolean f = true;
        String j, y[] = {"","","","","","","",""};
        for (s = 0; s < 3; s++){
            for (t = 0; t < 3; t++){
                y[x] += cr[s][t];
                y[m] += cr[t][s];}
            x+=2;
            m+=2;}
        for (s = 0; s < 3; s++){
            for (t = 0; t < 3; t++){
                if (s == t)
                    y[x] += cr[s][t];
                if (s + t == 2)
                    y[m] += cr[s][t];}}        
        for (s = 0; s < 8; s++){            
            j = y[s];
            if (j.equals("XXX") || j.equals("OOO")){
                e = j.charAt(0);
                break;}}
        if (e == c){
            if (l == '1')
                System.out.println(na + " has won the match!! I bet that you cannot win the next time!!\n");
            else
                System.out.println(na + " has won the match!!\n");
            f = false;}
        else if (e == d){
            if (l == '1')
                System.out.println("Computer has won the match!!\nBetter luck next time!!\n");
            else
                System.out.println(me + " has won the match!!\n");
            f = false;}
        return f;}}