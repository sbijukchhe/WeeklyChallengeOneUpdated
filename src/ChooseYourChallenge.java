/*
Make a "Choose Your Own Adventure" game. It should feature at least 5  options after the first level prompts,
at least two options for each of the second-level prompts, at least two options for each of the third-level prompts,
 and add at least two options for two of the fourth-level prompts for a total of a minimum of twenty two possible
  destinations.  If you finish please add more options to the first level and follow the same structure.

Once they reach the end of the decision tree, tell the user whether they survived or not. For example, in the first
sample output below,

You die of starvation... eventually
statement informs the user that they did not survive the game.
 */


import java.util.Scanner;

public class ChooseYourChallenge {

    public static void main(String[] args) {

        String firstLevPrompt;
        String secondLevPrompt;
        String thirdLevPrompt;
        String fourthLevPrompt;

        System.out.println("***********************************************************************");
        System.out.println();
        System.out.println("Please choose where you would like to go");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Kitchen    Upstairs    Patio    Living Room    Basement    Backyard");
        System.out.println();
        System.out.println("***********************************************************************");

        Scanner input = new Scanner(System.in);
        firstLevPrompt = input.nextLine();

        while(!firstLevPrompt.toLowerCase().equalsIgnoreCase("quit")){
            switch(firstLevPrompt.toLowerCase()){

                // First option
                case "kitchen":
                    System.out.println("Do you want to \"Open Refrigerator\" or \"Open Cabinet\" ? ");
                    secondLevPrompt = input.nextLine();
                    switch(secondLevPrompt.toLowerCase()){
                        case "open refrigerator" :
                            System.out.println("Inside refrigerator, you can see milk and food. Do you want to drink \"Drink strange milk\" or \"Eat leftovers\" ? ");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "drink strange milk" :
                                    System.out.println("It's strange");
                                    break;

                                case "eat leftovers" :
                                    System.out.println("How does this left over food taste?");
                                    break;
                            }

                            break;

                        case "open cabinet" :
                            System.out.println("Do you want to \"Eat can of beans\" or \"Take a plate\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()) {
                                case "eat can of beans":
                                    System.out.println("Enjoy your beans");
                                    break;

                                case "take a plate":
                                    System.out.println("Take your nice plate");
                                    break;
                            }
                            break;

                    }
                    break;


                // Second option
                case "upstairs":
                    System.out.println("Do you want to go to \"Bedroom\" or \"Bathroom\" ?");
                    secondLevPrompt = input.nextLine();
                    switch (secondLevPrompt.toLowerCase()){
                        case "bedroom":
                            System.out.println("Do you want to \"Lay on bed\"or \"Open the drawer\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "lay on bed":
                                    System.out.println("Ok Take some rest");
                                    break;
                                case "open the drawer":
                                    System.out.println("Why drawer??");
                                    break;
                            }
                            break;

                        case "bathroom":
                            System.out.println("Do you want to \"Look in mirror\" or \"Use the toilet\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "look in mirror":
                                    System.out.println("It is a nice mirror");
                                    break;
                                case "use the toilet":
                                    System.out.println("Clean after use");
                                    break;
                            }
                            break;
                    }
                    break;


                // Third option
                case "patio":
                    System.out.println("Do you want to \"Go to the pool\" or \"Open shade\" ?");
                    secondLevPrompt = input.nextLine();
                    switch (secondLevPrompt.toLowerCase()){
                        case "go to the pool":
                            System.out.println("Do you want to \"Clean the pool\" or \"Swim in the pool\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "clean the pool":
                                    System.out.println("Thank you ...It really needs to be cleaned");
                                    break;
                                case "swim in the pool":
                                    System.out.println("Enjoy swimming");
                                    break;
                            }
                            break;

                        case "open shade":
                            System.out.println("Do you want to \"Take an ax\" or \"Take a hammer\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "take an ax":
                                    System.out.println("Do you want to \"Chop a tree\" or \"Throw the ax\" ?");
                                    fourthLevPrompt = input.nextLine();
                                    switch (fourthLevPrompt.toLowerCase()){
                                        case "chop a tree":
                                            System.out.println("Be careful while chopping");
                                            break;
                                        case "throw the ax":
                                            System.out.println("Please don't throw the ax...");
                                            break;
                                    }
                                    break;
                                case "take a hammer":
                                    System.out.println("What do you want to do with a hammer? \"Hammer a nail\" or \"Break the hammer\" ?");
                                    fourthLevPrompt = input.nextLine();
                                    switch (fourthLevPrompt.toLowerCase()){
                                        case "hammer a nail":
                                            System.out.println("Be careful while hammering a nail");
                                            break;
                                        case "break the hammer":
                                            System.out.println("Please don't break the hammer...");
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }

                    break;


                // Fourth option
                case "living room":
                    System.out.println("Do you want to \"Turn on the TV\" or \"Sit on the couch\" ?");
                    secondLevPrompt = input.nextLine();
                    switch (secondLevPrompt.toLowerCase()){
                        case "turn on the tv":
                            System.out.println("Do you want to \"Change the channel\" or \"Stay on the first channel\"?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "change the channel":
                                    System.out.println("Do you want to \"Increase the volume\" or \"Decrease the volume\" ?");
                                    fourthLevPrompt = input.nextLine();
                                    switch (fourthLevPrompt.toLowerCase()){
                                        case "increase the volume":
                                            System.out.println("Please don't increase the volume. It is alrady too loud.");
                                            break;
                                        case "decrease the volume":
                                            System.out.println("That's a great idea.");
                                            break;
                                    }
                                    break;

                                case "stay on the first channel":
                                    System.out.println("Do you want to \"Go open the door\" or \"Ignore the door\" ?");
                                    fourthLevPrompt = input.nextLine();
                                    switch (fourthLevPrompt.toLowerCase()){
                                        case "go open the door":
                                            System.out.println("Thanks for opening the door");
                                            break;
                                        case "ignore the door":
                                            System.out.println("Please don't igonre the door");
                                            break;
                                    }
                                    break;
                            }
                            break;

                        case "sit on the couch":
                            System.out.println("Do you want to \"Look out the window\" or \"Start to eat\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "look out the window":
                                    System.out.println("It is a nice weather outside...");
                                    break;
                                case "start to eat":
                                    System.out.println("You look so hungry......");
                                    break;
                            }
                            break;
                    }
                    break;


                // Fifth option
                case "basement":
                    System.out.println("Do you want to \"Turn on the lights\" or \"Walk in the dark\" ?");
                    secondLevPrompt = input.nextLine();
                    switch (secondLevPrompt.toLowerCase()){
                        case "turn on the lights":
                            System.out.println("Do you want to \"Turn the laundry on\" or \"Turn the lights off\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "turn the laundry on":
                                    System.out.println("Thanks for turning the laundry on");
                                    break;
                                case "turn the lights off":
                                    System.out.println("Please don't turn off the lights");
                                    break;
                            }
                            break;

                        case "walk in the dark":
                            System.out.println("Do you want to \"Open a chest\" or \"Open a closet\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "open a chest":
                                    System.out.println("Please don't open the chest");
                                    break;
                                case "open a closet":
                                    System.out.println("Close it after you open the closet...");
                                    break;
                            }
                            break;
                    }
                    break;


                // Sixth option
                case "backyard":
                    System.out.println("Do you want to \"Play\" or \"Take rest\" ?");
                    secondLevPrompt = input.nextLine();
                    switch (secondLevPrompt.toLowerCase()){
                        case "play":
                            System.out.println("Do you want to \"Play alone\" or \"Play with friends\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "play alone":
                                    System.out.println("Enjoy your game");
                                    break;
                                case "play with friends":
                                    System.out.println("Call your friends");
                                    break;
                            }
                            break;

                        case "take rest":
                            System.out.println("Do you want to \"Walk around\" or \"Lay down\" ?");
                            thirdLevPrompt = input.nextLine();
                            switch (thirdLevPrompt.toLowerCase()){
                                case "walk around":
                                    System.out.println("Enjoy the weather");
                                    break;
                                case "lay down":
                                    System.out.println("Don't sleep");
                                    break;
                            }
                            break;
                    }
                    break;

                default:
                    System.out.println("\n###### Sorry. You must choose only from the options provided. ######");

            }
            System.out.println();
            System.out.println("\n-------------------------------------------------------------------");
            System.out.println("Please type \"Quit\" to quit.");
            System.out.println("Or, you can choose again where you would like to go");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Kitchen    Upstairs    Patio    Living Room    Basement    Backyard");
            System.out.println("--------------------------------------------------------------------");
            firstLevPrompt = input.nextLine();
            System.out.println("**********************************************************************");

            //input.close();
        }

    }
}