public class Main {

    public static void main(String[] args) {

//        Account Example

        Account myAccount = new Account("1", "Johnson", 300);
        System.out.println(myAccount);

        System.out.println(myAccount.getBalance());

//        Circle Example
        Circle myCircle = new Circle(10);
        System.out.println(myCircle.getCircumference());

// Rectangle Example
        Rectangle myRectangle = new Rectangle(2,4);
        System.out.println(myRectangle.getPerimeter());

        System.out.println(myRectangle.getArea());

        System.out.println(myRectangle.getDiagonal());

//Customer
        Customer myCustomer = new Customer(2, "John", "Smith",100);
        System.out.println(myCustomer.getFullName());
        System.out.println(myCustomer.getHeldMoney());

        myCustomer.subtractHeldMoney(20);
        System.out.println("HELD MONEY AFTER SUBTRACTION: "+myCustomer.getHeldMoney());


    }
}
