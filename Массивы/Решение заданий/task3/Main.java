package task3;

public class Main {

    //формула для решения формулы
    static double solution(int x, int y, int z){
        double firstStep = (double)(Math.pow(x,2)/z + y/x);
        double secontStep = Math.sqrt(firstStep);
        double thirdStep = secontStep - x*y*z;

        return thirdStep;
    }

    static int findMaxElement(int[] array){
        int max = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        return  max;
    }
    static int findMinElement(int[] array){
        int min = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return  min;
    }

    static int findAverage(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,8,127,34,0,94};
        int x = findMaxElement(array);
        System.out.println("Max: "+x);

        int y = findMinElement(array);
        System.out.println("Min: "+y);

        int z = findAverage(array);
        System.out.println("Average: " + z);

        double result = solution(x,y,z);
        System.out.println("Result: "+result);

    }
}
