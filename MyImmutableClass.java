package immutable_class;
//The class must be declared as final so 
//that child classes can’t be created.

//Data members in the class must be declared 
//private so that direct access is not allowed.

//Data members in the class must be declared as 
//final so that we can’t change the value of it 
//after object creation.

//A parameterized constructor should initialize all
//the fields performing a deep copy so that data members 
//can’t be modified with an object reference.

//Deep Copy of objects should be performed in the getter
//methods to return a copy rather than returning the 
//actual object reference)

public final class MyImmutableClass {
	// Member attributes of final class
    private final String name;
    private final int regNo;
    
    public MyImmutableClass(String name, int regNo) {
    	 // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;
    }
    
    // Method 1
    public String getName() { return name; }
 
    // Method 2
    public int getRegNo() { return regNo; }
   
    // Note that there should not be any setters
 
}
