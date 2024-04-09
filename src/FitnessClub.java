public class FitnessClub {
    private Membership[] gymMemberships;
    private Membership[] poolMemberships;
    private Membership[] groupClassMemberships;
    private int gymSize;
    private int poolSize;
    private int groupSize;
    public FitnessClub() {
        this.gymMemberships = new Membership[20];
        this.poolMemberships = new Membership[20];
        this.groupClassMemberships = new Membership[20];
        this.gymSize = 0;
        this.poolSize = 0;
        this.groupSize = 0;
    }
    public void addMembership(Membership membership, String zone) {
        if (zone.equals("gym") && gymSize < 20) {
        gymMemberships[gymSize++] = membership;
        }
        else if (zone.equals("pool") && poolSize < 20)
        {
        poolMemberships[poolSize++] = membership;
        }
        else if (zone.equals("group") && groupSize < 20)
        {
        groupClassMemberships[groupSize++] = membership;
        }
        else {
        System.out.println("Посетитель не может пройти в эту зону. Причина: нет свободных мест.");
        return;
    }
        System.out.println("Посетитель " + membership.getVisitor().getFirstName() + " "
            + membership.getVisitor().getLastName() + " добавлен в зону " + zone);
    }
    public void displayVisitors() {
        System.out.println("Посетители зала:");
        displayMemberships(gymMemberships, gymSize);
        System.out.println("Посетители бассейна:");
        displayMemberships(poolMemberships, poolSize);
        System.out.println("Посетители групповых занятий:");
        displayMemberships(groupClassMemberships, groupSize);
    }
    private void displayMemberships(Membership[] memberships, int size)
    {
        for (int i = 0; i < size; i++)
        {
            System.out.println(memberships[i].getVisitor().getFirstName() + " " + memberships[i].getVisitor().getLastName());
        }
    }
}
