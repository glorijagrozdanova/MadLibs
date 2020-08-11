import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MadLibs {
	Scanner sc = new Scanner(System.in); //this will allow us to take input from the user
	String story;
	String name;
	String adjective1;
	String adjective2;
	String noun1;
	String noun2;
	String noun3;
	String adverb;
	String randomNums;
	Random rand = new Random();
	//Getters!
	public String getStory()
	{
		return story;
	}
	
	

	public String getName() {
		return name;
	}



	public String getAdjective1() {
		return adjective1;
	}



	public String getAdjective2() {
		return adjective2;
	}



	public String getNoun1() {
		return noun1;
	}



	public String getNoun2() {
		return noun2;
	}



	public String getNoun3() {
		return noun3;
	}



	public String getAdverb() {
		return adverb;
	}



	public String getRandomNums() {
		return randomNums;
	}

	//Setters



	public void setStory(String story) {
		this.story = story;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setAdjective1(String adjective1) {
		this.adjective1 = adjective1;
	}



	public void setAdjective2(String adjective2) {
		this.adjective2 = adjective2;
	}



	public void setNoun1(String noun1) {
		this.noun1 = noun1;
	}



	public void setNoun2(String noun2) {
		this.noun2 = noun2;
	}



	public void setNoun3(String noun3) {
		this.noun3 = noun3;
	}



	public void setAdverb(String adverb) {
		this.adverb = adverb;
	}



	public void setRandomNums() {
		int num = Math.abs(rand.nextInt()) % 100;
		int index = 0;
		int [] numberHolder = new int[3];
		while(index < numberHolder.length)
		{
			numberHolder[index] = num + index;
			index ++;
		}
		randomNums = "not " + numberHolder[0] + " not "+ numberHolder[1] + ", but " + numberHolder[2];
	}
	
	public void printInstructions()
	{
		System.out.println("Welcome to the MadLibs game! If you type in words, we'll give you a story!"
				+ "Start by typing in a name.");
	}
	
	public void putTogetherTheStory()
	{
		String story;
		
			story = "Jesse and her best friend " + getName() + " went to DisneyWorld today."
					 + "they saw a "+ getNoun1() + " in a show at the Magic Kingdom " +
							"and ate a " + getAdjective1() + " feast for dinner. The next day I " +
					 "ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2() +
					 " and then that night I gazed at the " + getRandomNums() + 
					 " " + getAdjective2() + " fireworks shootings from the " + getNoun3() +
					 ".";
		
		
		
		setStory(story);
	}
	public void enterName()
	{
		setName(sc.nextLine());
	}
	public void enterNoun1()
	{
		System.out.println("Give me a noun.");
		setNoun1(sc.nextLine());
	}
	public void enterNoun2()
	{
		System.out.println("Give me another noun.");
		setNoun2(sc.nextLine());
	}
	public void enterNoun3()
	{
		System.out.println("Give me the last noun.");
		setNoun3(sc.nextLine());
	}
	public void enterAdjective1()
	{
		System.out.println("Give me an adjective.");
		setAdjective1(sc.nextLine());
	}
	public void enterAdjective2()
	{
		System.out.println("Give me another adjective.");
		setAdjective2(sc.nextLine());
	}
	public void enterAdverb()
	{
		System.out.println("Give me an adverb.");
		setAdverb(sc.nextLine());
	}
	public void play()
	{
		enterName();
		enterNoun1();
		enterAdjective1();
		enterAdjective2();
		enterNoun2();
		enterAdverb();
		enterNoun3();
		setRandomNums();
		putTogetherTheStory();
		System.out.println(getStory());
	}
	public static void main(String [] args) throws IOException
	{
		MadLibs game = new MadLibs();
		game.printInstructions();
		game.play();
	}
}
