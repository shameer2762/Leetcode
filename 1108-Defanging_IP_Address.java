// Given a valid (IPv4) IP address, return a defanged version of that IP address.

// A defanged IP address replaces every period "." with "[.]".

 

// Example 1:

// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
// Example 2:

// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"
 

// Constraints:

// The given address is a valid IPv4 address.


// # Solution


     // Solution-1: Using replace method 

class Solution {
    public String defangIPaddr(String address) {
       
        return address.replace(".","[.]");
    }
}

    // Solution-2: Using the String Builder method O(n2)

class Solution {
    public String defangIPaddr(String address) {
     
        StringBuilder defangedAddress = new StringBuilder();  // declare String builder to hold defanged IP Address
        for(int i = 0; i < address.length(); i++){  // Iterate over address String
            char ch = address.charAt(i);            // get character at particular index
            if(ch == '.'){                          // check whether character is '.'
                defangedAddress.append("[.]");      // if true Append [.] 
            }else{
                defangedAddress.append(ch);         // if false append character
            }
        }
        return defangedAddress.toString();          //  return String using toString() method
    }
}

// Solution-3: using String join & Split methods
class Solution {
    public String defangIPaddr(String address) {
            return String.join("[.]", address.split("\\."));
    }
}

// Solution-4: Using replaceAll method
class Solution {
     public String defangIPaddr(String address) {
            return address.replaceAll("\\.", "[.]");
    }
}

// solution-5: using String builder with O(n)
class Solution {
    public String defangIPaddr(String address) {
         StringBuilder sb = new StringBuilder();
         for (char c: address.toCharArray()) {
              sb.append(c == '.' ? "[.]" : c);
         }
         return sb.toString();
    }
}


        

       

        
