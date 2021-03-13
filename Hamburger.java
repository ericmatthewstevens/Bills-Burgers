public class Hamburger {
  
  private String name;
  private String meat;
  private double price;
  private String breadRollType;

  private String addition1Name;
  private String addition2Name;
  private String addition3Name;
  private String addition4Name;

  private double addition1Price;
  private double addition2Price;
  private double addition3Price;
  private double addition4Price;
 
  //Separate variables for four (4) possible addition to the burger.
  //addition1Name() - Return type: String
  //addition1Price() - Return type: Double
  //addition2Name() - Return type: String
  //addition2Price() - Return type: Double
  //addition3Name() - Return type: String
  //addition3Price() - Return type: Double
  //addition4Name() - Return type: String
  //addition4Price() - Return type: Double

  public Hamburger(String name, String meat, double price, String breadRollType) {
    this.name = name;
    this.meat = meat;
    this.price = price;
    this.breadRollType = breadRollType;
  }

  public void addHamburgerAddition1(String addition1Name, double addition1Price) { // Parameters must include the additional name and price variables.
    name = name + " " + addition1Name;
    price += addition1Price;
  }

  public void addHamburgerAddition2(String addition2Name, double addition2Price) {
    name = name + " " + addition2Name;
    price += addition2Price;
  }

  public void addHamburgerAddition3(String addition3Name, double addition3Price) {
    name = name + " " + addition3Name;
    price += addition3Price;
  }

  public void addHamburgerAddition4(String addition4Name, double addition4Price) {
    name = name + " " + addition4Name;
    price += addition4Price;
  }

  public double itemizehamburger() {
    System.out.println("One order of " + name + " on a " + breadRollType + " with " + addition1Name + ", " + addition2Name + ", " + addition3Name + " and " + addition4Name);
    return price + (addition1Price + addition2Price + addition3Price + addition4Price);
  }

  /*Methods to calculate hamburger additions
  * - addHamburgerAddition1() [DONE], addHamburgerAddition2() [DONE], addHamburgerAddition3(), addHamburgerAddition4().
  * -- These four (4) methods do NOT return values.
  * 

  * Method invoked to print out itemizedd listing of the final hamburger with addons, if any, and total price.
  * - itemizehamburger().
  * -- Return type of double.
  * --- This includes the base price of the burger, plus any additional items.
  */

}

class DeluxeBurger extends Hamburger {

  /**
   * NO additional member variables
   * 
   * Constructor: 
   * * No parameters
   * * Instead, it wil create a deluxe burger with all fixings, with chips and a drink
   * * Base price of $19.10.
   */

   public DeluxeBurger() {
     super("Cheese", "Sausage & Bacon", 14.54, "White roll");
   }

   @Override
   public void addHamburgerAddition1(String addition1Name, double addition1Price) {
     System.out.println("Additional items cannot be added to a deluxe burger.");
   }

   @Override
   public void addHamburgerAddition2(String addition2Name, double addition2Price) {
    System.out.println("Additional items cannot be added to a deluxe burger.");
  }

  @Override
  public void addHamburgerAddition3(String addition3Name, double addition3Price) {
    System.out.println("Additional items cannot be added to a deluxe burger.");
  }

  @Override
  public void addHamburgerAddition4(String addition4Name, double addition4Price) {
    System.out.println("Additional items cannot be added to a deluxe burger.");
  }

  @Override
  public double itemizehamburger() {
    double chips = 2.75;
    double drink = 1.81;
    return ((chips + drink) + super.itemizehamburger());
  }

}

  class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
      super("Healthy Burger", meat, price, "Wheat Roll");
    }

    public void addHealthyAddition1(String name, double price) {
      name = name + " " + healthyExtra1Name;
      price += healthyExtra1Price;
    }

    public void addHealthyAddition2(String name, double price) {
      name = name + " " + healthyExtra2Name;
      price += healthyExtra2Price;
    }

    @Override
    public double itemizehamburger() {
      return (super.itemizehamburger() + (healthyExtra1Price + healthyExtra2Price));
    }
  }
