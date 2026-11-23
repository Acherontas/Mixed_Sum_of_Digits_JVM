/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mixed_sum_jvm;
import java.math.BigInteger;
import java.util.Scanner;
import da_sums.smz;
import da_nine.ninz;
/**
 *
 * @author acherontas
 */
public class Mixed_Sum_JVM {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //we assume that a number eg 2785==2+7+8+5==22
        //and 22==2+2=4
        //we use this method twice
        BigInteger bi;
        Scanner console=new Scanner(System.in);
        System.out.println("Enter a number");
        bi=console.nextBigInteger();
        ninz nn=new ninz();
        String mls=nn.create_da_nines(bi.toString());
        BigInteger br;
        BigInteger mr=new BigInteger(mls);
        br=mr.subtract(bi);
        System.out.println("using " + mr + " - " + bi + " = " + br);
        smz sz=new smz();
        int mri=sz.get_the_sum(br.toString(),0);
        System.out.println("sum of digits of number " + br + " are " + mri);
        nn.d_nine=new String();
        String irm=nn.create_da_nines(Integer.toString(mri));
        BigInteger bbr;
        BigInteger mmr=new BigInteger(irm);
        bbr=mmr.subtract(BigInteger.valueOf(mri));
        System.out.println("using " +mmr + " - " + mri +  " = " + bbr);       
        int mry=sz.get_the_sum(bbr.toString(),1);
        System.out.println("using " + bbr + " for sum of digits " + mry);
        int mrk=sz.get_the_sum(bi.toString(),1);
        System.out.println("using main number " + bi + " for sum of digits " + mrk);
        if(mry==mrk){System.out.println("Matches");}
        if(mry!=mrk){System.out.println("No match found");}
    }   
}
