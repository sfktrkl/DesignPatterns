// ConcreteColleague: It implements the colleague interface and communicates with other colleagues through its mediator
public class JTPoorman extends Colleague {

    public JTPoorman(Mediator mediator) {
        super(mediator);
        System.out.println("JT Poorman signed up with the stockexchange\n");
    }

}