/*2. Создать класс.
В методе main объявить четрые переменные типа int и присвоить им произвольные числовые значения.
Первая переменная должна быть в двоичном формате, вторая - в восьмеричном, третья - в десячином, четрветая в шестнадцатиричном.
Вывести результат на консоль.*/

public class Task_2 {
    public static void main(String[] args) {
        int notation2 = 0b11110000;
        int notation8 = 010;
        int notation10 = 99;
        int notation16 = 0x6F;
        System.out.println(notation2);
        System.out.println(notation8);
        System.out.println(notation10);
        System.out.println(notation16);
    }
}
