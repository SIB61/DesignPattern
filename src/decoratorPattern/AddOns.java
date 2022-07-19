package decoratorPattern;

abstract class AddOns implements Drink{
    Drink drink;

   AddOns(Drink drink){
       this.drink=drink;
   }

}
