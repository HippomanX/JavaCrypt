
/**
 *
 * @author Alex
 * @version -1
 */
import java.util.Scanner;

public class Decryptor
{
    public Decryptor()
    {
        Scanner scanXD = new Scanner(System.in);
        System.out.print("Which message would you like to decrypt? ");
        String ciphertext = scanXD.nextLine();
        System.out.print("What is the key for the cipher? ");
        Scanner scanXD2 = new Scanner(System.in);
        char z;
        String plaintext = "";
        int x = scanXD2.nextInt();
        String gamerz = "";
        for (int riseUp = 0; riseUp < ciphertext.length(); riseUp++) {
            char xd = ciphertext.charAt(riseUp);
            ciphertext = ""; //initializes cipher
            if (xd <= 'z' && xd >= 'a') {
                //int z = (int)xd-(int)'a'+ 1;
                //char nowThatsHowGamersDoIt = (char)z;
                z = (char)(xd+x);
                if (z > 'Z') {
                    z = (char)(z - 1 +'a' + 'z');
                }
                plaintext += z;//nowThatsHowGamersDoIt;
            }
            if (xd <= 'Z' && xd >= 'A'){
                //int gamersRiseUpInTheClub = (int)xd-(int)'A'+ 1;
                //char gamer = (char)gamersRiseUpInTheClub;
                z = (char)(xd+x);
                if (z > 'Z') {
                    z = (char)(z - 1 +'A' + 'Z');
                }
                plaintext += z; //gamer;
            }
            else {
               plaintext += xd; 
            }
            gamerz = plaintext;
        }
        //please work
        System.out.println("Your encrypted text is: " + gamerz + ".");
    }

}

