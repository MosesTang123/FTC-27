package org.firstinspires.ftc.FTC26_11052base.OpMode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class idk {

    public DcMotor shooter;

    public DcMotor intake;
    public Servo transfer;
    public Servo blocker;

    private OpMode opMode;

    public void init (HardwareMap hw, OpMode opMode){
        this.opMode = opMode;
        intake=hw.get(DcMotorEx.class,"intake");
        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        shooter=hw.get(DcMotorEx.class,"shooter");
        shooter.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        transfer=hw.servo.get("transfer");
       transfer.setPosition(0);
        blocker=hw.servo.get("adjust");
        blocker.setPosition(0);
    }
    public void a (double speed ,double power,double zero){


        if (opMode.gamepad1.right_bumper) {
            intake.setPower(speed);
            shooter.setPower(power);
        }
        else if (opMode.gamepad1.left_bumper) {
            intake.setPower(zero);
            shooter.setPower(zero);
        }


}

public void servo1 (double pos){
    if (opMode.gamepad1.aWasPressed()) {
        transfer.setPosition(pos);
    }
        else if (opMode.gamepad1.bWasPressed()) {
            transfer.setPosition(0);
        }


    }

 public void servo2 (double pos1){
        if (opMode.gamepad1.xWasPressed()) {
            blocker.setPosition(pos1);
        }
        else if (opMode.gamepad1.yWasPressed()) {
                blocker.setPosition(0);



        }


}
}
