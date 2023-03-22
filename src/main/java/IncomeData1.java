public class IncomeData1 implements IncomeData{

    private final String CountryCode;
    private final String Company;
    private final String ContactFirstName;
    private final String ContactLastName;
    private final int PhoneCode;
    private final long PhoneNumber;
    public IncomeData1(String CountryCode,String Company, String ContactFirstName, String ContactLastName, int PhoneCode, long PhoneNumber){

        this.CountryCode = CountryCode;
        this.Company = Company;
        this.ContactFirstName = ContactFirstName;
        this.ContactLastName = ContactLastName;
        this.PhoneCode = PhoneCode;
        this.PhoneNumber = PhoneNumber;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getCompany() {
        return Company;
    }

    public String getContactFirstName() {
        return ContactFirstName;

    }

    public String getContactLastName() {
        return ContactLastName;
    }

    public int getCountryPhoneCode() {
        return PhoneCode;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

}