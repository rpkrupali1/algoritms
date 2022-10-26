package sort;

import org.testng.annotations.Test;

public class PracticeTest extends ParentTest{

    @Test
    public void qq3(){
        int n = 500;
        int count = 0;
        for (int i = n-10; i < n ; i++) {
            System.out.println(++count + "  "  + i);
        }
    }

    @Test
    public void qq3_2() {
        int n = 500;
        int count = 0;
        for (int i = n / 3; i < n; i++) {
            System.out.println(++count + "  " + i);
        }
    }
}
