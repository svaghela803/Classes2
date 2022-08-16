public class Customer {

    int id;
    String firstName;

    String lastName;
    double HeldMoney;

    public Customer(int id, String firstName, String lastName, double HeldMoney){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getid() {
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName (String firstName){
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName (String lastName){
        this.lastName = lastName;
    }

    public double getHeldMoney() {
        return HeldMoney;
    }

    public void setHeldMoney (double HeldMoney){
        this.HeldMoney = HeldMoney;
    }

    public String getFullName(){
        return firstName + " " + lastName;
        }



    public double getHeldMoney; {

        this.HeldMoney = HeldMoney;
    }

    public void subtractHeldMoney(double deduction) {
        setHeldMoney(HeldMoney - deduction);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", heldMoney=" + HeldMoney +
                '}';
    }






}
