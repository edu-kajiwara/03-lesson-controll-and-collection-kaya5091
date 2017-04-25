public class ControllSample {
    public static int OneToFiftyAddFor(){
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum = sum + i;
        }
        return sum;
    }

   public static int OneToFiftyAddWhile(){
       int sum = 0;
       int count = 1;
       while (count < 51){
           sum = sum + count;
           count = count + 1;
       }
       return sum;
   }

    public static void main(String[] args) {
        System.out.println("OneToFiftyAddFor:" + OneToFiftyAddFor());
        System.out.println("OneToFiftyAddWhile:" + OneToFiftyAddWhile());
    }
}
