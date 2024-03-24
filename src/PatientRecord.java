import People;

public class PatientRecord {

    People[] patientRec = new People[100];
    int index=1;

    public void insertPatient (String Fullname, String DateOfBirth){
         patientRec[index].Fullname = Fullname;
         patientRec[index].DateOfBirth = DateOfBirth;
         index ++;
        
    }

    
}
