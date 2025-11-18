package task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = new int[1000];

        //Заполняю массив
        for(int i=0; i<array.length;i++){
            array[i] = (int) (Math.random() * 100);//заполняю от 0 до 100
        }

        //поиск чётных элементов
        for(int i=0; i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
    }
}