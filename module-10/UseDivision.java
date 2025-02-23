public class UseDivision {
    public static void main(String[] args) {
        // Creating InternationalDivision instances
        InternationalDivision intDiv1 = new InternationalDivision
                ("SpaceCorp", 134, "Japan", "Japanese");
        InternationalDivision intDiv2 = new InternationalDivision
                ("LavPinkCorp", 345, "Singapore", "Malay");

        // Create Domestic Division instances
        DomesticDivision domDiv1 = new DomesticDivision("BBLeviTech", 201, "California");
        DomesticDivision domDiv2 = new DomesticDivision("HelviCorp", 596, "Texas");

        // display the details
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();


    }
}
