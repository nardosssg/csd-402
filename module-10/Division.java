/*Nardos Gebremedhin
* Module 10 Programming Assignment
*
*  This program defines an abstract Division class that represents
*  a company division with a name and account number. Two subclasses, InternationalDivision and DomesticDivision
*  extend Division by adding fields for location-specific details—country and language for international divisions,
*  and state for domestic divisions.
 */

abstract class Division  {
    //fields
    protected String companyName;
    protected int accountNum;

    // Constructor to initialize all fields
    public Division(String companyName, int accountNum) {
        this.companyName = companyName;
        this.accountNum = accountNum;
    }

    // abstract display () method
    abstract void display();

}