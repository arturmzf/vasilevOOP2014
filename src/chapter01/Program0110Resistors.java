package chapter01;

/**
 * @Date: 28.11.2021
 * Author: Artur Muzafarov
 */

public class Program0110Resistors {
    public static void main(String[] args){
        // Сопротивление резисторов, Ом
        double R1 = 3, R2 = 5, R3 = 2, R = 1;
        // Расчётные значения для сопротивления участка цепи, Ом
        double r1, r2, r3;
        // Логические значения для определения способа подключения
        boolean A, B;
        // Вычисление сопротивления участка цепи для разных способов подключения
        r1 = R2*R3/(R2+R3)+R1*R/(R1+R);
        r2 = R1*R3/(R1+R3)+R2*R/(R2+R);
        r3 = R2*R1/(R2+R1)+R3*R/(R3+R);
        // Вычисление критериев для способа подключения
        A = (r1<=r2)&&(r1<=r3);
        B = (r2<=r1)&&(r2<=r3);
        // Вывод начальных значений
        System.out.println("Значения сопротивлений резисторов:");
        System.out.println("Первый R1 = " + R1 + " Ом");
        System.out.println("Второй R2 = " + R2 + " Ом");
        System.out.println("Третий R3 = " + R3 + " Ом");
        System.out.println("Основной R = " + R + " Ом");
        // Вычисление и вывод результата
        System.out.print("Во второй блок подключается ");
        System.out.print(A?"первый":B?"второй":"третий");
        System.out.println(" резистор!");
    }
}
