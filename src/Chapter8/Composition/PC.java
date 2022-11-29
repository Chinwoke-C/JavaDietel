package Chapter8.Composition;

public class PC {

   private Case theCase;
   private Monitor monitor;
   private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitors, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitors;
        this.motherBoard = motherBoard;
    }
public  void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        bootUp();
}
public void drawLogo(){
//        fancy graphics
    monitor.drawPixelAt(1200, 50, "yellow");
    }
    public void bootUp(){
        motherBoard.loadProgram("Windows 11");
    }
}
