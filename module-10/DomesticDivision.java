class DomesticDivision extends Division {
    //field
    protected String stateLocation;

    // constructor that requires all fields when created.
    public DomesticDivision(String companyName, int accountNum, String stateLocation) {
        super(companyName, accountNum);
        this.stateLocation = stateLocation;
    }

    //
    @Override
    public void display() {
        System.out.println("Domestic Division: " + companyName);
        System.out.println("Account Number: " + accountNum);
        System.out.println("State: " + stateLocation);
        System.out.println();
    }
    }

