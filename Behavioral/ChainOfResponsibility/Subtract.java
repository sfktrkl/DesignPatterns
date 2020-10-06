public class Subtract implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Calculation request) {

        if (request.getCalcWanted() == "sub")
            System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = "
                    + (request.getNumber1() - request.getNumber2()));
        else
            nextInChain.calculate(request);

    }

}
