import java.util.Date;

public class User {
	
	private String id;
	private String lastname;
	private String firstname;
	private Date birthdate;
	private Domain domain;
	
	 protected User() {}
	  
	  protected User(String id,Domain domain,String firstname, String lastname)
	    {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.domain=domain;
	        this.id= id;     
	    }
	 
	  protected User(String id,Domain domain,String firstname, String lastname,Date birthdate)
	    {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.birthdate = birthdate;
	        this.domain=domain;
	        this.id= id;    
	    }
	  
	  public String getFirstName()
	    {
	        return firstname;
	    }

	    
	    public void setFirstName(String first)
	    {
	        this.firstname = first;
	    }

	    
	    public String getLastName()
	    {
	        return lastname;
	    }
	    

	    public void setLastName(String last)
	    {
	        this.lastname = last;
	    }
	    

	    public String getID()
	    {
	        return id;
	    }
	    
	    public Date getBirthDate()
	    {
	        return birthdate;
	    }
	    

	    public void setBirthDate(Date date)
	    {
	        this.birthdate = date;
	    }
	    
	        public Domain getDomain() {
		    return this.domain;
		   }
	    public String getFQUN() {
	    	String Username=this.id+"@"+(this.domain.name()).toLowerCase()+"hsrw";
			return Username;
	    }
}
