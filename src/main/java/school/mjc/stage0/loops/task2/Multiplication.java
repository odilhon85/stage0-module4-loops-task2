package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main(String[] args) {
        printMultiplied(-5);
    }

    public static void printMultiplied(int multiplyByAndToInclusive) {
        int number =0;
        if(multiplyByAndToInclusive>0){
            while(number<=multiplyByAndToInclusive){
                System.out.println(number*multiplyByAndToInclusive);
                number++;
            }
        }else if(multiplyByAndToInclusive==0){
            System.out.print("");
        }else{
            while(number>=multiplyByAndToInclusive){
                System.out.println(-number*multiplyByAndToInclusive);
                number--;
            }
        }

    }
}
