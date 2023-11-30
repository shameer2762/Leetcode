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

class Solution {
    public String defangIPaddr(String address) {

        // Solution-1: Using replace method 

        return address.replace(".","[.]");

        // Solution-2: Using String Builder 

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

 // Other approaches from solutions

        public String defangIPaddr(String address) {
            return String.join("[.]", address.split("\\."));
        }

        public String defangIPaddr(String address) {
            return address.replaceAll("\\.", "[.]");
        }

        public String defangIPaddr(String address) {
            StringBuilder sb = new StringBuilder();
            for (char c: address.toCharArray()) {
                sb.append(c == '.' ? "[.]" : c);
            }
            return sb.toString();
         }
