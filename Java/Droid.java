package codecademy_projects;

public class Droid {
    String name;
    int batteryLevel = 100;

    public String toString(){
      return "Hello, I am the droid: " + name;
    }
    public Droid(String droidName){
      name = droidName;    
    }
    public void performTask(String task){
      System.out.println(name + " is perfoming task: " + task);
      batteryLevel = batteryLevel - 10;
    }
    public void energyReport(){
      System.out.println(name + "'s current battery level: " + batteryLevel);
    }
    public static void energyTransfer(Droid a, Droid b, int amount){
      a.batteryLevel = a.batteryLevel - amount;
      b.batteryLevel = b.batteryLevel + amount;
      System.out.println(a.name + " has transfered " + amount + " battery units to " + b.name);
    }
    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.performTask("cleanning the kitchen.");
        Codey.performTask("washing the dishes.");
        Codey.performTask("cooking dinner.");
        Codey.energyReport();
        Droid d1 = new Droid("first droid");
        d1.performTask("dancing.");
        d1.energyReport();
        energyTransfer(d1, Codey, 10);
        Codey.energyReport();
        d1.energyReport();

    }
}