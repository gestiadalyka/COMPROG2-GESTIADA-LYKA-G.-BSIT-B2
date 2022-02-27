public class FirstNonRepeatedCharFirst {

public static void main(String args[]) {

    String input = "tweet";
    char process[] = input.toCharArray();
    boolean status = false;
    int index = 0;
    for (int i = 0; i < process.length; i++) {
        for (int j = 0; j < process.length; j++) {

            if (i == j) {
                continue;
            } else {
                if (process[i] == process[j]) {
                    status = false;
                    break;
                } else {
                    status = true;
                    index = i;
                }
            }

        }
         if (status) {
        System.out.println("First non-repeated string is : " + process[index] + " INDEX " + index);
        break;
    } 
    }
}