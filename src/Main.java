public class Main {

    public static void main(String[] args) {
        int a = 0;
        String name = "Kris";
        int age = 2;
        while (a++ < 10) {
            System.out.println("Котик - " + name + ", его возраст - " + age);
        }
        Cat cat = new Cat();
        for (int b = 0; b < 10; b++) {
            System.out.println("Котик - " + cat.name_1 + ", его возраст - " + cat.age_1);
        }
        int c = 1;
        do {
            System.out.println(cat.toString());
        }
        while (c++ < 10);
        String[][] cat_2 = {{"Bill", "2"}, {"Villi", "4"}, {"Arich", "2"}, {"Jonn", "7"}, {"Jaric", "9"}};
        for (int i = 0; i < cat_2.length; i++) {
            for (int j = 0; j < cat_2[i].length; j++) {
                System.out.println(cat_2[i][j]);
            }
        }
    }
}
