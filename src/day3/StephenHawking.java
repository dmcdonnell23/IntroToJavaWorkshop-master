package day3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
	public static void main(String[] args) {
	
	// 1. make a main method and put steps 2, 3 & 4 inside it
	String sentence;
	// 2. ask the user for a sentence
		
	// 4. repeat steps 2 and 3 a lot of times
for(int i=0;i<3;i++) {sentence=JOptionPane.showInputDialog("please type a sentence");
	// 3. call the speak method below and send it the sentence
speak(sentence);
	
}
	}

	
	
	
	
	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
	}

}
