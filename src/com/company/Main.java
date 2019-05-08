package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Raven should start by asking,
    //"Good morning, how are you feeling today?"
    //(or any other emo equivalent)
    //
    //She should then scan the user's reply for a match on feeling words, which you need to preset when you design Raven. You would neeed to scan for both sets of feeling words.
    //
    //Feeling words can be stored in an array or arraylist:
    //String [ ] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};
    //
    //String [ ] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};
    //
    //Depending on the number of matches, if there are more positive words then negative ones, Raven will reply as you imagine an emo person may reply,
    //"I am so happy for you...Yay..."
    //
    //But if she picks up on your bad day, Raven will be delighted and say something like,
    //"Really! Why, tell me more!"
    //
    //If the number of positive and the number negative words cancel each other out, she can simply say,
    //"Meh."
    //
    //Give the user the option to continue talking with Raven until they decided they've had enough of Raven, and press "Q" to quit. Then display the chat history once the session is over.
    //DO this using OOP.
    //Make Raven your own and get creative!

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> positive = new ArrayList<>();
        positive.add("good");
        positive.add("glad");
        positive.add("happy");
        positive.add("relaxed");
        positive.add("accomplished");
        positive.add("moody");
        positive.add("afraid");

        ArrayList<String> negative = new ArrayList<>();
        negative.add("bad");
        negative.add("sad");
        negative.add("tired");
        negative.add("angry");
        negative.add("hungry");
        negative.add("moody");
        negative.add("anxious");

        Invoice invoice = new Invoice();


        ArrayList<String> historyList = new ArrayList<>();
        String happyAns = "I am so happy for you...Yay...";
        String sadAnsw = "Really! Why, tell me more!";
        String okayAns = "Meh.";


        while(true){
            System.out.println("Good morning, how are you feeling today?");
            String ans = input.nextLine();
            historyList.add(ans);
            String[] splitWord = ans.split(" ");
            int count=0;
            int nCount=0;


            if(ans.equalsIgnoreCase("q")){
                System.out.println("Have a good day!");
                historyList.add("Have a good day!\n");
                break;
            }


            for (int i = 0; i < splitWord.length; i++) {
                //looking through positive arraylist
                for (int j = 0; j < positive.size(); j++) {
                    if (splitWord[i].equalsIgnoreCase(positive.get(j))) {
                        count++;
                    }
                    //look through negative arraylist
                    else if (splitWord[i].equalsIgnoreCase(negative.get(j))) {
                        nCount++;
                    }
                }

            }
            //Compare between positive and negative
            if (count > nCount) {
                System.out.println(happyAns);
                historyList.add(happyAns+"\n");

            } else if (count < nCount) {
                System.out.println(sadAnsw);
                historyList.add(sadAnsw+"\n");
            } else if (count == nCount) {
                System.out.println(okayAns);
                historyList.add(okayAns+"\n");
            }

        }
        invoice.inputUser();
        invoice.displayInvoice(historyList.size());
        System.out.println(historyList+"\n");

    }
}

