import javax.swing.JOptionPane;

public class GuessCapital {
	public static void main(String[] args) {
		String[][] stateCapital = {
      		{"Alabama", "Montgomery"},
      		{"Alaska", "Juneau"},
      		{"Arizona", "Phoenix"},
      		{"Arkansas", "Little Rock"},
     		{"California", "Sacramento"},
      		{"Colorado", "Denver"},
      		{"Connecticut", "Hartford"},
      		{"Delaware", "Dover"},
      		{"Florida", "Tallahassee"},
      		{"Georgia", "Atlanta"},
      		{"Hawaii", "Honolulu"},
      		{"Idaho", "Boise"},
      		{"Illinois", "Springfield"},
      		{"Indiana", "Indianapolis"},
      		{"Iowa", "Des Moines"},
      		{"Kansas", "Topeka"},
      		{"Kentucky", "Frankfort"},
      		{"Louisiana", "Baton Rouge"},
      		{"Maine", "Augusta"},
      		{"Maryland", "Annapolis"},
      		{"Massachusettes", "Boston"},
      		{"Michigan", "Lansing"},
      		{"Minnesota", "Saint Paul"},
      		{"Mississippi", "Jackson"},
      		{"Missouri", "Jefferson City"},
      		{"Montana", "Helena"},
      		{"Nebraska", "Lincoln"},
      		{"Nevada", "Carson City"},
      		{"New Hampshire", "Concord"},
      		{"New Jersey", "Trenton"},
      		{"New York", "Albany"},
      		{"New Mexico", "Santa Fe"},
      		{"North Carolina", "Raleigh"},
      		{"North Dakota", "Bismark"},
      		{"Ohio", "Columbus"},
      		{"Oklahoma", "Oklahoma City"},
      		{"Oregon", "Salem"},
      		{"Pennslyvania", "Harrisburg"},
      		{"Rhode Island", "Providence"},
      		{"South Carolina", "Columbia"},
      		{"South Dakota", "Pierre"},
      		{"Tennessee", "Nashville"},
      		{"Texas", "Austin"},
      		{"Utah", "Salt Lake City"},
      		{"Vermont", "Montpelier"},
      		{"Virginia", "Richmond"},
      		{"Washington", "Olympia"},
      		{"West Virginia", "Charleston"},
      		{"Wisconsin", "Madison"},
      		{"Wyoming", "Cheyenne"}
    	};

    	int correctAnswers = 0;
    	for (int i = 0; i < stateCapital.length; i++) {
    		String answerString = JOptionPane.showInputDialog(
    			"What is th capital of " + stateCapital[i][0] + " ?");
    		if (answerString.equals(stateCapital[i][1])) {
    			JOptionPane.showMessageDialog(null, "Your answer is correct");
    			correctAnswers++;
    		}
    		else {
    			JOptionPane.showMessageDialog(null, "Your answer is wrong\nThe capital of " 
    				+ stateCapital[i][0] + " is " + stateCapital[i][1]);
    		}
    	}
	}
}