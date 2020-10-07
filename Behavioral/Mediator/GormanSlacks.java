// ConcreteColleague: It implements the colleague interface and communicates with other colleagues through its mediator
public class GormanSlacks extends Colleague {

    public GormanSlacks(Mediator mediator) {
        super(mediator);
        System.out.println("Gorman Slacks signed up with the stockexchange\n");
    }

}
