public class Main {
    public static void main(String[] args) {
        int springMaintCost = 250;
        int summerMaintCost = 300;
        int fallMaintCost = 225;
        int winterMaintCost = 250;
        int totalMaintCost = springMaintCost + summerMaintCost + fallMaintCost + winterMaintCost;
        System.out.println("Your maintenance in the spring was " + springMaintCost + ". Your maintenance cost in the summer was " + summerMaintCost + ". Your maintenance cost in the fall was " + fallMaintCost + ".");
        System.out.println("Your maintenance cost in the winter was " + winterMaintCost + ". Your total cost for maintenance this year was " + totalMaintCost + ".");
    }
}