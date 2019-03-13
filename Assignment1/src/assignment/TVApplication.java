package assignment;

import java.util.Scanner;

public class TVApplication {

	public static void main(String[] args) 
	{
		Television tv = new Television();
		RemoteControl rc = new RemoteControl(tv);
		
		System.out.println(tv.toString() + "\n");
		
		int button = 0;
		
		while (button != 6)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Press a button on the Remote Control");
			System.out.println("1. Power 2. Volume Up by 50% 3. Volume Down by 50% 4. Channel Up 5. Channel Down 6. Go outside");
			button = keyboard.nextInt();
			
			if (button == 1)
			{
				rc.powerButton();
				System.out.println("Power Button Pressed");
			}
			else if (button == 2)
			{
				rc.volumeUpByHalf();
				System.out.println("Volume Up by 50% Button Pressed");
			}
			else if (button == 3)
			{
				rc.volumeDownByHalf();
				System.out.println("Volume Down by 50% Button Pressed");
			}
			else if (button == 4)
			{
				rc.channelUpButton();
				System.out.println("Channel Up Button Pressed");
			}
			else if (button == 5)
			{
				rc.channelDownButton();
				System.out.println("Channel Down Button Pressed");
			}
			
			if (button != 6)
			{
				System.out.println("\n" + tv.toString() + "\n");
			}
		}
	}
}
