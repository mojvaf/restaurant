public class Menu {
    Appetizer[] appetizers;
    Entree[] entrees;
    Dessert[] desserts;

    public Menu(Appetizer[] firstCourse, Entree[] secondCourse, Dessert[] lastCourse) {
        this.entrees = secondCourse;
        this.appetizers = firstCourse;
        this.desserts = lastCourse;
    }

    public void printMenu() {
        for (Appetizer a : appetizers) {
            System.out.println(a.name + a.price);
        }
        for (Entree e : entrees) {
            System.out.println(e.name + e.price);
        }
        for (Dessert d : desserts) {
            System.out.println(d.name + d.price);
            System.out.println("Tea Included" + d.withTea);
        }
        System.out.println("the items and total " + getThePrice());

    }

    public double getThePrice() {
        double total = 0;
        for (Appetizer a : appetizers) {
            total += a.price;
        }
        for (Entree e : entrees) {
            total += e.price;
        }
        for (Dessert d : desserts) {
            total += d.price;
        }
        return total;
    }
}


