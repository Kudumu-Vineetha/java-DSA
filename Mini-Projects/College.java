class Participant{
    private int participantID;
    private String name;
    private double baseRegistrationFee;
    private int numberOfEvents;
    private double eventChargePerEvent;

    public void setParticipantId(int p){
        participantID=p;
    }
    public void setName(String n){
        name=n;
    }
    public void setBaseRegistrationFee(double f){
        baseRegistrationFee=f;
    }
    public void setNumberOfEvents(int e){
        numberOfEvents=e;
    }
    public void setEventChargePerEvent(double c){
        eventChargePerEvent=c;
    }

    public int getParticipantId()
    {
        return participantID;
    }
    public String getName()
    {
        return name;
    }
    public double getBaseRegistrationFee()
    {
        return baseRegistrationFee;
    }
    public int getNumberOfEvents()
    {
        return numberOfEvents;
    }
    public double getEventChargePerEvent()
    {
        return eventChargePerEvent;
    }

    double calculateTotalFee(){
        return baseRegistrationFee+(numberOfEvents*eventChargePerEvent);

    }
    void displayDetails(){
        System.out.println("Participant Record");
        System.out.println("ID: "+participantID);
        System.out.println("Name: "+name);
        System.out.println("Base Registration Fee: "+baseRegistrationFee);
        System.out.println("Event Charges:"+ numberOfEvents+" events"+" @ "+eventChargePerEvent+"/event");
        System.out.println("Total Fee:" +calculateTotalFee());
    }
    
}
public class College {
    public static void main(String args[]){
        Participant ob=new Participant();
        ob.setParticipantId(585);
        ob.setName("vineetha");
        ob.setBaseRegistrationFee(200);
        ob.setNumberOfEvents(3);
        ob.setEventChargePerEvent(100);
        ob.displayDetails();

    }
    
}
