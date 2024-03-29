package chapter01;

/**
 * Вычисление скорости на маршруте
 */

public class Program0104FindV {
    public static void main(String[] args){

        // Расстояние между объектами (км)
        double S1=100;
        double S2=200;

        // Скорость на первом участке (км/ч)
        double V1=80;

        // Средняя скорость (км/ч)
        double V=48;

        /*
        Скорость на втором участке (км/ч),
        общее время движения (ч),
        время движения на первом участке (ч)
        */
        double V2, T, t;

        // Общее время движения (ч)
        T=(S1+S2)/V;

        // Время движения на первом участке (ч)
        t=S1/V1;

        // Скорость движения на втором участке (км/ч)
        V2=T>t?S2/(T-t):-1;

        // Выводим результат
        System.out.println("Скорость на втором участке:");
        System.out.println("V2 = " + (V2<0?"error":V2 + " км/ч"));

    }
}
