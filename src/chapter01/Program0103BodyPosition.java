package chapter01;

/**
 * Полёт брошенного под углом к горизонту тела
 */

public class Program0103BodyPosition {
    public static void main(String[] args){

        // Ускорение свободного падения
        double g = 9.8;
        // Число Пи
        double pi = 3.141592;
        // Угол к горизонту (в градусах)
        double alpha = 30;
        // Масса тела (в килограммах)
        double m = 0.1;
        // Коэффицент сопротивления воздуха (Н*с/м)
        double gamma = 0.1;
        // Скорость тела (в м/с)
        double V = 100.0;
        // Время (в секундах)
        double t = 1.0;
        // Координаты тела (в метрах)
        double x,y;
        // Перевод градусов в радианы
        alpha /= 180/pi;

        // Вычисление координат
        x=V*m*Math.cos(alpha)/gamma*(1-Math.exp(-gamma*t/m));
        y=m*(V*Math.sin(alpha)*gamma+m*g)/(gamma*gamma)*(1-Math.exp(-gamma*t/m)) - m*g*t/gamma;
        //y=m*(V*Math.sin(alpha)*gamma+m*g)/gamma/gamma*(1-Math.exp(-gamma*t/m)) - m*g*t/gamma;

        // Вывод информации на экран
        System.out.println("Координаты тела для t = " + t + " сек. составляют:\n x = " + x + " м.\n y = " + y + " м.");
        System.out.println("Параметры:");
        System.out.println("- угол alpha = " + alpha*180/pi + " градусов;");
        System.out.println("- скорость V = " + V + " м/с;");
        System.out.println("- коэффицент сопротивления воздуха gamma = " + gamma + " Н*с/м;");
        System.out.println("- масса тела m = " + m + " кг.");
    }
}
