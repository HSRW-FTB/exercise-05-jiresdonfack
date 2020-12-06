    // Implement your Student class here

public class Student {

      
    import java.util.Date;

public class Student extends User{	
    
	   // private int id;
	    private static int idGen =10000;
	  //  private String lastname, firstname;
	     private Course studycourse;


	    
	    public Student()
	    {
	        super();
	    }

	    
	    public Student(String firstname, String lastname)
	    {
	        super(Integer.toString(idGen),Domain.STUDENT,firstname,lastname);
		    idGen++;
	       
	        
	    }
	    

	    public Student(String firstname, String lastname, Date birthdate)
	    {
	        super(Integer.toString(idGen),Domain.STUDENT,firstname,lastname,birthdate);
		    idGen++;
	        
	    }

	     public Course getStudyCourse() {
	    return studycourse;
	    }
	

	    public String getStudyCourseDescription()
	    {
	        String[] array1= {"ME", "MSE", "EL", "IE", "BMS", "SCB", "MME", "MBB"};

	        String[] array2= {"Mechanical Engineering, B.Sc.", "Mechatronic Systems Engineering, B.Sc.", 
	                      "Electrical and Electronics Engineering, B.Sc.", "Industrial Engineering, B.Sc.", "Biomaterials Science, B.Sc.", "Science Communicatiob and Bionics, B.Sc.", "Mechanical Engineering, M.Sc.", "Bionics/Biomaterial, M.Sc"};


	        int c=0, i;


	        for(i=0; i<7; i++)
	{
	            if(array1[i] == studycourse.name())
	{
	                c=i;
	}
	}


	                return array2[c];
	    }
	    


	    public void setStudyCourse(Course course1)
	    {
	        this.studycourse = course1;
	    }


	    
	    public void setStudyCourse(String course2)
	    {
	        this.studycourse = Course.valueOf(course2);
	    }
	    


	}


}

