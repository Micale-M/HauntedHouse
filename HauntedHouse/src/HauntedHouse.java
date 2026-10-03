public class HauntedHouse {
    private boolean ghostPresent;
    private int candyCount;

    public HauntedHouse() {
        ghostPresent = true;
        candyCount = 10;
    }

    public boolean isGhostPresent() {
        return ghostPresent;
    }

    public void scareAwayGhost(){ghostPresent = false;}

    public void Haunting() {
        ghostPresent = true;
    }

    public void refillCandyBowl(int amount) {
        if( amount<0){
            candyCount = candyCount;
        } else {
            candyCount += amount;
    }}

    public void RunningLow(){
        if(candyCount == 0) {
            refillCandyBowl(10);
        }
    }

    public void trickOrTreat(int people){
        if(people<0){
            return;
        }
        if (people > candyCount){
            candyCount = 0;
            //this.RunningLow();
        } else {
        candyCount = candyCount - people;
    }}

    public void ImprovedtrickOrTreat(int people){
        if(people<0){
            return;
        }
        if (people > candyCount){
            candyCount = 0;
            //this.RunningLow();
        } else {
            candyCount = candyCount - people;
        }this.RunningLow();}

    public int getCandyCount() {
        return candyCount;
    }

    public String spookySound() {
        return "Boo!";
    }

    @Override
    public String toString() {
        String result = "The house ";

        if(isGhostPresent()) {
            result += "is haunted by a Ghost and ";
        }
        result += "has " + candyCount + " candy.";
        return result;
    }
}

