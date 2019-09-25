public class Dessert extends Dish {
    Boolean withTea;
 public Dessert(String name, double price){
     super(name, price);
 }

 public Dessert(String name, Boolean withTea , double price){
     super(name,price);
     this.withTea = withTea;
 }


}
