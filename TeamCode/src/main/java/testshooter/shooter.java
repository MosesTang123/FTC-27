package testshooter;
import com.pedropathing.math.MathFunctions;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.bylazar.telemetry.PanelsTelemetry;
import com.bylazar.telemetry.TelemetryManager;


public class
shooter {
    public DcMotorEx shooter1;

    public Servo claw;
    private OpMode opMode;
public void init( HardwareMap hw,OpMode opmode){

    shooter1=hw.get(DcMotorEx.class,"shooter");
    shooter1.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
    shooter1.setZeroPowerBehavior();
    claw=hw.get(Servo.class,claw);
    claw.setPosition(0);
}

public void claw{
    if(opMode.gamepad1.left_bumper){
    claw.setPosition(80);
    }else{
        claw.setPosition(0);
    }
public void shooter(double power){
        if (opMode.gamepad1.right_bumper){
            shooter1.setPower(MathFunctions.clamp(power,-1,1));
        }else{
            shooter1.setPower(0);
        }

        }

    }

}