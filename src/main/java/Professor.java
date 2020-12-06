import java.util.Date;

public class Professor extends User{
private Faculty faculty=Faculty.TUB;
private Campus campus=Campus.KLE;
private int phone=0;

 private Professor(){super();}

 public Professor (String id,String firstname, String lastname)
 {
	 
     super(id,Domain.STAFF,firstname,lastname);
     
     }
 public Professor(String id,String firstname, String lastname,Date birthdate)
 {
     super(id,Domain.STAFF,firstname,lastname,birthdate);
  
 }
 
 public Faculty getFaculty()
 {
     return this.faculty;
 }
 public void setFaculty(Faculty faculty)
 {
     this.faculty = faculty;
	 switch(this.faculty){
		 case TUB: this.campus=Campus.KLE;
			 break;
			 case LS: this.campus=Campus.KLE;
			 break;
			 case GO: this.campus=Campus.KLE;
			 break;
			 case KU: this.campus=Campus.KL;
			 break;
	 }
		 
 }
 public void setPhone(int phone)
 {
    if (phone > 99 & phone < 10000){this.phone=phone;}
	 
	 else{System.out.println("invalid number");}
 }
 
 public String getPhone()
 {
     String PhoneNumber= new String();
	switch(campus){
		case KLE:PhoneNumber="+49282180673"+ Integer.toString(phone);
			break;
			case KL:PhoneNumber="+492842908"+ Integer.toString(phone);
			break;
			}
	 return PhoneNumber;
 }
 public String getFacultyString()
 {
    String FacultyString=new String();
	 switch(this.faculty){

		 case TUB:
			 FacultyString="Technology and Bionics";
			 break;
	
		 case LS:
			 FacultyString="Life Sciences";
			 break;
		
	
		 case GO:
			 FacultyString="Society and Economics";
			 break;
	
		case KU :
			 FacultyString="Communication and Environment";
			 break;
	 }
	 return FacultyString;
 }
	
	
	
	
}
