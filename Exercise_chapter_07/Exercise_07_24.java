/*
  Coupon collector is a classic statistics problem with many practical
  applications. The problem is to pick objects from a set of objects
  repeatedly and find out how many picks are needed for all the objects to be
  picked at least once. A variation of the problem is to pick cards from a
  shuffled deck of 52 cards repeatedly and find out how many picks are needed
  before you see one of each suit. Assume a picked card is placed back in the
  deck before picking another. Write a program to simulate the number of picks
  needed to get four cards from each suit and display the four cards picked
  (it is possible a card may be picked twice).
*/
public class Exercise_07_24 {
    public static void main(String[] args){
      //Initialize a deck of 52 cards
      int[] deck = new int[52];
      int[] picks = new int[4];
      String[] suits = {"Spades", " Hearts", "Diamonds", "Clubs"};
      String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                        "10", "Jack", "Queen", "King"};
      //Initialize the cards
      assignCards(deck);

      //Shuffle the deck
      shuffle(deck);

      int count = count(deck, picks);
      if(count != -1){
        for(int i = 0; i < picks.length; ++i){
          String suit = suits[picks[i] / 13];
          String rank = ranks[picks[i] % 13];
          System.out.println(rank + " of " + suit);
        }
        System.out.println("Number of picks: " + count);
      } else {
        System.out.println("Error!!!");
      }
    }

    //Method to shuffle the deck
    public static void shuffle(int[] deck){
      for(int i = 0; i < deck.length; ++i){
        int temp = deck[i];
        int randomIndex = (int)(Math.random() * deck.length);
        deck[i] = deck[randomIndex];
        deck[randomIndex] = temp;
      }
    }
    //Method to assign value to deck
    public static void assignCards(int[] deck){
      for(int i = 0; i < deck.length; ++i){
        deck[i] = i;
      }
    }
    //Method to pick a card randomly
    public static int pickCard(int[] deck){
      return (int)(Math.random() * deck.length);
    }
    //Method to pick cards until getting 4 different suits
    public static int count(int[] deck, int[] picks){
      picks[0] = pickCard(deck);
      int count = 1;
      
      for(int i = 1; i < 48; ++i){
        int a = pickCard(deck);
        if(a == 0 && count == 1 && a/13 != picks[0]/13){
          picks[1] = a;
          count++;
        }

        if(a != 0 && count == 1 && a/13 != picks[0]/13){
          picks[1] = a;
          count++;
        }

        if(a == 0 && count == 2 && a/13 != picks[0]/13 && a/13 != picks[1]/13){
          picks[2] = a;
          count++;
        }

        if(a != 0 && count == 2 && a/13 != picks[0]/13 && a/13 != picks[1]/13){
          picks[2] = a;
          count++;
        }

        if(a == 0 && count == 3 && a/13 != picks[0]/13 && a/13 != picks[1]/13 && a/13 != picks[2]/13){
          picks[3] = a;
          return i + 1;
        }

        if(a != 0 && count == 3 && a/13 != picks[0]/13 && a/13 != picks[1]/13 && a/13 != picks[2]/13){
          picks[3] = a;
          return i + 1;
        }
      }
      return -1;
    }
}