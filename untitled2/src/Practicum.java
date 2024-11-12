import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        Forest forest = new Forest();

        forest.setSeason("лето");
        System.out.println("В лесу лето!");




        System.out.println("Список зайцев:");
        for (MountainHare hare:hares)
            System.out.println(hare);

        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        forest.setSeason("зима");

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        for (MountainHare hare:hares)
            System.out.println(hare);

    }
}
