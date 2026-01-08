// Last updated: 1/8/2026, 11:55:36 PM
1class Solution {
2  public int myAtoi(String str) {
3    
4    final int len = str.length();
5    
6    if (len == 0){
7        return 0;
8    }
9    
10    int index = 0;
11    
12    // skipping white spaces
13    while (index < len && str.charAt(index) == ' '){
14        ++index;
15    }
16    
17    boolean isNegative = false;
18    
19    // to handle sign cases
20    if (index < len) {
21      
22      if (str.charAt(index) == '-') {
23        isNegative = true;
24        ++index;
25      } else if (str.charAt(index) == '+'){
26          ++index;
27      }
28      
29    }
30    
31    int result = 0;
32    
33    // converting digit(in character form) to integer form
34    // iterate until non-digit character is not found or we can say iterate till found character is a digit
35    while (index < len && isDigit(str.charAt(index))) {
36      
37      /* str.charAt(index) - '0' is to convert the char digit into int digit eg: '5' - '0' --> 5
38      or else it will store the ASCII value of 5 i.e. 53,
39      so we do 53(ASCII of 5) - 48(ASCII of 0(zero)) to get 5 as int*/
40      int digit = str.charAt(index) - '0';
41      
42      // to avoid integer overflow
43      if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
44          return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
45      }
46      
47      // adding digits at their desired place-value
48      result = (result * 10) + digit;
49      
50      ++index;
51    }
52      
53    return isNegative ? -result : result;
54  }
55  
56  private boolean isDigit(char ch) {
57    return ch >= '0' && ch <= '9';
58  }
59}