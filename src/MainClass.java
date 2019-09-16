public class MainClass {
    public static void main(String[] args) {
        Bowl boul1 = new Bowl();
        System.out.println("В миске " + boul1.getQuantity() + "мл еды.");
        Cat[] arcCats = new Cat[10];// создаем массив из котов
        arcCats[0] = new Cat("Васька", 223);
        arcCats[1] = new Cat("Барсик", 189);
        arcCats[2] = new Cat("Белок", 88);
        arcCats[3] = new Cat("Пушок", 255);
        arcCats[4] = new Cat("Рыжик", 155);
        arcCats[5] = new Cat("Лемон", 203);
        arcCats[6] = new Cat("Шуршик", 90);
        arcCats[7] = new Cat("Чебурек", 256);
        arcCats[8] = new Cat("Сансаныч", 300);
        arcCats[9] = new Cat("Чубайс", 216);


        for (Cat i : arcCats) {
            System.out.println(i.name + " может съесть " + i.getAppetit());
            i.Eat();
            System.out.println("В миске осталось: " + Bowl.quantity);
            if (Bowl.quantity == 0) {
                Bowl.quantity += 500;
                System.out.println("Наполняем миску!");
            }
            System.out.print("кот " + i.name);

            if (i.hungry) {
                System.out.println(" голодный.");
            } else System.out.println(" сыт");
            System.out.println("--------------------------");
        }
    }
}