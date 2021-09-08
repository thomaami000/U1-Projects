import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MadLib {

    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);
        String person1;
        String adj;
        String verb1;
        String bodyPart;
        int num;
        String noun;
        String adv;
        String verb2;
        String pluralPronoun;
        String person2;

        System.out.println("Name someone in the room: ");
            person1 = read.next();
        System.out.println("Enter an adjective: ");
            adj = read.next();
        System.out.println("Enter a verb: ");
            verb1 = read.next();
        System.out.println("Enter a body part: ");
            bodyPart = read.next();
        System.out.println("Enter a number: ");
            num = read.nextInt();
        System.out.println("Enter a noun: ");
            noun = read.next();
        System.out.println("Enter an adverb: ");
            adv = read.next();
        System.out.println("Enter another verb: ");
            verb2 = read.next();
        System.out.println("Enter a pronoun (PLURAL): ");
            pluralPronoun = read.next();
        System.out.println("Name someone different in the room: ");
            person2 = read.next();

        System.out.println("Dear " + person1 + ",");
          System.out.println("You are extremly " + adj + " and I " + verb1 + " you! I want kiss your " + bodyPart + " " + num + " times. You make my " + noun + " with desire. When I first saw you, I " + adv + " stared at you and fell in love. Will you " + verb2 + " out with me? Don`t let your parents discourage you, " +  pluralPronoun + " are just jealous." );
    }
}