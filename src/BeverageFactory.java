import Beverage.*;

public class BeverageFactory {

    public Beverage makeBeverage(String beverageType) {
        if (beverageType.equals(null)){
            return null;
        }
        else if(beverageType.equals("Tea")){
            return new Tea();
        }
        else if(beverageType.equals("Coffee")){
            return new Coffee();
        }
        else if(beverageType.equals("Cola")){
            return new Cola();
        }


        else if(beverageType.equals("Sprite")){
            return new Sprite();
        }

        return null;
    }

}
