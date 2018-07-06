import java.awt.*;
public class Car {

    //Data Types:
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 1224.34
    // String -> "a1a2" or "Hello World"
    // Color -> from awt library
    // boolean -> true or false

    double averageMilesPerGallon;
    String licencePlate;
    Color paintColor;
    boolean areTaillightWorking;

    public Car(double inputAverageMPG, String inputLicencePlate, Color inputPaintColor, boolean inputAreTaillightsWorking){
        this.averageMilesPerGallon = inputAverageMPG;
        this.licencePlate = inputLicencePlate;
        this.paintColor = inputPaintColor;
        this.areTaillightWorking = inputAreTaillightsWorking;
    }
    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed += 100;
        return currentSpeed;

    }


}
