# RadioStationException

 Java class called RadioStationException  extends Exception. 
 RadioStationException  have a constructor that receives a radio station's call sign (for example, WJRR) and carrier frequency (for example, 101.1).

The second class named RadioStation that has the same fields and whose constructor requires values for both fields. 
Upon construction of a RadioStation object, code throws a RadioStationException if the call sign does not consist of four letters 
or if the carrier frequency is not between 88 and 108 inclusive. 

Application  creates an array of at least six RadioStation objects by asking the user to input call signs and carrier frequencies. 
Appropriate message disokays when a RadioStation object is created successfully and also when one is not. 
