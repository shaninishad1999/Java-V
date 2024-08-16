public class Find_Even_Odd_Number {
    private static final int MAX_NUMBER = 20;
    private static boolean isEvenTurn = true;

    public static void main(String[] args) {
/*  Even Thread in Main Method */
        Thread evenThread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < MAX_NUMBER; i++) {

                    while (isEvenTurn){
                        try {
                        wait(1000);
                        }catch (Exception e){

                        }
                    }
                    System.out.println("Even Number: " + i);
                    isEvenTurn = true;


                }
            }
        });

        /* Odd Thread in  Main Method*/
        Thread oddThread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < MAX_NUMBER; i++) {
                    while (!isEvenTurn)
                    {
                        try {
                            wait(1000);
                        }catch (Exception e){

                        }
                    }
                    System.out.println("Odd Number: " + i);
                    isEvenTurn =false ;

                }
            }
        });

        evenThread.start();
        oddThread.start();

    }
}
