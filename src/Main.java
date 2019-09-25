public class Main {

    public static void main(String[] args) {
	// make a menu object and assess it
     Appetizer fruit = new Appetizer("fresh fruit", 5.9);
     Appetizer salad = new Appetizer("cesar salad", 7);
     Appetizer bread = new Appetizer("butter and bred", 3);
     Entree vagePizza = new Entree("vege pizza","small",10);
     Entree mashroomPizza = new Entree("mashroom pizza", "small",12);
     Dessert iceCream = new Dessert("vanilla ice cearm", 5);
     Dessert cake = new Dessert("banana cake", false,4.5);

     Entree[] arrayOfEntree = {vagePizza,mashroomPizza};
     Appetizer [] arrayOfAppetizer= {fruit,salad,bread};
     Dessert[] arrayOfDessert= {iceCream,cake};

     Menu menu= new Menu(arrayOfAppetizer,arrayOfEntree,arrayOfDessert);
     Restaurant restaurant = new Restaurant("Mom Moj", menu);
     restaurant.menu.printMenu();
    }
}


