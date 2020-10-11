// Concrete Visitor Class
public class TaxHolidayVisitor implements Visitor {

    // This is created so that each item is sent to the
    // right version of visit() which is required by the
    // Visitor interface and defined below

    public double visit(Liquor liquor) {
        System.out.println("Liquor: Price with Tax");
        return liquor.getPrice() * .10 + liquor.getPrice();
    }

    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco: Price with Tax");
        return tobacco.getPrice() * .30 + tobacco.getPrice();
    }

}