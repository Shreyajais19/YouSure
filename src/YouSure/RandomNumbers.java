package YouSure;
import java.util.Random;
//not using this class just to experiment how random numbers working.

public class RandomNumbers {
    int RandomInt(){
        Random Random_Numbers = new Random();
        int[] b = new int[3];
        int a =0, c=0;
        
        for(int  i = 0; i<b.length; i++) {
            b[i]= Random_Numbers.nextInt(3);
//            System.out.println(i+b[i]);

            for (int j = 0; j<i;j++){
                if(b[i]==b[j]) {
                    i--;
                }

            }
        }
//        for (int j: b){
//            System.out.println(b[j]);
//        }
        for (int i=0; i<3; i++ ){
            a= b[i];
        }

//        a= Random_Numbers.nextInt(3);
//            c= b[a];
//        System.out.println(c);

        return a ;
    }
}
