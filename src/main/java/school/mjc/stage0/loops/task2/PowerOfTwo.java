package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power<0) System.out.println("too much power");
        int number=0;
        while(number<=power){
            System.out.println((int)Math.pow(2,number));
            number++;
        }

    }
}
