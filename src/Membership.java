import java.util.Date;
public class Membership {
    private Date registrationDate;
    private Date expiryDate;
    private Visitor visitor;
    public Membership(Date registrationDate, Date expiryDate, Visitor visitor)
    {
        this.registrationDate = registrationDate;
        this.expiryDate = expiryDate;
        this.visitor = visitor;
    }
    public Date getRegistrationDate()
    {
        return registrationDate;
    }
    public Date getExpiryDate()
    {
        return expiryDate;
    }
    public Visitor getVisitor() {
        return visitor;

    }
}