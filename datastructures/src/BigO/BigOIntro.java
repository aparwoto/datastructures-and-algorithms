package BigO;

import java.util.Arrays;

public class BigOIntro {
    public static void main(String[] args) {
        String[] nemo = new String[10000];
        Arrays.fill(nemo,"nemo");
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < nemo.length; i++) {
            if(nemo[i] == "nemo") {
                System.out.println( i + 1 + ".Finding Nemo");
            }
        }
        long finishedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + finishedTime);
    }
}
