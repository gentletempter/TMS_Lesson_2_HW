/*6. Создать класс.
В методе main получить введенное с консоли слово и вывести на консоль выражение:
введенное слово "и_тут_в_кавычках_должно_быть_введенное_слово".*/

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("введенное слово \"%s\"", in.next());
    }
}
