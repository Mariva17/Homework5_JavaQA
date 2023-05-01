package Homework_Lesson4;

/* Создать класс, описывающий кота.
У кота должно быть имя, возраст и цвет.
Не должно быть прямого доступа к полям класса,
только через геттеры и сеттеры.
Не должно быть возможности создать кота совсем без параметров
(не бывает котов с никаким цветом, например).
Должна быть возможность создать кота со всеми параметрами сразу.
Должна быть возможность создать кота только с цветом
(увидели где-то незнакомого кота).
Должна быть возможность создать кота с цветом и именем
(приютили кота с улицы, имя дали, а возраст не знаем).
Кот должен уметь выводить полную информацию о себе в консоль, при этом если
какой-то параметр неизвестен (например, возраст),
то информация об этом параметре не выводится.
Кот должен уметь мяукать.
Кота должно быть можно покормить определённым количеством еды.
Если количество еды 10 или больше, вывести в консоль, что кот сытый,
иначе вывести в консоль, что кот всё ещё голодный, причём в выводе
информации в консоль должно присутствовать имя кота (если мы его знаем).
Создать второй класс с точкой входа и продемонстрировать в нём возможности кота.
*
* */

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Tom", 3, "white");

        Cat cat2 = new Cat("Nick", "black");

        Cat cat3 = new Cat("brown");

        Cat cat4 = new Cat("Bob", 1, "black");

        cat2.voice();
        cat4.voice();
        cat3.setName("Liz");
        cat.setFood(10);
        cat3.setFood(4);

    }
}
