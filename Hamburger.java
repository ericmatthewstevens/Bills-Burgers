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
    double hamburgerPrice = this.price;
    
    System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll" 
    + "with " + this.meat + " priced at $" + this.price);
    if (this.addition1Name != null) {
      hamburgerPrice += this.addition1Price;
      System.out.println("Added " + this.addition1Name + " at $" + this.addition1Price + " extra.");
    }
    if (this.addition2Name != null) {
      hamburgerPrice += this.addition2Price;
      System.out.println("Added " + this.addition2Name + " at $" + this.addition2Price + " extra.");
    }
    if (this.addition3Name != null) {
      hamburgerPrice += this.addition3Price;
      System.out.println("Added " + this.addition3Name + " at $" + this.addition3Price + " extra.");
    }
    if (this.addition4Name != null) {
      hamburgerPrice += this.addition4Price;
      System.out.println("Added " + this.addition4Name + " at $" + this.addition4Price + " extra.");
    }
    return hamburgerPrice;
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
     super("Deluxe", "Sausage & Bacon", 14.54, "White");
     super.addHamburgerAddition1("Chips", 2.75);
     super.addHamburgerAddition2("Drink", 1.81);
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

}

  class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
      super("Healthy", meat, price, "Wheat");
    }

    public void addHealthyAddition1(String name, double price) {
      this.healthyExtra1Name = name;
      this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
      this.healthyExtra2Name = healthyExtra2Name;
      this.healthyExtra2Price = healthyExtra2Price;
    }
    
    @Override
    public double itemizehamburger() {
      double hamburgerPrice  = super.itemizehamburger();
      
      if (this.healthyExtra1Name != null) {
        hamburgerPrice += this.healthyExtra1Price;
        System.out.println("Added " + this.healthyExtra1Name + " at $" + this.healthyExtra1Price + " extra.");
      }
      if (this.healthyExtra2Name != null) {
        hamburgerPrice += this.healthyExtra2Price;
        System.out.println("Added " + this.healthyExtra2Name + " at $" + this.healthyExtra2Price + " extra.");
      }
      return hamburgerPrice;
    }

  }
