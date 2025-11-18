package task2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        int[] array2 = new int[array.length]; //объявляю второй массив, в который буду сохранять полученные значения

        int j = 0; //при помощи этой переменной мы будем проходиться по второму массиву
        for (int i = array.length-1; i>=0;i--)
        {
            array2[j] = array[i];
            j++;
        }

        //выводим новый массив на экран
        for (int i =0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
}