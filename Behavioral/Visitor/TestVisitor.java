public class TestVisitor {

    public static void main(String[] args) {

        TaxVisitor visitor = new TaxVisitor();
        TaxHolidayVisitor holidayVisitor = new TaxHolidayVisitor();

        Liquor vodka = new Liquor(12);
        Tobacco cigar = new Tobacco(20);

        System.out.println(vodka.accept(visitor));
        System.out.println(cigar.accept(visitor));

        System.out.println(vodka.accept(holidayVisitor));
        System.out.println(cigar.accept(holidayVisitor));

    }
}
