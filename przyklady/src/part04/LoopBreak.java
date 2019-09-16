package part04;

public class LoopBreak {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if (i < 3) {
                continue;
            }

            if (i > 5) {
                break;
            }

            System.out.println(i);

        }
    }


}