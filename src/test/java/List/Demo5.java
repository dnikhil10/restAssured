package List;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Demo5 {

    @Test
    public void testForMakingCharAscending() {
        String str = "nikhl";

        char[] test = str.toCharArray();

        for (int i = 0; i < test.length - 1; i++) {
            for (int j = 0; j < test.length - i - 1; j++) {
                if (test[j] > test[j + 1]) {
                    char temp = test[j];
                    test[j] = test[j + 1];
                    test[j + 1] = temp;
                }
            }
        }
        for (char c : test) {
            System.out.println(c);
        }
    }

    @AfterTest
    public void duplicateCharacter() {

        System.out.println(" Finding duplicate characters ");

        String str = "automation";
        char[] arr = str.toCharArray();

        boolean[] visited = new boolean[arr.length];

        System.out.println("Duplicate characters:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {


                System.out.println(arr[i] + " appears " + count + " Times");


            }
        }
    }
}

