public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789L;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task3
        System.out.println("Задача 3");
        var dog1 = 8.0;
        var dogLess = dog1 - 3.5;
        var catLess = cat - 1.6;
        var paperLess = paper - 7639;
        System.out.println(dogLess);
        System.out.println(catLess);
        System.out.println(paperLess);
        //task4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //task5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //task6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxer1Weight + boxer2Weight) );
        System.out.println("Разница весов двух бойцов: " + (boxer2Weight - boxer1Weight) );
        //task7
        System.out.println("Задача 7");
        System.out.println("Разница весов двух бойцов (1 способ): " + (boxer2Weight - boxer1Weight) );
        System.out.println("Разница весов двух бойцов (2 способ): " + (boxer2Weight % boxer1Weight) );
        //task8
        System.out.println("Задача 8");
        var workTime = 640; //part1
        var workerTime = 8;
        var workers = workTime / workerTime;
        System.out.println("Всего работников в компании - " + workers + " человек");
        var workersSum = workers + 94;
        var workTimeSum = workersSum * workerTime;
        System.out.println("Если в компании работает " + workersSum + " человека, то всего " + workTimeSum + " часа работы может быть поделено между сотрудниками");







    }
}