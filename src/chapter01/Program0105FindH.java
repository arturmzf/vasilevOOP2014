package chapter01;

/**
 * Орбита спутника
 */

public class Program0105FindH {
    public static void main(String[] args){

        // Гравитационная постоянная (Н*м^2/кг^2)
        double G = 6.672E-11;

        // Масса Земли (кг)
        double M = 5.96e24;

        // Радиус Земли (м)
        double R = 6.37E6;

        // Период обращения спутника (ч)
        double T = 1.5;

        // Высота над поверхностью
        double H;

        // Перевод периода обращения спутника в секунды
        T *= 3600;

        // Высота (в метрах)
        H = Math.pow(G*M*T*T/(4*Math.PI*Math.PI), (double)1/3) - R;

        // Перевод высоты в километры с точностью до тысячных
        H = (double)(Math.round(H))/1000;

        // Вывод результата на экран
        System.out.println("Высота орбиты спутника:");
        System.out.println("H = " + H + " км.");

    }
}
