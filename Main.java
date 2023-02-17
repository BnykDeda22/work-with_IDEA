import figure.*;
import figure.quadrangle.*;
public class Main {
    public static void main(String[] args) {
        figure fig = new figure("Рандомная фигруа", 15, 24);
        circle cir = new circle("Круг", 12.8, 12.8, 2);
        pentagon pen = new pentagon("Пятиугольник", "Выпуклый", 128, 192);
        quadrangle qua = new quadrangle("Квадрат", 4, 4, 4, 4);
        System.out.println(qua.getPerimetr());
        Rectangle rec = new Rectangle("Прямоугольник", 4.5, 8.8, 4.5, 8.8);
        System.out.println(rec.getPerimetr());
    }
}
