public class homeappliancesstore{
    //
    static String companyname;
    static String address;
    static int employees;
    public static String getCompanyname() {
        return companyname;
    }

    public static void setCompanyname(String companyname) {
        homeappliancesstore.companyname = companyname;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        homeappliancesstore.address = address;
    }

    public static int getEmployees() {
        return employees;
    }

    public static void setEmployees(int employees) {
        homeappliancesstore.employees = employees;
    }



    public static void main(String[]args){

        try{
            //companyname=args[0]
            homeappliancesstore.setCompanyname(args[0]);
            //address=args[1]
            homeappliancesstore.setAddress(args[1]);
            try {
                //employees=Integer.parseInt(args[2])
                homeappliancesstore.setEmployees(Integer.parseInt(args[2]));
                if(companyname == null || address == null) {
                    System.out.println("Error");
                }else{
                    System.out.println("company name: " + companyname);
                    System.out.println("address: " + address);
                    System.out.println("employees: " + employees);
                }
            }catch(NumberFormatException e){
                System.out.println("not an int givens");
            }


        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error not enough arguments givens");
        }

    }
}