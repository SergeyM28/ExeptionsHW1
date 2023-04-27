package org.mikhailov;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух
входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

public class Main {
    public static void main(String[] args) {
        ArrayGenerator ag = new ArrayGenerator();
        int[] myFirstArr = ag.generateArray(10, 10);
        int[] mySecondArr = ag.generateArray(10, 10);
        int[] myWrongArr = ag.generateArray(9, 10); // резмер массива отличается от двух предыдущих
        ArrayService as = new ArrayService();
        int[] resultArr = as.subtractArray(myFirstArr, mySecondArr); // проверка функции с верными входными данными
        as.printArray(resultArr);
        int[] arrToTestExeption = as.subtractArray(myFirstArr, myWrongArr); // проверка функции с заведомо неверными входными данными
    }
}

