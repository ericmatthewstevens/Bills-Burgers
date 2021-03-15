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
    this.addition1Name = addition1Name;
    this.addition1Price = addition1Price;
  }

  public void addHamburgerAddition2(String addition2Name, double addition2Price) {
    this.addition2Name = addition2Name;
    this.addition2Price = addition2Price;
  }

  public void addHamburgerAddition3(String addition3Name, double addition3Price) {
    this.addition3Name = addition3Name;
    this.addition3Price = addition3Price;
  }

  public void addHamburgerAddition4(String addition4Name, double addition4Price) {
    this.addition4Name = addition4Name;
    this.addition4Price = addition4Price;
  }

  public double itemizehamburger() {
    double burgerPrice = this.price;
    
    System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll." 
    + " Base Price: $" + this.price);
    if (this.addition1Name != null) {
      burgerPrice += this.addition1Price;
      System.out.println("Added " + this.addition1Name + " at $" + this.addition1Price + " extra.");
    }
    if (this.addition2Name != null) {
      burgerPrice += this.addition2Price;
      System.out.println("Added " + this.addition2Name + " at $" + this.addition2Price + " extra.");
    }
    if (this.addition3Name != null) {
      burgerPrice += this.addition3Price;
      System.out.println("Added " + this.addition3Name + " at $" + this.addition3Price + " extra.");
    }
    if (this.addition4Name != null) {
      burgerPrice += this.addition4Price;
      System.out.println("Added " + this.addition4Name + " at $" + this.addition4Price + " extra.");
    }

    System.out.println("Total Price: $" + burgerPrice);
    return price;
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
     super("Cheese", "Sausage & Bacon", 14.54, "White");
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
    double burgerPrice;

    return ((chips + drink) + super.itemizehamburger());
  }

}

  class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
      super("Healthy Burger", meat, price, "Wheat");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
      this.healthyExtra1Name = healthyExtra1Name;
      this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
      this.healthyExtra2Name = healthyExtra2Name;
      this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizehamburger() {
      System.out.println(HealthyBurger() + " hamburger on a " + this.breadRollType + " roll." 
      + " Base Price: $" + this.price);
      if (this.addition1Name != null) {
        burgerPrice += this.addition1Price;
        System.out.println("Added " + this.addition1Name + " at $" + this.addition1Price + " extra.");
      }
      if (this.addition2Name != null) {
        burgerPrice += this.addition2Price;
        System.out.println("Added " + this.addition2Name + " at $" + this.addition2Price + " extra.");
      }
      if (this.addition3Name != null) {
        burgerPrice += this.addition3Price;
        System.out.println("Added " + this.addition3Name + " at $" + this.addition3Price + " extra.");
      }
      if (this.addition4Name != null) {
        burgerPrice += this.addition4Price;
        System.out.println("Added " + this.addition4Name + " at $" + this.addition4Price + " extra.");
      }
  
      System.out.println("Total Price: $" + burgerPrice);
      return price;
      }

  }
