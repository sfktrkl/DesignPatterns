public class ConversionContext {

    private String input = "";
    private String response = "";
    private String from = "";
    private String to = "";
    private double quantity;

    public ConversionContext(String input) {
        this.input = input;

        // Split input based on spaces
        String[] partsOfQuestion = input.split(" ");

        // Example input: 1 gallons to pints
        from = partsOfQuestion[1].toLowerCase();
        to = partsOfQuestion[3].toLowerCase();
        quantity = Double.valueOf(partsOfQuestion[0]);
        response = partsOfQuestion[0] + " " + partsOfQuestion[1] + " equals ";
    }

    public String getInput() {
        return input;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getResponse() {
        return response;
    }

    public double getQuantity() {
        return quantity;
    }

}
