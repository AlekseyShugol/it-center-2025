public class FindElement {
    public static void main1(String[] args) {
        /// Задача 3: Поиск элемента в массиве (линейный поиск)
        
        // Создаем массив и элемент, который будем искать
        int[] numbers = {2, 5, 8, 3, 7, 1, 9, 4, 6};
        int target = 7; // элемент, который мы ищем
        int position = -1; // -1 означает "не найден"
        
        // Проходим по всем элементам массива
        for(int i = 0; i < numbers.length; i++) {
            // Проверяем, равен ли текущий элемент искомому
            if(numbers[i] == target) {
                // Если нашли, сохраняем позицию и выходим из цикла
                position = i;
                break; // прерываем цикл, так как элемент найден
            }
        }
        
        // Проверяем, был ли элемент найден
        if(position != -1) {
            System.out.println("Элемент " + target + " найден на позиции: " + position);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве");
        }
    }
}