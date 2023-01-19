import transport.Transport;

public class Mechanic <T extends Transport<?>> {
    private String fullName;
    private String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }
    public void doMaintenance(T transport){
        System.out.println(this + " проводит техобслуживание " + transport);
    }
    public void fixTransport(T transport){
        System.out.println(this + " чинит " + transport);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик " + fullName + ". Из компании " + company;
    }
}
