import java.util.*;
import java.lang.*;

public class main  {

    public static void main(String[] args) {
        /* Задача №9: Ввод/вывод данных для массива.
          Выполнил Хлюстов М.В.
          Условие: Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
          где каждый элемент массива умножается на 2. Размер массива задается пользователем.
        */
        Scanner in = new Scanner(System.in); // объявим объект для ввода
        int  strSize;
        System.out.print("Уважаемый пользователь введите размер массива:=");
        strSize =  in.nextInt();//записали в переменную
        System.out.println("");
        int mArray[] = new int[strSize] ;
        for (int i=0,j=1;i<strSize;i++,j++)
        {
            System.out.print("Введите элемент №" + j + " = " );
            mArray[i] =in.nextInt();
            System.out.println("N" + i + " = " + mArray[i]*2);
        }
        System.exit(0);// завершим выполнение программы

    }
    }