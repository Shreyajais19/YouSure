package YouSure;

//Things To Do: (Code as efficient as possible and comment as much as possible. Project need to do be as human as possible)
/*
1. Create class for each category, total implement 5 category's
2. Implement You Sure Method in short it need to come randomly after player choosing an option and it need give two options yes or no if yes continue with code
      if no it need to show same question for 2nd time
3. if possible implement as much as AsciiArt as much as possible
4. if possible implement Hint Method it need to work only 2 times per game */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClearConsole CC = new ClearConsole();
        Art AsciiArt = new Art();
        RandomNumbers Rn = new RandomNumbers();
        category1 C1 = new category1();
        System.out.print("Hello There!!");
        Thread.sleep(200);
        CC.cs();
//        AsciiArt.Art1();
//        AsciiArt.Art2();
        CC.cs2();
//        Rn.RandomInt(); Delete this later.

        C1.Category1();
    }
}
