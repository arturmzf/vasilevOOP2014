package chapter01;

/**
 * @Date: 28.11.2021
 * @Author: Artur Muzafarov
 * @Info: Где-то сидит ошибка, y должен быть 0.46 м
 */

public class Program0107FindCoors {
    public static void main(String[] args){
        // Ускорение свободного падения, м/с^2
        double g = 9.8;
        // Начальная скорость, м/с
        double V = 10;
        // Угол в градусах
        double alpha = 30;
        // Время в секундах
        double t = 5;
        // Расчётные параметры
        double T0, T, x, y;
        // Перевод угла в радианы
        alpha = Math.toRadians(alpha);
        // Время полёта до удара о поверхность
        T0 = 2*V*Math.sin(alpha)/g;
        // Момент последнего удара о поверхность
        T = T0*Math.floor(t/T0);
        // Горизонтальная координата
        x = V*Math.cos(alpha)*t;
        // Высота над поверхностью
        y = V*Math.sin(alpha)*(t-T)-g*(t-T)-g*(t-T)*(t-T)/2;
        // Округление значений
        x = Math.round(100*x)/100.0;
        y = Math.round(100*y)/100.0;
        // Вывод результатов на экран
        System.out.println("x(" + t + ")=" + x + " м");
        System.out.println("y(" + t + ")=" + y + "м");
    }
}
