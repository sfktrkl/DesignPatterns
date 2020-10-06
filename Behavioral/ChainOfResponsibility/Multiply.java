public class Multiply implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    public void calculate(Calculation request) {

        if (request.getCalcWanted() == "mult")
            System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "
                    + (request.getNumber1() * request.getNumber2()));
        else
            nextInChain.calculate(request);

    }

}
