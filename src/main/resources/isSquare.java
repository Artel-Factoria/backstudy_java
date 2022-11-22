import java.lang.Math.*;
public class isSquare{
    public static boolean isNumberASquare(int n) {//Мы получаем переменную, число n(We are getting variable, number n)
        return Math.sqrt(n)% 1 == 0; //Находим квадрат числа и если оно целое - то выводим true, в ином случае false
        //(We find square of number and returning true if number is without point. otherwise false)
    }
}