
public class Television {

	int state;						//Instance members
	private int currentVol;
	private int currentChannel;
	
		int increaseVolume(int cVolume)		//Function to increase Volume
		{
			
			currentVol=currentVol+cVolume;
			return currentVol;
		}
		int decreaseVolume(int cVolume)			//Function to decrease Volume
		{
			currentVol=currentVol-cVolume;
			return currentVol;
		}
		void changeChannel(int cC)			//Function to changeChannel
		{
			currentChannel=cC;
		}
		void onOff()
		{
		if(state==0)
			state=1;
		else
			state=0;
		}
	}

