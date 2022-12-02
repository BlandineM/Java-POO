public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String name, boolean aware) {
        this.firstname = name;
        this.aware = aware;
    }

    public String getFirstname(){ return this.firstname; }
    public boolean getAware(){ return this.aware; }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        return "Je m'appelle " + this.getFirstname() + (this.aware?" et je suis aware" :" et je ne suis pas aware");
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}