package lab4;

import java.util.Scanner;

public class dfgh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите значение s() и r()");
            int s  = scanner.nextInt();
            int r = scanner.nextInt();
            if (s == 0 && r == 0){
                System.out.println("Выходное значение = 1");
            } else if (s == 1 && r == 0) {
                System.out.println("Выходное значение = 0");
            } else if (s == 0 && r == 1) {
                System.out.println("выходное значение = 1");
            } else if (s == 1 && r == 1) {
                System.out.println("Недопустимое значение для входа");
                break;
            }
        }while (true);



//        System.out.println("При входных значениях R(0) и S(0) выходное значене будет равно 1");
//        System.out.println("При входных значениях R(0) и S(1) выходное значене будет равно 0");
//        System.out.println("При входных значениях R(1) и S(0) выходное значене будет равно 1");
//        System.out.println("При входных значениях R(1) и S(1) выходное значене будет равно 0");

//        сложный логический элемент отвечающий за хранение одного бита информации и при  коммандах сет и ресет изменяет или оставляет изначальное значение
    }
}
