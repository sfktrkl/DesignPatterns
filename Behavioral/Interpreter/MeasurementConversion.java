public class MeasurementConversion {

    public static void main(String[] args) {

        System.out.println("Convert measurements (gallons, quarts, pints, cups, tablespoons)");
        System.out.println("Example: 2 gallons to pints");
        String input = System.console().readLine();

        // Add the question to the context for analysis
        ConversionContext question = new ConversionContext(input);
        Expression from = getExpression(question.getFrom());
        String to = question.getTo();
        double quantity = question.getQuantity();
        String response = question.getResponse();

        if (to.matches("gallons*")) {
            response += from.gallons(quantity);
        } else if (to.matches("pints*")) {
            response += from.pints(quantity);
        } else if (to.matches("cups*")) {
            response += from.cups(quantity);
        } else if (to.matches("quarts*")) {
            response += from.quarts(quantity);
        } else if (to.matches("tablespoons*")) {
            response += from.tablespoons(quantity);
        }

        System.out.println(response + " " + to);

    }

    private static Expression getExpression(String expression) {

        if (expression.matches("gallons*")) {
            return new Gallons();
        } else if (expression.matches("pints*")) {
            return new Pints();
        } else if (expression.matches("cups*")) {
            return new Cups();
        } else if (expression.matches("quarts*")) {
            return new Quarts();
        } else if (expression.matches("tablespoons*")) {
            return new Tablespoons();
        } else {
            return null;
        }

    }

}
