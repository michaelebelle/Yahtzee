
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Yahtzee 
{
    public static void main(String[] args)
    {
        
        boolean play = true;

        Scanner keyboard = new Scanner(System.in);

        String name = "";

        char choice;

        int total = 0;

        int categories = 13; 
        
        ScoreInterface[] scores = new ScoreInterface[13];

        scores[0] = new UpperSectionScore(" Ones", 1);

        scores[1] = new UpperSectionScore(" Twos", 2);

        scores[2] = new UpperSectionScore("Threes", 3);

        scores[3] = new UpperSectionScore(" Fours", 4);

        scores[4] = new UpperSectionScore(" Fives", 5);

        scores[5] = new UpperSectionScore(" Sixes", 6);

        scores[6] = new OfAKind("Three of a Kind", 3);

        scores[7] = new OfAKind(" Four of a Kind", 4);

        scores[8] = new FullHouse(" Full House");

        scores[9] = new Straight(" Small Straight", 4);

        scores[10] = new Straight(" Large Straight", 5);

        scores[11] = new Chance(" Chance");

        scores[12] = new OfAKind(" Yahtzee", 5);
        
        DieInterface[] dice = new DieInterface[5];
        for(int i = 0; i < 5; i++)
        {
            dice[i] = new Die();
        }
        
        while (play)
        {
            
            System.out.print("Wanna play Yahtzee???? (y/n): ");

            choice = keyboard.nextLine().charAt(0);
            
            
            if (choice == 'N' || choice == 'n')
            {
                play = false;

                continue;
            }
            else if (choice == 'y' || choice == 'Y')
            {
                System.out.print(" Enter your name: ");
                name = keyboard.nextLine();
            	}	
            
    
            printYahtzeeCard(name,scores,total);
    
            System.out.println("Your First Roll: ");

            rollDice(dice);
            
          
            System.out.print("Enter the list of dice you wanna keep: ");

            String sIndices = keyboard.nextLine();

            String[] keep = sIndices.split(" ");
            

            
            System.out.println("Your Second Roll!: ");

            rollKeepIndices(keep,dice);
            
            
            System.out.print("Please enter the list of dice that you want to keep: ");

            sIndices = keyboard.nextLine();

            keep = sIndices.split(" ");
            
           
            System.out.println("Your Third Roll!: ");
            
            rollKeepIndices(keep,dice);




            
            
            int newScore = showPossibleScores(scores, dice,categories, keyboard);

            total = total + newScore; 

            categories--; 

            printYahtzeeCard(name,scores,total);
            
            
            while (unusedCategoriesExist(scores))
            {
              
                System.out.println("Your First Roll: ");
                rollDice(dice);
                
              
                System.out.print("Please enter the list of dice that you want to keep: ");
                sIndices = keyboard.nextLine();
                keep = sIndices.split(" ");
                
                
                System.out.println("Your Second Roll: ");
                rollKeepIndices(keep,dice);
                
                
                System.out.print("Please enter the list of dice that you want to keep: ");
                sIndices = keyboard.nextLine();
                keep = sIndices.split(" ");
                
                
                System.out.println("Your Third Roll: ");
                rollKeepIndices(keep,dice);
                
                newScore = showPossibleScores(scores, dice,categories, keyboard);
                total = total + newScore; 
                categories--; 
                if (categories == 0)
                {
                    System.out.println("Your final score: ");
                }
                printYahtzeeCard(name,scores,total);
            }
            
           
            resetAll(scores);
            total = 0;


            
        }
        
        System.out.println("Thanks");
        
    }   

    
 
    private static void getCategory(int categoriesLeft )
    {
        System.out.print("Which category would you like to use? (1 - " + categoriesLeft + ") : ");
        

        
    }
  
    private static void resetAll(ScoreInterface[] scores)
    {
        for(int i = 0; i < scores.length; i++)
        {
            scores[i].reset();


        }
    }
    
   
    private static int showPossibleScores(ScoreInterface[] score, DieInterface[] dice, 
            int categories, Scanner keyboard)
    {
        ArrayList<ScoreInterface> categoriesRemaining = new ArrayList<ScoreInterface>();


        System.out.println("Here are your scores: ");

        int in = 1; 
        for (int i = 0; i < score.length; i++)
        {
            if(!(score[i].isUsed()))
            {
                System.out.println(String.format(in + "%17s:%3d" , 
                        score[i].getName(), score[i].getDiceScore(dice) ));
                categoriesRemaining.add(score[i]);
                

                in++;
            }
            
        }
        
        System.out.print("Which category do you wanna use?? (1 - " + categories + ") : ");
        
        String cat = keyboard.nextLine();

        int category = Integer.parseInt(cat);

        categoriesRemaining.get(category-1).setScore(dice);
        return categoriesRemaining.get(category-1).getScore();
    }

    
  
    private static boolean unusedCategoriesExist(ScoreInterface[] scores)
    {
        
        for(int i = 0; i < scores.length; i++)
        {

            if(!(scores[i].isUsed()))
            {
                return true; 
            }
            
        }
        
        return false; 
        
    }
    
  
    private static void rollKeepIndices(String[] keepIndices, DieInterface[] dice)
    {
        for (int i = 0; i < 5; i++)
        {
            if (!keepthis(i+1, keepIndices))
            {
               
                dice[i].roll();
            }
        }
        System.out.println(DieInterface.toDiceString(dice));
        
    }
    
    
    private static void rollDice(DieInterface[] dice)
    {
        for(int i = 0; i < 5; i++)
            dice[i].roll();
        System.out.println(DieInterface.toDiceString(dice));
        
    }
    
    private static String game(ScoreInterface object)
    {
        if (object.getScore() == 0 && !object.isUsed())
        {
            return "___";

        }else if (object.getScore() == 0 && object.isUsed())
        {

            return "0";

        }else

        {
            return Integer.toString(object.getScore());
        }
    }

    private static void printYahtzeeCard(String userName, ScoreInterface[] scores, int total)
    {
        System.out.println("+----------------------+");


        System.out.println(String.format("|%22s|", " Name: " + userName));


        
        for(int i = 0; i < scores.length; i++)
        {


            System.out.println(String.format("|%16s:%5s|" , 
                        scores[i].getName(), game(scores[i])));


        }
        
        System.out.println("|----------------------|");

        System.out.println(String.format("|%13s:%8d|", "Total", total));

        System.out.println("| ==================== |");

        System.out.println("+----------------------+");
    }
    private static boolean keepthis(int i, String[] indices)
    {
        
        for(int j = 0; j < indices.length; j++)
        {
            if (Integer.toString(i).equals(indices[j]))
            {
                return true;
            }
        }
        
        return false;
    }
  
    

    
    
}
