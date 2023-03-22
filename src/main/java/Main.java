import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> contries = new HashMap<String, String>();


    public static void main(String[] args) {
        contries.put("RU", "Russia");
        contries.put("BY", "Belarus");
        contries.put("UA", "Ukraine");
        contries.put("KZ", "Kazakhstan");

        IncomeData data1 = new IncomeData1("RU",
                "RELEX",
                "Ivan",
                "Ivanov",
                7,
                9518743228L);

        Contact contact = new IncomeDataAdapter(data1, contries);
        System.out.println(contact.getName());
        System.out.println(contact.getPhoneNumber());

        Customer cust = new IncomeDataAdapter(data1, contries);
        System.out.println(cust.getCompanyName());
        System.out.println(cust.getCountryName());


        System.out.println("\n\n");
        contact = new IncomeDataAdapter(data1, contries);
        System.out.println(contact.getName());
        System.out.println(contact.getPhoneNumber());

    }


}