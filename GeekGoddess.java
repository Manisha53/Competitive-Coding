 Save the City (100 Marks)

The City of Wonderland is under attack by an unknown virus. There are twenty six types of people who reside in the city of Wonderland i.e every person in the city belongs to any one of the types from a - z.

Many people have got infected by the virus and are fighting for their lives. Scientists have studied the virus and its impact on different types of people. After their study, they found that the virus is unable to cause damage to any of the people who belong to the type which are maximum in the city.

For example - If in the city, the maximum people belong to the type b, then all b types of people will be safe from the virus.

Scientists want to know the type for which the people are maximum so that they can safeguard them and also develop vaccination as an antidote to the virus which will provide immunity to other people. They are short of time and therefore need your help in determining the type for which the people are maximum in the city. 


Note: If there are more than one type of people with equal maximum then the type with lesser ASCII value will be considered.


Can you help the Scientists in saving the city ?


Input Format

The first line of input consists of number of test cases, T.

The second line of each test case consists of a string representing the type of each individual person in the city.


Constraints

1<= T <=10

1<= |string| <=100000



Output Format

For each test case, print the required output in a separate line.



//--------------------------------my code-------------------------------
import java.io.*;
import java.util.*;
public class CandidateCode {

public static void main(String args[] ) throws Exception {

        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        String s=in.nextLine();
        int max=0;
        int m=0;
        String res="";
        int l=s.length();
       ArrayList<String> a=new ArrayList<String>();
            for(int i=0;i<l;i++){
                String str=String.valueOf(s.charAt(i));
                a.add(str);
                }
            for(int i=0;i<l;i++){
                m=Collections.frequency(a,a.get(i));
                if(m>max){
                max=m;
                res=a.get(i);
                }
            }
            System.out.print(res);


        while(t-->0){
           String st=in.nextLine();

            int max1=0;
            int m1=0;
            String res1="";
            int l1=st.length();
             char[] string=st.toCharArray();
              Arrays.sort(string);
        for(int i=0;i<l;i++){
            System.out.print(string[i]+" ");
        }


            ArrayList<String> ar=new ArrayList<String>();
            for(int i=0;i<l1;i++){
                String str=String.valueOf(string[i]);
                ar.add(str);
                }
            for(int i=0;i<l1;i++){
                m1=Collections.frequency(ar,ar.get(i));
                if(m1>max1){
                max1=m1;
                res1=ar.get(i);
                }
            }
            for(int i=0;i<l1;i++){
                m1=Collections.frequency(ar,ar.get(i));
                if(m1>max1){
                max1=m1;
                res1=ar.get(i);
                }
            }
            System.out.print(res1);
            System.out.println();
        }

}
}

TESTCASE:
1)
INPUT:
2
gqtrawq
fnaxtyyzz
OUTPUT:
q
y

2)
INPUT:
8
abab
Apple
ABBAA
Elephant
bicycle
nahs

abzz
OUTPUT:
a
p
A
E
c
a

z


