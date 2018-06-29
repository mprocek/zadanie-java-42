import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumbersTen {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 10 liczb ");
        for(int i=0;i<10;i++){
            numbers.offer(scan.nextInt());
        }

        Integer sum = 0;
        Integer num=0;
        int size=numbers.size();

        for (int i=0;i<size;i++) {
            num=numbers.poll();
            sum+=num;
            System.out.print(num);
            if (i<size-1){
                System.out.print("+");
            } else
                System.out.print("=" + sum);
            }
        }
    }
