package application;

public class PackageC3 extends Package { //Third class package

	public PackageC3(Item cont, SmartPost senderCit, SmartPost dest) {
		priority = 3;
		content.add(cont);
		senderPost = senderCit;
		destination = dest;
		maxDistance = 200;
		maxSize = 100*100*100;
		if(cont.getMass() <= 5) { //Breaks items unless content mass >= 5kg
			breaksItems = true;
		} else {
			breaksItems = false;
		}

	}
}