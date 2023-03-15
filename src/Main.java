public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float temp = 7;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " ,то придется платить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 27;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }else
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }


    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 55;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататться на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься с родителями на аттракционах");
        } else
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно самостоятельно кататься на аттракционах");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");

        int spot = 15;
        if (spot < 60) {
            System.out.println("Есть сидячие места");
        }
        if (spot > 60 && spot < 102) {
            System.out.println("Есть стоячие");
        } else {
            if (spot >= 102) {
                System.out.println("Мест нет");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two){
            if (one >= three) {
                System.out.println("Большее число " + one);
            }
            else {
                System.out.println("Большее число " + three);
            }
        }else if (two > one){
            if (two >= three ) {
                System.out.println("Большее чсило " + two);
            }
            else {
                System.out.println("Большее число " + three);
            }
        }else if ( one > three) {
            System.out.println("Большее число " + one);
        }else if ( three > one) {
            System.out.println("Большее число " + three);
        }else {
            System.out.println("все числа одинаковые");
        }
    }
}
