package com.stackroute;
/*Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
Condition:
    a. Print an error message if the input is not a letter
    b. If the input having more than one letter, print the required output
          (Vowel or Consonant) for each letter*/


 class VowelAndConsonants {
    String checkVowelAndConsonants(char ch)
    {
        int i;
        if(!Character.toString(ch).matches ("[a-zA-Z]"))
        {
            System.out.println("Error! Input provided is not alphabet");
        }
        else
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                return "vowel";
            }
            else
            {
                return "consonant";
            }
        }
        return "invalid";
    }
    String printVowelConsonants(String word) {
        int i;
        String str=" ";
        for (i = 0; i < word.length(); i++) {
           str =word.charAt(i) + "-" + checkVowelAndConsonants(word.charAt(i));
        }return str;
    }

}
