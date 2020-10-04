public class SandwichSculptor {

    public static void main(String[] args) {

        System.out.print("\nItalian Hoagie");
        ItalianHoagie italianHoagie = new ItalianHoagie();
        italianHoagie.makeSandwich();

        System.out.print("\n\nVeggie Hoagie");
        VeggieHoagie veggieHoagie = new VeggieHoagie();
        veggieHoagie.makeSandwich();

    }

}
