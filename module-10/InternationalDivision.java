class InternationalDivision extends Division {
    //fields
    protected String countryLocation;
    protected String language;

    // constructor that requires all fields when created.
    public InternationalDivision(String companyName, int accountNum, String countryLocation, String language) {
        super(companyName, accountNum);
        this.countryLocation = countryLocation;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + companyName);
        System.out.println("Account Number: " + accountNum);
        System.out.println("Country: " + countryLocation);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
