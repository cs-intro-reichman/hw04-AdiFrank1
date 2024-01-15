public class ArrayOps {
    public static void main(String[] args) {

        int [] arr = {2,-3,4};
        int [] array2 = {2,1};
        int [] array1 = {1,2,1,1,2};
        System.out.println (isSorted (arr));
        System.out.println (findMissingInt (arr));
        System.out.println (secondMaxValue (arr));
        System.out.println (containsTheSameElements (array1,array2));



    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int missing = 0;
        int j=0; 
        int i=0 ;
        int n = array.length;
        boolean exist = false;

        while (j <= n) 
          {  for (i=0; i<array.length; i++ )
               {  if (array[i] == j)
                       { exist = true; }
                }

                if (exist == false)
                     { missing = j; }

                 exist=false; 
                 j++;      
              }
              
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max = array[0];
        int secondMax=0;
        int min=0;
        int count =0;

        for (int i=1;i<array.length; i++)
            {  if (array[i]>=max)
                {max= array[i];}
            }

           for (int i=1;i<array.length;i++)
            {
                if (array[i]==max)
                    count ++;
            }

            if (count > 1)
              {  return  max;}

        secondMax = array[0];

        for (int i=1;i<array.length;i++)
            {if (array[i] != max && array[i] > secondMax)

               {secondMax=array[i];}
            }

        return secondMax;
    }


    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:

        boolean isContains = false;
        int i=0;
        int j=0;
        int max= Math.max(array1.length,array2.length);
        int min= Math.min(array1.length,array2.length);

        if (array1.length > array2.length)
        {   while (i < array1.length)
              { isContains= false;
                 for (j=0;j<array2.length;j++)
               {    if (array1[i]==array2[j])
                      { isContains= true;}                    
                }

                if(isContains==false)
                   { return false;}
               else
                   { i++;}
         }
     }
        else
            if (array2.length > array1.length)
           { while (i < array2.length)
             { isContains = false;
                for (j=0;j<array1.length;j++)
               {    if (array2[i]==array1[j])
                      { isContains= true;}
                
                }

                if(isContains==false)
                  { return false;}
                else
                    i++;
            }
         }
     
                if (isContains==true)
                    return true;

                else
                    return false; 
        }
    



    public static boolean isSorted(int [] array) {

        // Write your code here:

        boolean isSorted1= true;
        boolean isSorted2= true;
        int check1 = array[0];
        for (int i=1;i<array.length;i++)
        {
            if (array[i]>check1 && isSorted1 == true)
               {check1 = array[i];
                isSorted1=true;}
            else
                isSorted1 = false;
        }

       

            int check2 = array [0];
            for (int i=1;i<array.length;i++)
                {
                    if(array[i] < check2 && isSorted2 == true)
                        {check2 = array[i];
                         isSorted2= true;}
                    else
                        isSorted2 = false;
                }
        


            if (isSorted2 == true || isSorted1 == true )
                {return  true;}
            else
                return false;

    }
}

