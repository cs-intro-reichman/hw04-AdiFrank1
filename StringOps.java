public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
        String string = "   Intro to coMPUter sCIEncE ";
        char chr = 'l';
        System.out.println(capVowelsLowRest(string));
        System.out.println(camelCase(string));
        int [] array1= allIndexOf(string,chr);
        int i=0;
        for (i=0;i<=array1.length;i++)
           {  System.out.println(array1[i]);}


    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String ans = " ";
        int i=0;
        while (i < string.length())

          {   char ch = string.charAt(i);

            if ((ch == ' ') || (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85))
                {ans = ans + ch;}
               
            else
                if  ((ch > 65) && (ch<=90) && (ch !=69 || ch != 73 || ch != 79 || ch != 85))
                    {ans = ans + (char) (string.charAt(i)+32);}
                else

                    if ((ch >90 && ch <=122) && (ch == 117 || ch == 111 || ch == 105 || ch==101 || ch ==97))
                        {ans = ans + (char) (string.charAt(i)-32) ;}
                    else
                        {ans = ans + ch;}


            i++;

        }
               return ans;
  }

    public static String camelCase (String string) {
        // Write your code here:
    
         String ans = " ";
            int i=0;
            int j=0;
            int strlength = string.length();

            while (string.charAt(i) == ' ')
            {
                i++;
            }


           
            while (string.charAt(i)!= ' ' &&  i < string.length()-1)

            {
                if (string.charAt(i) > 96 && string.charAt(i) < 123)
                {
                    ans = ans + string.charAt(i);
                }
                else
                {
                    ans = ans + (char)(string.charAt(i) + 32);
                }

                i++;
            }


            for ( j = i; j< string.length(); j++)
            {

                if ((string.charAt(j) != ' ') && (string.charAt(j-1) == ' '))
                {
                    if ((string.charAt(j) > 96) && (string.charAt(j) < 123))
                     {ans = ans + (char)(string.charAt(j) - 32);}
                    else
                        {ans = ans + string.charAt(j);}
                }
                else

                {  if ((string.charAt(j) != ' ') && (string.charAt(j-1) != ' '))
                
                  {  if ((string.charAt(j) > 64) && (string.charAt(j) < 91))
                    {
                        ans = ans + (char)(string.charAt(j) + 32);
                    }
                    else
                    {
                        ans = ans + string.charAt(j);
                    }
                    
                }
            }

            }



            return ans;
        }


    public static int[] allIndexOf (String string, char chr) {

    // Write your code here:

        int i=0;
        int count =0;
        for (i=0;i<string.length(); i++)
        {
            char ch = string.charAt(i);
                if (ch == chr)
                    count++;
        }

        int [] array = new int [count];
        int j=0;

        while (i<string.length())
         { for (j=0;j<count;j++)
            {char ch = string.charAt(i);
               { if (ch == chr)
                array[j] = i;
               }
            }

             i++;     
        
        }

        return array;
    
}
}

