import java.util.Scanner ;
import java.util.Random;
import java.util.ArrayList;

class Conversation {
/*
 * Code for a chatbot that mirror the words of the user and if the person doesnt type anything with the key words , they get a canner response
 * @param arguments The program's arguments
 */

  public static void main(String[] arguments) {

    String[] responses = {
      "That's so cool!",
      "Wow!",
      "I never thought about that.", 
      "Oh...",
      "Interesting..."};

    
    // You will start the conversation here.
    Scanner input = new Scanner(System.in);
    

    
      // Prompt user to enter number of rounds
    System.out.println("How many rounds?");
    int rounds = input.nextInt();
    input.nextLine();
    Random Rand = new Random();

    //creates transcript
    ArrayList <String> transcript = new ArrayList<String>();

    int beginGame = 0;

  System.out.println("Hi there! What's on your mind?");
    // adds greeting to transcript
	transcript.add("Hi there! What's on your mind?");

    boolean should_response_change = false;

    

    while (beginGame != rounds) {
      String user_response = input.nextLine();
      transcript.add(user_response);

      // Look for words to mirror
      String[] user_Responses = user_response.split(" ");
      should_response_change = false;

      for (int i = 0; i < user_Responses.length; i++){
        if (user_Responses[i].equals("I")){
          int position = i;
          user_Responses[position] = ("you");
          should_response_change = true;
          continue;
          
        }
        else if (user_Responses[i].equals("you")){
          int position   = i;
          user_Responses[position] = ("I");
          should_response_change = true;
          continue;
        }
        else if (user_Responses[i].equals("You")){
          int position = i;
          user_Responses[position] = ("I");
          should_response_change = true;
          continue;
        }
        else if (user_Responses[i].equals("your")){
          int position = i;
          user_Responses[position] = ("my");
          should_response_change = true;
          continue;
        }
        else if (user_Responses[i].equals("Your")){
          int position = i;
          user_Responses[position] = ("My");
          should_response_change = true;
          continue;
        }
        else if (user_Responses[i].equals("my")){
          int position = i;
          user_Responses[position] = ("your");
          should_response_change = true;
          continue;
        }
        else if (user_Responses[i].equals("My")){
          int position = i;
          user_Responses[position] = ("Your");
          should_response_change = true;
          continue;
        }
        else if (user_Responses[i].equals("are")){
          int position = i;
          user_Responses[position] = ("am");
          should_response_change = true;
          continue;
        }
        else if (user_Responses[i].equals("Are")){
          int position = i;
          user_Responses[position] = ("Am");
          should_response_change = true;
          continue;
        }
      }
    if (should_response_change == true) {
      String mirror_response = String.join(" ", user_Responses);
      System.out.println(mirror_response + "?");
      transcript.add(mirror_response + "?");
    }

    else {
      int index = Rand.nextInt(responses.length);
      //String random_canned_response = canned_responses[index]; 
      System.out.println(responses[index]);
      transcript.add(responses[index]);
    }
    
    beginGame = rounds + 1;
  }
    System.out.println("See ya!");
    transcript.add("See ya!");
    System.out.println("");
    System.out.println("Transcript:");
    System.out.println(transcript);
    input.close();
     
} 
}

