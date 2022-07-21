package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int result=1;
        System.out.println(result*=factorial);
        while(factorial<=printToInclusive){
            System.out.println(result*=factorial);
            factorial++;
        }
    }
}
