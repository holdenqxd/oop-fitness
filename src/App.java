import java.util.Date;
public class App {
    public static void main(String[] args)
    {
    FitnessClub fitnessClub = new FitnessClub();
    Visitor visitor1 = new Visitor("Пудж", "Момович", 1990);
    Membership membership1 = new Membership(new Date(), new Date(), visitor1);
    fitnessClub.addMembership(membership1, "gym");

    Visitor visitor2 = new Visitor("Чен", "Бобович", 1985);
    Membership membership2 = new Membership(new Date(), new Date(), visitor2);
    fitnessClub.addMembership(membership2, "pool");

    Visitor visitor3 = new Visitor("Баратрум", "Рапирович", 1995);
    Membership membership3 = new Membership(new Date(), new Date(), visitor3);
    fitnessClub.addMembership(membership3, "group");
    fitnessClub.displayVisitors();
    }
}
