import java.util.Scanner;

/**
 * @author User
 * @see #array()
 * @see #calc()
 */
public class Base2 {
    public static void main(String[] args) {
        //Объявление объекта класса Scanner
        Scanner Choice = new Scanner(System.in);
        //Выбор программы для выполнения
        System.out.println("Enter number of task (C-Calculator, M- Massiv): ");
        char variant = Choice.next().charAt(0);
        //Реализация выбора
        if (variant == 'C') {
            new Base2().calc();
        }
        if (variant == 'M') {
            new Base2().array();
        }
    }

    /**
     * @see #main(String[])
     */
    public void calc() {
        //Объявление объекта класса Scanner
        Scanner Calc = new Scanner(System.in);
        //Объявление переменных
        float firstNum;
        float secondNum;
        float answer;

        //Ввод чисел
        System.out.println("Enter the first number: ");
        firstNum = Calc.nextFloat();
        System.out.println("Enter the second number:");
        secondNum = Calc.nextFloat();
        System.out.println("Select the order of operation: ");

        //Объявление оператора, с помощью которого можно выбрать операцию
        char operator = Calc.next().charAt(0);

        //Выполнение операции с учетом форматирования
        if (operator == '+') {
            answer = (firstNum + secondNum);
            System.out.printf("Answer:" + "%010.4f", answer);
        }
        if (operator == '-') {
            answer = (firstNum - secondNum);
            System.out.printf("Answer:" + "%010.4f", answer);
        }
        if (operator == '*') {
            answer = (firstNum * secondNum);
            System.out.printf("Answer:" + "%010.4f", answer);

        }
        if (operator == '/') {
            answer = (firstNum / secondNum);
            System.out.printf("Answer:" + "%010.4f", answer);
        }
    }

    /**
     * @see #main(String[])
     */
    public void array() {
        //Объявление объекта класса Scanner
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = inputWord.nextInt(); // Ввод размера массива
        String words[] = new String[size]; // Создание массива String размером в size
        System.out.println("Insert array elements:");
        //Заполнение массива
        for (int i = 0; i < size; i++) {
            words[i] = inputWord.next();
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + words[i]); // Вывод полученного массива на экран
        }
        System.out.println();

        String word = words[0]; //Объявление переменной как элемента массива
        //Поиск слова с максимальной длиной
        for (int i = 1; i < words.length; i++) {
            if (word.length() < words[i].length())
                word = words[i];
        }

        System.out.println("Самое длинное слово: " + word);
        System.out.println("Длина слова: " + word.length());

    }
}

