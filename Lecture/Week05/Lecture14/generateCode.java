//Q3
public static void generateCode(String[] fullnames) {
	
  class NameCode {
	  private String code;
	  
	  //A constructor which takes two string as parameters and sets up the secret code. 
	  //The secret code is generated from the first letter of the two parameter strings.
	  public NameCode(String firstName, String lastName) {
		  this.code = "" + firstName.charAt(0) + lastName.charAt(0);
	  }
	  
	  public String getCode() {
		  return this.code;
	  }
  }

  ArrayListCode secret<NameCodes> = new ArrayList<NameCode>();
  for (String fullname : fullnames) {
    String[] data = fullname.split(" ");
    secretCodes.add(new NameCode(data[0], data[1]));
  }
  for (NameCode c: secretCodes)
    System.out.println(c.getCode());
 } 