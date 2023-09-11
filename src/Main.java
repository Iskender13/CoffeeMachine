
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Выберите вид кофе: " +
                "Капучино-1" +
                "Латте-2" +
                "Американо-3");
        int coffee= scanner.nextInt();
        scanner.close();
        String Sugar="Sugar";
        String Caramel="Caramel";
        String Water="Water";
        String Glass="Glass";
        String Milk="Milk";
        String[] work={"1", "2","3","4","5"};

            if (coffee==1){
                Glass();
                Crup();
                Water();
                Milk();
                Hot();
            } else if (coffee==2) {
                Glass();
                Crup();
                Water();
                Caramel();
                Hot();
            } else if (coffee==3) {
                Glass();
                Crup();
                Water();
                Hot();
            }else System.out.println("Выберите кофе из предложенных и нажмите на кнопку указанную рядом с ними и перезапустите");
    }


    public static void Water() {
        System.out.println("Наливаем воду");


    }
    public static void Glass() {
        System.out.println("Ставим стакан");

    }
    public static void Crup() {
        System.out.println("Ложим кофе");
    }
    public static void Hot(){
        System.out.println("Завариваем кофе");
    }
    public static void Milk(){
        System.out.println("Наливаем молоко");
    }
    public static void Caramel(){
        System.out.println("Добавляем карамел и сахар");
    }
}