/*5. Создать класс.
В методе main объявить две переменные.
Первую переменную объявить типом char и присвоить значение 1, вторую переменную объявить типом int и присвоить занчение 1.
Вывести на консоль результат первая переменная + вторая переменная.
Подумать над полученным результатом.
*/

public class Task_5 {
    public static void main(String[] args) {
        char a = '1';
        int b = 1;
        System.out.println(a + b);
        System.out.println(String.valueOf(a) + b);
        System.out.println(Integer.parseInt(String.valueOf(a)) + b);
    }

}
