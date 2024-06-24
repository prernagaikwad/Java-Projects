//Static and non static concept
public class Paitent
{
     //Static variable
     static String hospitalName = "City General Hospital";
     static String hospitalAddress = "Pune" ;

     //Non static variable
     int patientID;
     String name;
     String ailment;

     public Paitent(int patientID ,String name,String ailment)
     {
         this.patientID = patientID;
         this.name = name;
         this.ailment = ailment;

     }
     public static void setHospitalName(String newHospitalName)
     {
          hospitalName = newHospitalName;
     }

     public static void setHospitalAddress(String newHospitalAddress)
     {
          hospitalAddress = newHospitalAddress;
     }

     public void displayDetails()
     {
          System.out.println("Patient ID:" + patientID);
          System.out.println("Name: "+name);
          System.out.println("Ailment: " + ailment);
          System.out.println("Hospital Name: "+ hospitalName);
          System.out.println("Hospital Address: "+ hospitalAddress);

     }

     public static void main(String[] args)
     {
          Paitent obj = new Paitent(101,"John doe","Flu");
          Paitent obj1 = new Paitent(102,"Jane Smith","Broken Arm");
          Paitent obj2 =  new Paitent(103,"Ramboo luis","Maleria");





          obj.displayDetails();
          System.out.println();
          obj2.displayDetails();
          System.out.println();
          obj1.displayDetails();

          System.out.println();
          Paitent.setHospitalName("Metropolis Central Hospital");
          Paitent.setHospitalAddress("Mumbai");
          System.out.println("\n Updated Hospital Info \n");
          obj.displayDetails();
          System.out.println();
          obj2.displayDetails();


     }


}
